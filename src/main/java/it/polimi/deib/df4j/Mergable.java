package it.polimi.deib.df4j;

public interface Mergable {

    <T,O> O merge(T o);
}
