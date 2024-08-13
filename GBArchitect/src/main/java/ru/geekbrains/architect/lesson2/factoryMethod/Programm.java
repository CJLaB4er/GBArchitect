package main.java.ru.geekbrains.architect.lesson2.factoryMethod;

import main.java.ru.geekbrains.architect.lesson2.templateMethod.LogEnrty;
import main.java.ru.geekbrains.architect.lesson2.templateMethod.LogReader;

public class Programm {

    public static String data = """
            У лукоморья дуб зелёный;
            Златая цепь на дубе том:
            И днём и ночью кот учёный
            Всё ходит по цепи кругом;
            Идёт направо - песнь заводит,
            Налево - сказку говорит.
            """;

    public static void main(String[] args) {
        LogReader logReader = new ConcreteReaderCreator()
                .createLogReader(LogType.Poem, data);
        for (LogEnrty log : logReader.readLogEntry()) {
            System.out.println(log.getText());
        }
    }
}
