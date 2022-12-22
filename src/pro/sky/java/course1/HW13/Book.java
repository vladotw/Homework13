package pro.sky.java.course1.HW13;

import java.util.Objects;

public class Book {

    private String bookTitle;
    private Author authorName;
    private int publicationYear;


    public Book(String title, Author author, int year) {
        this.bookTitle = title;
        this.authorName = author;
        this.publicationYear = year;
    }


    public String getBookTitle() {

        return this.bookTitle;
    }

    public Author getBookAuthorName() {

        return this.authorName;
    }

    public int getPublicationYear() {

        return this.publicationYear;
    }

    public void setPublicationYear(int changePublicationYear) {

        this.publicationYear = changePublicationYear;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Book book = (Book) o;
        return bookTitle.equals(book.bookTitle) && authorName.equals(book.authorName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(bookTitle, authorName);
    }

    @Override
    public String toString() {
        return "bookTitle=" + bookTitle + ", authorName=" + authorName + ", publicationYear=" + publicationYear;
    }
}
