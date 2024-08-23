package main.java.ru.geekbrains.architect.lesson5.database;

import main.java.ru.geekbrains.architect.lesson5.entity.Entity;
import main.java.ru.geekbrains.architect.lesson5.entity.Model3D;
import main.java.ru.geekbrains.architect.lesson5.entity.Texture;

import java.util.ArrayList;
import java.util.Collection;

/**
 * Имплементация Database Access
 */
public class EditorDatabaseAccess implements DatabaseAccess{

    private final Database editorDatabase;

    public EditorDatabaseAccess(Database editorDatabase) {
        this.editorDatabase = editorDatabase;
    }

    @Override
    public Collection<Texture> getAllTextures() {
        Collection<Texture> textures = new ArrayList<>();
        for (Entity entity : editorDatabase.getAll()) {
            if (entity instanceof Texture) {
                textures.add((Texture) entity);
            }
        }
        return textures;
    }

    @Override
    public Collection<Model3D> getAllModels() {
        Collection<Model3D> models = new ArrayList<>();
        for (Entity entity : editorDatabase.getAll()) {
            if (entity instanceof Model3D) {
                models.add((Model3D) entity);
            }
        }
        return models;
    }

    @Override
    public void addEntity(Entity entity) {
        editorDatabase.getAll().add(entity);
    }

    @Override
    public void removeEntity(Entity entity) {
        editorDatabase.getAll().remove(entity);

    }
}
