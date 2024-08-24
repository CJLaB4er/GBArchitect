package main.java.ru.geekbrains.architect.lesson6.notes.core.interfaces;

import main.java.ru.geekbrains.architect.lesson6.notes.core.domain.Note;

import java.util.Collection;

public interface NotesDatabaseContext {

    Collection<Note> getAll();

    boolean saveChanges();
}
