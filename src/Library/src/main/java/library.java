import java.security.PublicKey;
import java.time.LocalDate;
import java.util.ArrayList;

public class library {

    public static void main (String args[]){
        human user = new human("Strange Sas Sousige","1995-01-31");
        Book book = new Book("World of horror", "Cool dude");
        System.out.printf("%s is a lovely book made by %s",
                book.getTitle(),
                book.getAuthor());

        user.borrow(book);

        System.out.println(user.borrowedBooks());

    }
}
