package main.java.ru.geekbrains.architect.lesson6.notes.presentation.queries.views;

import main.java.ru.geekbrains.architect.lesson6.notes.core.domain.Note;

import java.util.Collection;

public interface Presenter {

    void printAll(Collection<Note> notes);
}
