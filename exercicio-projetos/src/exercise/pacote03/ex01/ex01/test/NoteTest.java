package exercise.pacote03.ex01.ex01.test;

import exercise.pacote03.ex01.ex01.domain.Note;
import exercise.pacote03.ex01.ex01.domain.NoteManager;

public class NoteTest {

    public static void main(String[] args) {

        Note note1 = new Note("My Life", "Is this my life, and I leave in a small house, with my family, my dogs also is my family");
        Note note2 = new Note("My Life 2", "My life is beautiful, because I have a good family");

        NoteManager.saveNote(note1);
        NoteManager.saveNote(note2);
        NoteManager.readNotes();
    }
}
