package exercise.pacote03.ex01.domain;

import java.io.*;

public class EventLogger {

    public void logEvent(Event event) {

        File file = new File("file.txt");

        try (FileWriter fileWriter = new FileWriter(file, true)) {

            BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
            bufferedWriter.write(event.formatEvent());
            bufferedWriter.newLine();
            bufferedWriter.flush();
        } catch (IOException e) {

            throw new RuntimeException(e);
        }
    }

    public void readEvents() {

        try (FileReader fileReader = new FileReader("file.txt")) {

            BufferedReader bufferedReader = new BufferedReader(fileReader);

            String linha;
            while ((linha = bufferedReader.readLine()) != null) {

                System.out.println(linha);
            }
        } catch (IOException e) {

            throw new RuntimeException(e);
        }
    }


//    public void readEventsToday() {
//
//        try (FileReader fileReader = new FileReader("file.txt")) {
//
//            String linha;
//
//            BufferedReader bufferedReader = new BufferedReader(fileReader);
//
//            while ((linha = bufferedReader.readLine()) != null) {
//
//                if (event.getTimestamp().toLocalDate().equals(LocalDate.now())) {
//
//                    System.out.println(linha);
//                }
//            }
//        } catch (IOException e) {
//
//            throw new RuntimeException(e);
//        }
//    }
}
