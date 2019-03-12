package it.polimi.deib.df4j.schema;

public interface SchemaEntry {

    String getID();

    String getTypeName();

    int getIndex();

    int getType();

    boolean canNull();
}
