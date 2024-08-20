package main.java.ru.geekbrains.architect.lesson4.task1;

import java.io.File;
import java.util.Collection;

/**
 * Позволяет считывать данные
 */

public interface Readable {
    /**
     * Считывание и обработка данных
     * @param file файл
     * @return коллекция данных
     * @throws RuntimeException исключение при обработке файла
     */
    public Collection<String> readTextFile(File file) throws RuntimeException;
}
