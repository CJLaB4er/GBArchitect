package main.java.ru.geekbrains.architect.lesson2.templateMethod;

import java.util.ArrayList;
import java.util.List;

/**
 * Основа работы алгоритма чтения данных
 */

public abstract class LogReader {

    private int currentPosition = 0;

    public int getCurrentPosition() {
        return currentPosition;
    }

    public void setCurrentPosition(int currentPosition) {
        this.currentPosition = currentPosition;
    }

    public Iterable<LogEnrty> readLogEntry() {
        List<LogEnrty> logList = new ArrayList<>();

        for (String str : readEntries(currentPosition)) {
            logList.add(parseLogEntry(str));
        }
        return logList;
    }

    public abstract Object getDataSource();

    public abstract void setDataSource(Object data);

    protected abstract Iterable<String> readEntries(Integer position);

    protected abstract LogEnrty parseLogEntry(String stringEntry);

}
