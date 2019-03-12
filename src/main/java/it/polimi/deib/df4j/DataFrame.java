package it.polimi.deib.df4j;

import it.polimi.deib.df4j.schema.Schema;
import org.apache.calcite.linq4j.Enumerable;
import org.jooq.lambda.tuple.Tuple;

public interface DataFrame<T extends Tuple> {

    Enumerable<T> asEnumberable();

    DataFrame select(String k);

    DataFrame project(String... k);

    DataFrame join(DataFrame right, String keyin, String keyout);

    DataFrame join(DataFrame right, String key);

    DataFrame merge(DataFrame right, String left_on, String right_on);

    Schema schema();
}
