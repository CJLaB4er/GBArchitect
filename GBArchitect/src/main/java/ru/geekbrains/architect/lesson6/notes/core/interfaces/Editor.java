package main.java.ru.geekbrains.architect.lesson6.notes.core.interfaces;

import java.util.Collection;
import java.util.Optional;

public interface Editor<T, Tid> {

    boolean add(T item);

    boolean edit(T item);

    boolean remove(T item);

    Optional<T> getById(Tid id);

    Collection<T> getAll();

}
