package main.java.ru.geekbrains.architect.lesson2.factoryMethod;

import main.java.ru.geekbrains.architect.lesson2.templateMethod.LogReader;
import main.java.ru.geekbrains.architect.lesson2.templateMethod.PoemReader;

public class ConcreteReaderCreator extends BaseLogReaderCreator{
    @Override
    protected LogReader createLogReaderInstance(LogType logType) {

        return switch (logType) {
            case Poem -> new PoemReader();
            case Text -> new TextFileReader();
            case Database -> new DatabaseReader();
            case System -> new OSLogReader();
        };
    }
}
