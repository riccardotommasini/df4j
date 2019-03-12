package it.polimi.deib.df4j.schema;

import java.util.HashSet;
import java.util.Optional;
import java.util.Set;

public class BaseSchema implements Schema {

    private final Set<SchemaEntry> entries;

    public BaseSchema(Set<SchemaEntry> entries) {
        this.entries = entries;
    }

    @Override
    public Set<SchemaEntry> entrySet() {
        return entries;
    }

    @Override
    public String lookup(String ki) {
        Optional<String> first = entries.stream().filter(schemaEntry -> ki.equals(schemaEntry.getID())).map(SchemaEntry::getID).findFirst();
        return first.orElse(ki);
    }

    @Override
    public Schema merge(Schema schema) {
        Set<SchemaEntry> objects = new HashSet<>();
        objects.addAll(entries);
        schema.entrySet().forEach(schemaEntry -> {
            //do not add twice join key
            if (!entries.stream().map(SchemaEntry::getID).anyMatch(s -> s.equals(
                    schemaEntry.getID()))) {
                objects.add(schemaEntry);
            }

        });
        return new BaseSchema(objects);
    }
}
