package main.java.ru.geekbrains.architect.lesson6.database;

import java.util.Date;

public class NotesRecord {
    private int id;
    private int userId;
    private String title;
    private String details;
    private Date creationDate;
    private Date editDate;
    private static int counter = 1_000;

    {
        id = ++counter;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setDetails(String details) {
        this.details = details;
    }

    public void setEditDate(Date editDate) {
        this.editDate = editDate;
    }

    public int getId() {
        return id;
    }

    public int getUserId() {
        return userId;
    }

    public String getTitle() {
        return title;
    }

    public String getDetails() {
        return details;
    }

    public Date getCreationDate() {
        return creationDate;
    }

    public Date getEditDate() {
        return editDate;
    }

    public NotesRecord(String title, String details) {
        this.title = title;
        this.details = details;
    }
}
