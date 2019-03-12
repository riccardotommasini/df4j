package it.polimi.deib.df4j.schema;

import java.util.Collection;
import java.util.HashSet;
import java.util.Set;

public interface Schema {

    // TODO i can use this to reduce the overhead around StreamItem
    Schema UNKNOWN = new Schema() {

        @Override
        public Set<SchemaEntry> entrySet() {
            return new HashSet<>();
        }

        @Override
        public String lookup(String ki) {
            return "";
        }

        @Override
        public Schema merge(Schema schema) {
            return schema;
        }

        @Override
        public String toString() {
            return "UNKNOWN";
        }
    };

    default Class getType() {
        return Object.class;
    }

    Set<SchemaEntry> entrySet();

    String lookup(String ki);

    Schema merge(Schema schema);

    class Factory {

        private static HashSet<Schema> registered_schemas;

        static {

            registered_schemas = new HashSet<>();
        }

        public static Schema wrap(Class c) {
            for (Schema s : registered_schemas) {
                if (c.isAssignableFrom(s.getType()) || s.getType().isAssignableFrom(c)) {
                    return s;
                }
            }
            return UNKNOWN;
        }

        public static void registerSchema(Schema s) {
            registered_schemas.add(s);
        }

    }
}
