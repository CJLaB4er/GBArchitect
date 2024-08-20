package main.java.ru.geekbrains.architect.lesson4.task3;

public class CustumerProvider {

    private Database database;

    public CustumerProvider(Database database) {
        this.database = database;
    }

    public Custumer getCustumer(String login, String pass) {
        return new Custumer();
    }
}
