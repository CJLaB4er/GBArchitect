package main.java.ru.geekbrains.architect.lesson4.task2;

import java.util.ArrayList;

/**
 * Завод по производству деталей
 */
public class FactoryProvider {
    private ArrayList<ComponentInfo> components = new ArrayList<>();

    {
        for (int i = 0; i < 10; i++) {
            components.add(new ComponentInfo(900 + i, String.format("Component description %d", 900 + i)));
        }

        for (int i = 0; i < 10; i++) {
            components.add(new ComponentInfo(1000 + i, String.format("Component description %d", 1000 + i)));
        }
    }

    /**
     * Получить информайию о детали по идентификатору
     *
     * @param id Идентификатор детали
     * @throws RuntimeException исключение при обработке операции поиска
     * @return информация о детали
     */
    public ComponentInfo getComponentInfo(int id) throws RuntimeException{
        //Предусловие
        if (id < 0) {
            throw new RuntimeException("Некорректный номер детали");
        }
        if (String.valueOf(id).length() < 3) {
            throw new RuntimeException("Неккоректный номер детали. Деталь существует, но больше не производится.");
        }

        // Выполнение основоного кода подпрограммы
        ComponentInfo searchComponent = null;
        for (ComponentInfo componentInfo : components) {
            if (componentInfo.getId() == id) {
                searchComponent = componentInfo;
                break;
            }
        }

        //Постусловие
//        if (searchComponent == null) {
//            throw new RuntimeException("Деталь не найдена");
//        }

        return searchComponent;
    }

}
