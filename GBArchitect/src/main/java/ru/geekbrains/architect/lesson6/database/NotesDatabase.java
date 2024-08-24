package main.java.ru.geekbrains.architect.lesson6.database;

import main.java.ru.geekbrains.architect.lesson6.notes.infrastructure.persistance.Database;

public class NotesDatabase implements Database {
    private NotesTable notesTable;

    public NotesTable getNotesTable() {
        if (notesTable == null) {
            notesTable = new NotesTable();
        }
        return notesTable;
    }
}
