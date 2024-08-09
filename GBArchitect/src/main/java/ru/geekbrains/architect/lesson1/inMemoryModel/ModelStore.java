package main.java.ru.geekbrains.architect.lesson1.inMemoryModel;

import main.java.ru.geekbrains.architect.lesson1.modelElements.Camera;
import main.java.ru.geekbrains.architect.lesson1.modelElements.Flash;
import main.java.ru.geekbrains.architect.lesson1.modelElements.PoligonModel;
import main.java.ru.geekbrains.architect.lesson1.modelElements.Scene;

import java.util.ArrayList;
import java.util.List;

public class ModelStore implements ModelChanger, ModelChangeObserver {
    private List<ModelChangeObserver> observers = new ArrayList<>();
    private List<PoligonModel> models = new ArrayList<>();
    private List<Flash> flashes = new ArrayList<>();
    private List<Scene> scenes = new ArrayList<>();
    private List<Camera> cameras = new ArrayList<>();


    public void add(PoligonModel model) {
        models.add(model);
        notifyChange();
    }

    @Override
    public void notifyChange() {

    }

    @Override
    public void applyUpdateModel() {
        for (ModelChangeObserver observer : observers) {
            observer.applyUpdateModel();
        }
    }

    public Scene getScene(int nubmerScene) {
        return scenes.get(nubmerScene);
    }

}
