package main.java.ru.geekbrains.architect.lesson4.task2;

/**
 * Дилер
 */
public class DealerProvider {

    private final FactoryProvider factoryProvider;

    public DealerProvider(FactoryProvider factoryProvider) {
        this.factoryProvider = factoryProvider;
    }

    /**
     *
     * @param id
     * @return
     */
    public ComponentInfo getComponent(int id) {

        //Предусловие

//        if (id < 0 || String.valueOf(id).length() < 3) {
//            throw new RuntimeException("Некорректный номер детали");
//        }

        //Выполнение кода программы

        ComponentInfo componentInfo =  factoryProvider.getComponentInfo(id);

        //Постуслове

        if (componentInfo == null) {
            throw new RuntimeException("Деталь не найдена");
        }

        return componentInfo;
    }
}
