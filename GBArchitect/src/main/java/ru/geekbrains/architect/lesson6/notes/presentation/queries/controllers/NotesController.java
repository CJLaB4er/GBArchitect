package main.java.ru.geekbrains.architect.lesson6.notes.presentation.queries.controllers;

import main.java.ru.geekbrains.architect.lesson6.notes.core.domain.Note;
import main.java.ru.geekbrains.architect.lesson6.notes.core.interfaces.NoteEditor;

public class NotesController extends Controller {

    private final NoteEditor noteEditor;

    public NotesController(NoteEditor noteEditor) {
        this.noteEditor = noteEditor;
    }

    public void routeAddNote(Note note) {
        this.noteEditor.add(note);
    }

    public void routeRemoveNote(Note note) {
        this.noteEditor.remove(note);
    }

    public void routeGetAll() {
        this.noteEditor.getAll();
    }
}
