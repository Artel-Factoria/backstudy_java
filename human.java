import java.security.PublicKey;
import java.time.LocalDate;
import java.util.ArrayList;

public class human {
    human(String name, String birthDay){
        this.name = name;
        this.birthDay = LocalDate.parse(birthDay);
    }
    private String name;
    private LocalDate birthDay;
    private ArrayList<Book> books = new ArrayList<Book>();




    public String getName(){
        return this.name;
    }
    public String getBirthDay(){
        return this.birthDay.toString();
    }
    public LocalDate getBirthDaySpecial(){
        return this.birthDay;
    }

    public String borrowedBooks(){
        return this.books.toString();
    }

    public void borrow(Book book){
        this.books.add(book);
    }

}
