package main.java.ru.geekbrains.architect.lesson5;

/**
 * Настройки проекта
 */

public class ProjectFile {

    private String fileName;
    private int setting1;
    private String setting2;
    private boolean setting3;

    public String getFileName() {
        return fileName;
    }

    public int getSetting1() {
        return setting1;
    }

    public String getSetting2() {
        return setting2;
    }

    public boolean getSetting3() {
        return setting3;
    }

    public ProjectFile(String fileName) {

        this.fileName = fileName;
        //TODO: Загрузка насроек проекта из файла ..

        setting1 = 1;
        setting2 = "...";
        setting3 = false;
    }
}
