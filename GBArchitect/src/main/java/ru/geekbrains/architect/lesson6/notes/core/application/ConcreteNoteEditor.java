package main.java.ru.geekbrains.architect.lesson6.notes.core.application;

import main.java.ru.geekbrains.architect.lesson5.EditorBusinessLogicalLayaer;
import main.java.ru.geekbrains.architect.lesson6.notes.core.domain.Note;
import main.java.ru.geekbrains.architect.lesson6.notes.core.interfaces.NoteEditor;
import main.java.ru.geekbrains.architect.lesson6.notes.core.interfaces.NotesDatabaseContext;
import main.java.ru.geekbrains.architect.lesson6.notes.core.interfaces.NotesPresenter;

import java.util.Collection;
import java.util.Date;
import java.util.List;
import java.util.Optional;

public class ConcreteNoteEditor implements NoteEditor {

    private final NotesDatabaseContext notesDatabaseContext;

    private final NotesPresenter notesPresenter;

    public ConcreteNoteEditor(NotesDatabaseContext notesDatabaseContext, NotesPresenter notesPresenter) {
        this.notesDatabaseContext = notesDatabaseContext;
        this.notesPresenter = notesPresenter;
    }

    @Override
    public void printAll() {
        notesPresenter.printAll(getAll());
    }

    @Override
    public boolean add(Note item) {
        notesDatabaseContext.getAll().add(item);
        return notesDatabaseContext.saveChanges();
    }

    @Override
    public boolean edit(Note item) {
        if (item == null) {
            return false;
        }
        Optional<Note> note = getById(item.getId());
        if (note.isEmpty()) {
            return false;
        }
        note.get().setTitle(item.getTitle());
        note.get().setDetails(item.getDetails());
        note.get().setEditDate(new Date());
        return notesDatabaseContext.saveChanges();
    }

    @Override
    public boolean remove(Note item) {
        notesDatabaseContext.getAll().remove(item);
        return notesDatabaseContext.saveChanges();
    }

    @Override
    public Optional<Note> getById(Integer id) {
        return notesDatabaseContext.getAll().stream().filter(p -> p.getId() == id).findFirst();
    }

    @Override
    public Collection<Note> getAll() {
        return notesDatabaseContext.getAll();
    }
}
