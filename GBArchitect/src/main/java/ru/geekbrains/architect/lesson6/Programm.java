package main.java.ru.geekbrains.architect.lesson6;

import main.java.ru.geekbrains.architect.lesson6.database.NotesDatabase;
import main.java.ru.geekbrains.architect.lesson6.notes.core.application.ConcreteNoteEditor;
import main.java.ru.geekbrains.architect.lesson6.notes.infrastructure.persistance.NotesDbContext;
import main.java.ru.geekbrains.architect.lesson6.notes.presentation.queries.controllers.NotesController;
import main.java.ru.geekbrains.architect.lesson6.notes.presentation.queries.views.NoteConsolePresenter;

public class Programm {
    public static void main(String[] args) {
        NotesController notesController = new NotesController(
                new ConcreteNoteEditor(new NotesDbContext(new NotesDatabase()), new NoteConsolePresenter())
        );
        notesController.routeGetAll();
    }
}
