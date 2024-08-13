package main.java.ru.geekbrains.architect.lesson2.factoryMethod;

import main.java.ru.geekbrains.architect.lesson2.templateMethod.LogReader;

public abstract class BaseLogReaderCreator {

    protected LogReader createLogReader(LogType logType, Object data) {
        LogReader logReader = createLogReaderInstance(logType);
        //TODO: Выполнение подготовительных действий
        logReader.setDataSource(data);
        logReader.setCurrentPosition(2);


        return logReader;

    }

    protected abstract LogReader createLogReaderInstance(LogType logType);

}
