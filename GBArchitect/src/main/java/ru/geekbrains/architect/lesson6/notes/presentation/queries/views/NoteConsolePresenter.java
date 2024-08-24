package main.java.ru.geekbrains.architect.lesson6.notes.presentation.queries.views;

import main.java.ru.geekbrains.architect.lesson6.notes.core.domain.Note;
import main.java.ru.geekbrains.architect.lesson6.notes.core.interfaces.NotesPresenter;

import java.util.Collection;

public class NoteConsolePresenter implements NotesPresenter {


    @Override
    public void printAll(Collection<Note> notes) {
        for (Note note : notes) {
            System.out.println(note);
        }
    }
}
