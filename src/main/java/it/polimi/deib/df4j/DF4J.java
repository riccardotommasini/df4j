package it.polimi.deib.df4j;

import it.polimi.deib.df4j.schema.Schema;
import org.apache.calcite.linq4j.Enumerable;
import org.apache.calcite.linq4j.function.Function1;

import java.lang.reflect.InvocationTargetException;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

public class DF4J {

    public static final Function1<String, Function1> REFLECTIVE_FIELD_SELECTOR =
            (f) -> (Function1) o -> {
                try {
                    return o.getClass().getField(f).get(o);
                } catch (IllegalAccessException | NoSuchFieldException e) {
                    throw new RuntimeException(e.getMessage());
                }
            };

    public static final Function1<String, Function1> REFLECTIVE_METHOD_SELECTOR =
            (f) -> (Function1) o -> {
                try {
                    return o.getClass().getMethod(f).invoke(o);
                } catch (IllegalAccessException | NoSuchMethodException | InvocationTargetException e) {
                    throw new RuntimeException(e.getMessage());
                }
            };



    public static DataFrame create(Schema schema, Enumerable v1) {
        return new DataFrameImpl(v1, schema);
    }

    public static Object create(Object v1, Object v2) {

        Map<String, Object> o = new HashMap<>();

        invokeMethod(v1, o);
        accessField(v1, o);

        invokeMethod(v2, o);
        accessField(v2, o);

        return o;
    }

    private static void invokeMethod(Object v1, Map<String, Object> o) {
        Arrays.stream(v1.getClass().getMethods()).filter(method -> method.getName().startsWith("get")).forEach(method -> {
            try {
                o.put(method.getName().replace("get", ""), method.invoke(v1));
            } catch (IllegalAccessException | InvocationTargetException e) {
                e.printStackTrace();
            }
        });
    }

    private static void accessField(Object v1, Map<String, Object> o) {
        Arrays.stream(v1.getClass().getFields()).forEach(field -> {
            try {
                o.put(field.getName(), field.get(v1));
            } catch (IllegalAccessException e) {
                e.printStackTrace();
            }
        });
    }

    public static DataFrame create(Object[] v) {
        return new DataFrameImpl(v);
    }

    public static DataFrame create(Collection v) {
        return new DataFrameImpl(v);
    }

    public static DataFrame create(Enumerable v) {
        return new DataFrameImpl(v);
    }
}
