package main.java.ru.geekbrains.architect.lesson2.Singletone;

public class SingletoneClass {
    private SingletoneClass instance;
    private Object data;

    private SingletoneClass(Object data) {
    }

    public SingletoneClass getInstance(Object data) {
        if (instance == null) {
            instance = new SingletoneClass(data);
        }
        return instance;
    }

}
