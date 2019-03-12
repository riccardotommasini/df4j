package it.polimi.deib.df4j;

import it.polimi.deib.df4j.schema.BaseSchema;
import it.polimi.deib.df4j.schema.ReflectiveSchemaEntryFactory;
import it.polimi.deib.df4j.schema.Schema;
import it.polimi.deib.df4j.schema.SchemaEntry;
import org.apache.calcite.linq4j.Enumerable;
import org.apache.calcite.linq4j.Linq4j;

import java.util.Arrays;
import java.util.Collection;
import java.util.Set;

import static it.polimi.deib.df4j.DF4J.REFLECTIVE_FIELD_SELECTOR;

public class DataFrameImpl implements DataFrame {

    private final Enumerable e;
    private final Schema schema;

    public DataFrameImpl(Collection c, Schema schema) {
        this.e = Linq4j.asEnumerable(c);
        this.schema = new BaseSchema(ReflectiveSchemaEntryFactory.create(e.first().getClass()));
    }

    public DataFrameImpl(Collection c) {
        this.e = Linq4j.asEnumerable(c);
        this.schema = new BaseSchema(ReflectiveSchemaEntryFactory.create(e.first().getClass()));
    }

    public DataFrameImpl(Object[] c) {
        this.e = Linq4j.asEnumerable(c);
        this.schema = new BaseSchema(ReflectiveSchemaEntryFactory.create(e.first().getClass()));
    }

    public DataFrameImpl(Enumerable e, Schema schema) {
        this.e = e;
        this.schema = schema;
    }

    public DataFrameImpl(Enumerable e) {
        this(e, new BaseSchema(ReflectiveSchemaEntryFactory.create(e.first().getClass())));
    }

    @Override
    public Enumerable asEnumberable() {
        return e;
    }

    @Override
    public DataFrame select(String k) {
        return DF4J.create(this.e.select(REFLECTIVE_FIELD_SELECTOR.apply(k)));
    }

    @Override
    public DataFrame project(String... k) {
        return null;
    }


    @Override
    public DataFrame join(DataFrame right, String ki, String ko) {
        Schema merge = this.schema().merge(right.schema());


        Enumerable join = this.asEnumberable().join(
                right.asEnumberable(),
                REFLECTIVE_FIELD_SELECTOR.apply(schema.lookup(ki)),
                REFLECTIVE_FIELD_SELECTOR.apply(right.schema().lookup(ko))
                , DF4J::create);
        return DF4J.create(merge, join);
    }

    @Override
    public DataFrame join(DataFrame right, String key) {
        return join(right, key, key);
    }

    @Override
    public DataFrame merge(DataFrame right, String left_on, String right_on) {
        return null;
    }

    @Override
    public Schema schema() {
        return schema;
    }


    @Override
    public String toString() {
        return Arrays.deepToString(e.toList().toArray());
    }
}
