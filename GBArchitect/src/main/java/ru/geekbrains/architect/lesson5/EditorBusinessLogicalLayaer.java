package main.java.ru.geekbrains.architect.lesson5;

import main.java.ru.geekbrains.architect.lesson5.database.DatabaseAccess;
import main.java.ru.geekbrains.architect.lesson5.entity.Model3D;
import main.java.ru.geekbrains.architect.lesson5.entity.Texture;

import java.util.Collection;
import java.util.Random;

/**
 * Реализация BLL (Business Logical Layer)
 */

public class EditorBusinessLogicalLayaer implements BusinessLogicalLayer {

    private Random random = new Random();


    private DatabaseAccess databaseAccess;

    public EditorBusinessLogicalLayaer(DatabaseAccess databaseAccess) {
        this.databaseAccess = databaseAccess;
    }

    @Override
    public Collection<Model3D> getAllModels() {
        return databaseAccess.getAllModels();
    }

    @Override
    public Collection<Texture> getAllTextures() {
        return databaseAccess.getAllTextures();
    }

    @Override
    public void renderModel(Model3D model3D) {
        processsRender(model3D);
    }

    @Override
    public void renderAllModels() {
        for (Model3D model3D : databaseAccess.getAllModels()) {
            processsRender(model3D);
        }
    }

    private void processsRender(Model3D model3D) {
        try {

            Thread.sleep(2500 - random.nextInt(2000));
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
