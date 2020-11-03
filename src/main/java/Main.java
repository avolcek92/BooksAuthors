
import java.time.LocalDate;
import java.util.List;


public class Main {
    public static void main(String[] args) {
        Dao dao = new Dao();
        Authors authors = new Authors();
        authors.setFirstName("Lev");
        authors.setLastName("Tolstoj");

        Authors authors1 = new Authors();
        authors1.setFirstName("Robert");
        authors1.setLastName("Kiyoski");

        Authors authors2 = new Authors();
        authors2.setFirstName("Jack");
        authors2.setLastName("London");


        Books books = new Books();
        books.setName("Karas ir Taika");
        books.setPrice(22.5);
        books.setYear(LocalDate.of(2001, 03, 04));

        Books books1 = new Books();
        books1.setName("Anna Karenina");
        books1.setPrice(12.5);
        books1.setYear(LocalDate.of(1995, 03, 04));

        Books books2 = new Books();
        books2.setName("Smokas Beilu");
        books2.setPrice(15.5);
        books2.setYear(LocalDate.of(1912, 03, 04));

        Books books3 = new Books();
        books3.setName("Turtingas tetis");
        books3.setPrice(50.5);
        books3.setYear(LocalDate.of(2009, 03, 04));

        Books books4 = new Books();
        books4.setName("Varksas Tetis");
        books4.setPrice(50.5);
        books4.setYear(LocalDate.of(2010, 03, 04));


        dao.createAuthor(authors);
        books.setAuthors(authors);
        books1.setAuthors(authors);
        dao.createBook(books);
        dao.createBook(books1);


        dao.createAuthor(authors1);
        books3.setAuthors(authors1);
        books4.setAuthors(authors1);
        dao.createBook(books3);
        dao.createBook(books4);

        dao.createAuthor(authors2);
        books2.setAuthors(authors2);
        dao.createBook(books2);

        // List<Books> booksList = dao.getAllBooks();
        // for (Books booksIter : booksList) {
        //         System.out.println(booksIter);
        // }


        //List<Authors> authorsList = dao.getAllAuthors();
        //for (Authors authorsIter : authorsList) {
        //    System.out.println(authorsIter);

        //}

        authors.setFirstName("Jonas");
        dao.updateAuthor(authors);

        books.setName("LALLALA");
        dao.updateBook(books);

        dao.deleteAuthor(authors1);
        //dao.deleteBook(books4);
    }
}
