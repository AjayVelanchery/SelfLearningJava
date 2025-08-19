package August;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class functionalinterfacelearning {

    public static void main(String[] args) {


        List<Integer> ls = new ArrayList<>(Arrays.asList(22, 32, 44, 23, 12));
        List<Integer> lst=new ArrayList<>(Arrays.asList(2,33,4,2,4,7));

        int sum= lst.stream()
                .reduce(0,(a,b)->a>b?a:b);
        System.out.println(sum);
//
//    Predicate<Integer> ev=n -> n % 2 == 0;
        ls.stream()
                .filter(n -> n % 2 == 0)
                .forEach(System.out::println);

        List<Book> books = List.of(
                new Book("Java Basics", 2020),
                new Book("Spring Boot", 2022),
                new Book("Data Structures", 2019)
        );

        Function<Integer, String> inttoString = n -> "Number: " + n;

        Optional<Book> result = findBookByTitle(books, "Spring Boot");
        result.ifPresent(System.out::println);

    } public static Optional<Book> findBookByTitle(List<Book> books, String title) {
        return books.stream()
                .filter(book -> book.getTitle().equalsIgnoreCase(title))
                .findFirst();
    }
    static class  Book {
        private String title;
        private int publicationYear;

        public Book(String title, int publicationYear) {
            this.title = title;
            this.publicationYear = publicationYear;
        }

        // Add this getter
        public String getTitle() {
            return title;
        }

        // Optional getter if needed
        public int getPublicationYear() {
            return publicationYear;
        }

        @Override
        public String toString() {
            return title + " (" + publicationYear + ")";
        }



    }
}
