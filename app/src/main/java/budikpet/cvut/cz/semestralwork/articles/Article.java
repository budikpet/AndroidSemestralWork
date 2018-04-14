package budikpet.cvut.cz.semestralwork.articles;

import java.util.GregorianCalendar;

/**
 * Created by Petr on 15.03.18.
 * Class representing an article.
 */

public class Article {
    private final int id;
    private String heading;
    private String text;
    private String author;
    private String url;
    private GregorianCalendar timeCreated;

    public Article(int id) {
        this.id = id;
    }

    public Article(int id, String heading, String text, String author, GregorianCalendar timeCreated) {
        this.id = id;
        this.heading = heading;
        this.text = text;
        this.author = author;
        this.timeCreated = timeCreated;
    }

    //<editor-fold desc="Getters/ Setters">
    public int getId() {
        return id;
    }

    public String getHeading() {
        return heading;
    }

    public void setHeading(String heading) {
        this.heading = heading;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public GregorianCalendar getTimeCreated() {
        return timeCreated;
    }

    public void setTimeCreated(GregorianCalendar timeCreated) {
        this.timeCreated = timeCreated;
    }
    //</editor-fold>
}
