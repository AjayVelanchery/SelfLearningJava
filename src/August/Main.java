package August;


import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

class Book  {
String title;
String author;
int publicationYear;

    public Book(String title, String author, int publicationYear) {
        this.title = title;
        this.author = author;
        this.publicationYear = publicationYear;
    }

    @Override
    public String toString() {
        return "Book{" +
                "title='" + title + '\'' +
                ", author='" + author + '\'' +
                ", publicationYear=" + publicationYear +
                '}';
    }

//    @Override
//    public int compareTo(Book book) {
//        return this.publicationYear-book.publicationYear;
//
//
//
//    }
    

}
public class Main {
    public static void main(String[] args) {
        List<Book> books = new ArrayList<>();

        books.add(new Book("The Hobbit", "J.R.R. Tolkien", 1937));
        books.add(new Book("1984", "George Orwell", 1949));
        books.add(new Book("To Kill a Mockingbird", "Harper Lee", 1960));
        books.add(new Book("Brave New World", "Aldous Huxley", 1932));

//        Collections.sort(books);

        Comparator<Book> authorComp=(n1,n2)->n1.author.compareTo(n2.author);
        Collections.sort(books,authorComp);

        System.out.println("books sorted by author");
        for(Book b:books){
            System.out.println(b);
        }
//        System.out.println("Books sorted by publication year:");
//        for (Book b : books) {
//            System.out.println(b);
//        }

        Comparator<Book> titleComp=Comparator.comparing(b -> b.title);
        Collections.sort(books,titleComp.reversed());

        System.out.printf("Books sorted by title");


        for(Book b:books){
            System.out.println(b);
        }
    }
}
