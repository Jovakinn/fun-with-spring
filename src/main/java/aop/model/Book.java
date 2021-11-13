package aop.model;

import aop.model.Genres.Genre;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import java.util.Objects;

@Component
public class Book {
    @Value("#{book.title}")
    private String title;
    private Genre genre;
    @Value("#{book.amountOfPages}")
    private Integer amountOfPages;

    @Override
    public String toString() {
        return "Book{" +
                "title='" + title + '\'' +
                ", genre=" + genre +
                ", amountOfPages=" + amountOfPages +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Book)) return false;
        Book book = (Book) o;
        return Objects.equals(getTitle(), book.getTitle()) && getGenre() == book.getGenre() && Objects.equals(getAmountOfPages(), book.getAmountOfPages());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getTitle(), getGenre(), getAmountOfPages());
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Genre getGenre() {
        return genre;
    }

    public void setGenre(Genre genre) {
        this.genre = genre;
    }

    public Integer getAmountOfPages() {
        return amountOfPages;
    }

    public void setAmountOfPages(Integer amountOfPages) {
        this.amountOfPages = amountOfPages;
    }
}
