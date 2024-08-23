package main.java.ru.geekbrains.architect.lesson5;

import main.java.ru.geekbrains.architect.lesson5.entity.Model3D;
import main.java.ru.geekbrains.architect.lesson5.entity.Texture;

import java.util.Collection;

/**
 * Интерфейс BLL (business Logical Layer)
 */

interface BusinessLogicalLayer {
    Collection<Model3D> getAllModels();

    Collection<Texture> getAllTextures();

    void renderModel(Model3D model3D);

    void renderAllModels();

    void removeModel(Model3D model3D);
}
