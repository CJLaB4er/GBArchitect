package main.java.ru.geekbrains.architect.lesson5.database;

import main.java.ru.geekbrains.architect.lesson5.entity.Entity;
import main.java.ru.geekbrains.architect.lesson5.entity.Model3D;
import main.java.ru.geekbrains.architect.lesson5.entity.Texture;

import java.util.Collection;

/**
 * Интерфейс Database Access
 */

public interface DatabaseAccess {

    Collection<Texture> getAllTextures();

    Collection<Model3D> getAllModels();

    void addEntity(Entity entity);

    void removeEntity(Entity entity);


}
