package main.java.ru.geekbrains.architect.lesson4.task1;

import java.io.File;
import java.util.ArrayList;
import java.util.Collection;

public class ProductService implements Readable {
    private ArrayList<String> res;

    public void process1() {

    }

    public void process2() {

    }

    public Collection<String> readTextFile(File file) throws RuntimeException {


        //Предусловие
        if (file.exists()) {
            if (file.length() > 5000) {
                throw new RuntimeException("Размер файла более 5мб. Чтение файла запрещено.");
            }
        } else {
            throw new RuntimeException("Файл не найден.");
        }


        //region РАБОТА С ДАННЫМИ

        res = new ArrayList<>();
        res.add("String1");
        res.add("String2");

        process1();

        //Инвариант
        validateResult(res);

        process2();

        //Инвариант
        validateResult(res);

        //Постусловие

        if (res == null) {
            throw new RuntimeException("Ошибка обработки данных");
        }

        //endregion

        return res;

    }

    private void validateResult(Collection<String> res) {
        if (res == null || res.size() == 0) {
            throw new RuntimeException("Некорректное состояние объекта");
        }
    }
}
