package ru.geekbrains.lesson6;


import ru.geekbrains.lesson6.database.NotesDatabase;
import ru.geekbrains.lesson6.notes.core.application.ConcreteNoteEditor;
import ru.geekbrains.lesson6.notes.core.domain.Note;
import ru.geekbrains.lesson6.notes.infrastructure.persistance.NotesDbContext;
import ru.geekbrains.lesson6.notes.presentation.queries.controllers.NotesController;
import ru.geekbrains.lesson6.notes.presentation.queries.views.NotesConsolePresenter;

import java.util.Date;

public class Program {

    public static void main(String[] args) {
        NotesController controller = new NotesController(
                new ConcreteNoteEditor(new NotesDbContext(new NotesDatabase()), new NotesConsolePresenter()));
        controller.routeGetAll();
        controller.routeAddNote(new Note(1,1,"sds", "dsd", new Date()));
//        controller.routeGetAll();
    }

}
