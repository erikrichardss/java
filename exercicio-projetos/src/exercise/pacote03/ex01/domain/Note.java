package exercise.pacote03.ex01.domain;

public class Note {

    private String title;
    private String content;

    public Note(String title, String content) {

        this.title = title;
        this.content = content;
    }

    public String format() {

        return title + "\n" + content + "\n";
    }

    public String getTitle() { return title; }

    public String getContent() { return content; }
}
