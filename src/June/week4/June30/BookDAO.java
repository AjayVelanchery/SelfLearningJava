package June.week4.June30;

import java.util.ArrayList;
import java.util.List;

public class BookDAO {

    public List<Book>getBooks(){

    List<Book> books=new ArrayList<>();
        books.add(new Book(101,"core java",400));
        books.add(new Book(143,"Hibernate",180));
        books.add(new Book(143,"spring",400));
        books.add(new Book(123,"webservice",400));
        return books;

    }
}
