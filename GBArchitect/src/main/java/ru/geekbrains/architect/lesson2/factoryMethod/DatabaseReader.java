package main.java.ru.geekbrains.architect.lesson2.factoryMethod;

import main.java.ru.geekbrains.architect.lesson2.templateMethod.LogEnrty;
import main.java.ru.geekbrains.architect.lesson2.templateMethod.LogReader;

public class DatabaseReader extends LogReader {
    @Override
    public Object getDataSource() {
        return null;
    }

    @Override
    public void setDataSource(Object data) {

    }

    @Override
    protected Iterable<String> readEntries(Integer position) {
        return null;
    }

    @Override
    protected LogEnrty parseLogEntry(String stringEntry) {
        return null;
    }
}
