package ArrayList.SistemaGestioLlibres;

import java.util.ArrayList;
import java.util.Comparator;

public class BookManager {
    protected ArrayList<Book> books;

    public BookManager() {
        this.books = new ArrayList<>();
    }

    public void addBook(Book book) {
        books.add(book);
        System.out.println("Book added succesfully.");
    }

    public ArrayList<Book> showAllBooks() {
        return books;
    }

    public Book findBookByTitle(String title) {
        for (Book book : books) {
            if (book.getTitle().equalsIgnoreCase(title)) {
                return book;
            }
        }
        return null;
    }

    public Book findBookByAuthor(String author) {
        for (Book book : books) {
            if (book.getAuthor().equalsIgnoreCase(author)) {
                return book;
            }
        }
        return null;
    }

    public void updateRating(String title, int rating) {
        if (rating >= 0 && rating <= 5) {
            for (Book book : books) {
                if (book.getTitle().equalsIgnoreCase(title)) {
                    book.setRating(rating);
                    System.out.println("Rating updated succesfully.");
                }
            }
        } else System.out.println("The rating value must be between 0 and 5.");
    }

    public ArrayList<Book> listByRating() {
        ArrayList<Book> booksByRating = new ArrayList<>(books);
        booksByRating.sort(Comparator.comparingInt(Book::getRating).reversed());
        System.out.println("The rating list is the following:");
        return booksByRating;
    }

    public void reducedListByRating(int number) {
        ArrayList<Book> reducedBooksByRating = new ArrayList<>(books);
        reducedBooksByRating.sort(Comparator.comparingInt(Book::getRating).reversed());
        System.out.println("The rating list is the following:");
        for (int i = 0; i < number; i++) {
            System.out.println(reducedBooksByRating.get(i));
        }
    }

    public void minRatingList(int minRating) {
        ArrayList<Book> ListThresholdRating = new ArrayList<>();
        for (Book book: books){
            if (book.getRating() > minRating){
                ListThresholdRating.add(book);
            }
        }
        ListThresholdRating.sort(Comparator.comparingInt(Book::getRating).reversed());
        System.out.println(ListThresholdRating);
        }

        public void removeBook(int id){
        books.removeIf(book -> book.getId() == id);
            System.out.println("Book deleted succesfully");
    }
}


