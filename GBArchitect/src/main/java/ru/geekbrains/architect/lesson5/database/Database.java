package main.java.ru.geekbrains.architect.lesson5.database;

import main.java.ru.geekbrains.architect.lesson5.entity.Entity;

import java.util.Collection;

/**
 * Интерфейс БД
 */
public interface Database {
    void load();

    void save();

    Collection<Entity> getAll();

    void remove(Entity entity);
}
