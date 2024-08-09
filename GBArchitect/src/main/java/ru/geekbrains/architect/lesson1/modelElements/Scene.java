package main.java.ru.geekbrains.architect.lesson1.modelElements;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Scene {
    private int count = 0;

    private int id;
    private List<PoligonModel> models = new ArrayList<>();
    private List<Flash> flashes = new ArrayList<>();
    private List<Camera> cameras = new ArrayList<>();

    {
        this.id = ++count;
    }

    public Scene(List<PoligonModel> models, List<Camera> cameras) {
        this.models = models;
        this.cameras = cameras;
    }

    public Scene(List<PoligonModel> models, List<Flash> flashes, List<Camera> cameras) {
        this(models, cameras);
        this.flashes = flashes;
    }

    public Object method1(Object o) {
        return null;
    }

    public Object methd2(Object o1, Object o2) {
        return null;
    }
}
