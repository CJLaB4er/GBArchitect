package main.java.ru.geekbrains.architect.lesson6.notes.infrastructure.persistance;

import main.java.ru.geekbrains.architect.lesson6.database.NotesDatabase;
import main.java.ru.geekbrains.architect.lesson6.database.NotesRecord;
import main.java.ru.geekbrains.architect.lesson6.notes.core.domain.Note;
import main.java.ru.geekbrains.architect.lesson6.notes.core.interfaces.NotesDatabaseContext;
import main.java.ru.geekbrains.architect.lesson6.notes.infrastructure.persistance.cofigurations.NoteConfiguration;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class NotesDbContext extends DBContext implements NotesDatabaseContext {

    public NotesDbContext(Database database) {
        super(database);
    }

    @Override
    public void onModelCreating(ModelBuilder builder) {
        builder.applyConfiguration(new NoteConfiguration());
    }

    @Override
    public Collection<Note> getAll() {

        Collection<Note> noteList = new ArrayList<>();

        //TODO: Этого кастиега быть не должно, тут должен работать внутрений механизм фреймворка
        for (NotesRecord record : ((NotesDatabase) database).getNotesTable().getRecords()) {
            noteList.add(new Note(
                    record.getId(),
                    record.getUserId(),
                    record.getTitle(),
                    record.getDetails(),
                    record.getCreationDate()
            ));
        }
        return noteList;
    }
}
