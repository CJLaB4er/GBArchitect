package main.java.ru.geekbrains.architect.lesson6.notes.infrastructure.persistance;

public abstract class DBContext{

    protected Database database;

    public DBContext(Database database) {
        this.database = database;
    }

    public boolean saveChanges() {
        //TODO: Сохранение в базе данных
        return true;
    }

    public abstract void onModelCreating(ModelBuilder builder);
}
