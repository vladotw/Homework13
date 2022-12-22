package pro.sky.java.course1.HW13;

public class Main {
    public static void main(String[] args) {
        Author itAuthor = new Author("Стивен", "Кинг");
        Author darkStarAuthor = new Author("Вера", "Камша");
//        System.out.println("itAuthor.getAuthorName() = " + itAuthor.toString());
//        System.out.println("darkStarAuthor.getAuthorName() = " + darkStarAuthor.toString());

        Book bookIt = new Book("Оно", itAuthor, 1986);
        System.out.println("bookIt.bookTitle = " + bookIt.getBookTitle());
        System.out.println("bookIt.authorName = " + bookIt.getBookAuthorName());
        System.out.println("bookIt.publicationYear = " + bookIt.getPublicationYear());

        Book bookDarkStar = new Book("Тёмная звезда", darkStarAuthor, 2001);
        System.out.println("bookDarkStar.bookTitle = " + bookDarkStar.getBookTitle());
        System.out.println("bookDarkStar.bookAuthor = " + bookDarkStar.getBookAuthorName());
        System.out.println("bookDarkStar.publicationYear = " + bookDarkStar.getPublicationYear());

        bookIt.setPublicationYear(1987);
        System.out.println("bookIt.getPublicationYear() = " + bookIt.getPublicationYear());
        System.out.println();

    }
}