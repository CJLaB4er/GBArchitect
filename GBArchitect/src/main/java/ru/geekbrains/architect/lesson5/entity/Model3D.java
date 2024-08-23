package main.java.ru.geekbrains.architect.lesson5.entity;

import java.util.ArrayList;
import java.util.Collection;

/**
 * 3D модель
 */

public class Model3D implements Entity {
    private int counter = 10_000;
    private int id;
    private Collection<Texture> textures = new ArrayList<>();

    @Override
    public int getId() {
        return id;
    }

    {
        id = ++counter;
    }

    public Model3D() {
    }

    public Model3D(Collection<Texture> textures) {
        this.textures = textures;
    }

    @Override
    public String toString() {
        return String.format("3DModel #%d", id);
    }

    public Collection<Texture> getTextures() {
        return textures;
    }
}
