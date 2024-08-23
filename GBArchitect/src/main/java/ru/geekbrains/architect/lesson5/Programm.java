package main.java.ru.geekbrains.architect.lesson5;

import java.util.Scanner;

public class Programm {

    static Scanner scanner = new Scanner(System.in);
    static boolean f = true;

    /**
     * Неоходимо разделить на горизонтальные уровни "Редактор 3D графики".
     * Один пользователь. Программа работает на одном компьютере без выхода в сеть.
     * <p>
     * Что видит пользователь, как взаимодействует? (Панель загрузки, блок редактирования, блок просмотра).
     * Какие задачи можно делать - функции системы? (Загрузить 3D модель, рассмотреть 3D модель, создать ноую,
     * редактировать вершины, текстуры, сделать рендер, сохранить рендер).
     * Какие и где хранятся данные? (файлы 3D моделей, рендеры, анимация .., в файловой системе компьютера).
     * <p>
     * Предложить варианты связывания всех уровней - сценарии использования. 3-4 сценария.
     * Сквозная функция - создать новую 3D модель, сделать рендер для печати на принтере ...
     * <p>
     * HW: реализовать удаление элемента из базы данных
     */

    public static void main(String[] args) {
        Editor3d editor3d = new Editor3d();
        while (f) {
            printMainMenu();
            selectMenu(editor3d);
        }
    }

    static void printMainMenu() {
        System.out.println("*** МОЙ 3D РЕДАКТОР ***");
        System.out.println("=======================");
        System.out.println("1. Открыть проект");
        System.out.println("2. Сохраниить проект");
        System.out.println("3. Отобразить параметры проекта");
        System.out.println("4. Отобразить все модели проекта");
        System.out.println("5. Отобразить все текстуры проекта");
        System.out.println("6. Выполнить рендер всех моделей");
        System.out.println("7. Выполнить рендер модели");
        System.out.println("8. Удалить модель из базы данных");
        System.out.println("0. ЗАВЕРШЕНИЕ РАБОТЫ ПРИЛОЖЕНИЯ");
        System.out.println("Пожалуйта выберите пункт меню: ");
    }

    static void selectMenu(Editor3d editor3d) {
        if (scanner.hasNext()) {
            int no = scanner.nextInt();
            scanner.nextLine();
            try {
                switch (no) {
                    case 0:
                        System.out.println("Завершение работы приложения");
                        f = false;
                        break;
                    case 1:
                        System.out.println("Укажите наименование файла проекта: ");
                        String fileName = scanner.nextLine();
                        editor3d.openProject(fileName);
                        System.out.println("Проект успешно открыт.");
                        break;
                    case 3:
                        editor3d.showProjectSettings();
                        break;
                    case 4:
                        editor3d.printAllModels();
                        break;
                    case 5:
                        editor3d.printAllTextures();
                        break;
                    case 6:
                        editor3d.renderAll();
                        break;
                    case 7:
                        System.out.println("Укажите номер модели: ");
                        if (scanner.hasNextInt()) {
                            int modelNo = scanner.nextInt();
                            scanner.nextLine();
                            editor3d.renderModel(modelNo);
                        } else {
                            System.out.println("Номер модели указан неверно");
                        }
                        break;
                    case 8:
                        editor3d.printAllModels();
                        System.out.println("Укажите номен модели для удаления: ");
                        if (scanner.hasNextInt()) {
                            int modelNo = scanner.nextInt();
                            scanner.nextLine();
                            editor3d.removeModel(modelNo);
                        } else {
                            System.out.println("Номер модели указан неверно");
                        }
                        break;
                    default:
                        System.out.println("Укажите корректный пункт меню");
                }
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
        } else {
            System.out.println("Укажите коректный пункт меню");
            scanner.nextLine();
        }
    }
}
