package main.java.ru.geekbrains.architect.lesson6.notes.core.interfaces;

import main.java.ru.geekbrains.architect.lesson6.notes.core.domain.Note;

public interface NoteEditor extends Editor<Note, Integer> {

    void printAll();
}
