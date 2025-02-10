package ArrayList.SistemaGestioLlibres;

import java.util.Scanner;

public class TestBookManager {
    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);
        BookManager manager = new BookManager();
        boolean programaEnCurs = true;

        Book book1 = new Book(1,"Don Quijote","Miguel de Cervantes",5);
        Book book2 = new Book(2,"Dragon Ball","Akira Toriyama",3);
        Book book3 = new Book(3,"Naruto","Masashi Kishimoto",4);
        Book book4 = new Book(4,"Mecanoscrit del segon origen","Manuel de Pedrolo i Molina",5);
        Book book5 = new Book(5,"El codi Da Vinci","Dan Brown",0);


        manager.books.add(book1);
        manager.books.add(book2);
        manager.books.add(book3);
        manager.books.add(book4);
        manager.books.add(book5);

        while (programaEnCurs) {
            System.out.println("Select an option: \n" +
                    "a. Add book \n" +
                    "b. Show All Books \n" +
                    "c. Find book with title \n" +
                    "d. Find book with author \n" +
                    "e. Update book rating \n" +
                    "f. List by rating \n" +
                    "g. Reduced list by rating (user determines the number) \n" +
                    "h. Show list determined by a rating threshold \n" +
                    "i. Delete book with id \n" +
                    "j. Exit");
            switch (input.nextLine()) {
                case "a":
                    System.out.println("Please, introduce the id of the new book.");
                    int id = input.nextInt();
                    input.nextLine();
                    System.out.println("Now, introduce the name of the new book.");
                    String title = input.nextLine();
                    System.out.println("Now, introduce the author: ");
                    String author = input.nextLine();
                    System.out.println("To finish, iontroduce the rating: ");
                    int rating = input.nextInt();
                    input.nextLine();

                    Book book = new Book(id, title, author, rating);
                    manager.addBook(book);
                    break;

                case "b":
                    System.out.println(manager.showAllBooks());
                    break;

                case "c":
                    System.out.println("Please, introduce the title of the book you wish to find.");
                    System.out.println(manager.findBookByTitle(input.nextLine()));
                    break;

                case "d":
                    System.out.println("Please, introduce the name of the author of the book you wish to find.");
                    System.out.println(manager.findBookByAuthor(input.nextLine()));
                    break;

                case "e":
                    System.out.println("Please, introduce the title of the book and the new rating you wish to give.");
                    manager.updateRating(input.nextLine(), input.nextInt());
                    input.nextLine();
                    break;

                case "f":
                    System.out.println(manager.listByRating());
                    break;

                case "g":
                    manager.reducedListByRating(input.nextInt());
                    input.nextLine();
                    break;

                case "h":
                    System.out.println("Please, introduce the minimum rating for books to appear in the following list.");
                    manager.minRatingList(input.nextInt());
                    input.nextLine();
                    break;

                case "i":
                    System.out.println("Please, introduce the id of the book you wish to remove.");
                    manager.removeBook(input.nextInt());
                    input.nextLine();
                    break;

                case "j":
                    programaEnCurs = false;
                    System.out.println("Thank you for using our services. See you soon!");
                    break;
            }
        }
    }
}


