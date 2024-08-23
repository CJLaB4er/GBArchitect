package main.java.ru.geekbrains.architect.lesson5.entity;

/**
 * Текстура
 */

public class Texture implements Entity {

    private static int counter = 50_000;

    private int id;

    {
        id = ++counter;
    }

    @Override
    public int getId() {
        return id;
    }

    @Override
    public String toString() {
        return String.format("Texture $%d", id);
    }
}
