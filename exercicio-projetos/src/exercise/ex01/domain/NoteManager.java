package exercise.ex01.domain;

import java.io.*;

public class NoteManager {

    private static File note = new File("note.txt");

    public static void saveNote(Note note) {

        try (FileWriter fileWriter = new FileWriter(NoteManager.note, true)) {

            BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
            bufferedWriter.write(note.format());
            bufferedWriter.flush();
            bufferedWriter.newLine();
        } catch (IOException e) {

            System.out.println("Erro: " + e.getMessage());
        }
    }

    public static void readNotes() {

        try (FileReader fileReader = new FileReader(NoteManager.note)) {

            BufferedReader bufferedReader = new BufferedReader(fileReader);
            String text;

            while ((text = bufferedReader.readLine()) != null) {

                System.out.println(text);
            }
        } catch (FileNotFoundException e) {

            throw new RuntimeException(e);
        } catch (IOException e) {

            throw new RuntimeException(e);
        }
    }
}
