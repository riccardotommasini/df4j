package it.polimi.deib.df4j.schema;


public class SimpleSchemaEntry implements SchemaEntry {

    private final String id;
    private final String type_name;
    private final int index;
    private final int type;
    private final boolean nullable;

    public SimpleSchemaEntry(String id, String type_name, int index, int type, boolean nullable) {
        this.id = id;
        this.type_name = type_name;
        this.index = index;
        this.type = type;
        this.nullable = nullable;
    }

    @Override
    public String getID() {
        return id;
    }

    @Override
    public String getTypeName() {
        return type_name;
    }

    @Override
    public int getIndex() {
        return index;
    }

    @Override
    public int getType() {
        return type;
    }

    @Override
    public boolean canNull() {
        return nullable;
    }
}
