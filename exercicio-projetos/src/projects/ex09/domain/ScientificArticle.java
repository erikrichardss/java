package projects.ex09.domain;

import java.time.LocalDate;

public class ScientificArticle extends Materials {

    private String mainAuthor;
    private String searchArea;

    public ScientificArticle(String title, LocalDate yearPublication, boolean borrowed, String mainAuthor, String searchArea) {
        super(title, yearPublication, borrowed);
        this.mainAuthor = mainAuthor;
        this.searchArea = searchArea;
    }

    @Override
    public String toString() {
        return "ScientificArticle{" +
                "mainAuthor='" + mainAuthor + '\'' +
                ", searchArea='" + searchArea + '\'' +
                '}';
    }

    public String getMainAuthor() {
        return mainAuthor;
    }

    public String getSearchArea() {
        return searchArea;
    }
}
