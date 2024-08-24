package main.java.ru.geekbrains.architect.lesson6.notes.core.interfaces;

import main.java.ru.geekbrains.architect.lesson6.notes.core.domain.Note;

import java.util.Collection;

public interface NotesPresenter {

    void printAll(Collection<Note> notes);
}
