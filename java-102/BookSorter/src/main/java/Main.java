import model.Book;
import model.NameComparator;
import model.PageCountComparator;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Book book1 = new Book("Gün olur asra bedel", 256, "Cengiz Aytmatov", 1983);
        Book book2 = new Book("Ihtiyar adam ve deniz", 102, "Hemmingway", 1948);
        Book book3 = new Book("Satranç", 65, "Stephan Zweng", 1945);
        Book book4 = new Book("Harry Potter", 323, "J.K Rowling", 2000);
        Book book5 = new Book("Elveda Gülsarı", 234, "Cengiz Aytmatov", 1988);

        System.out.println("Sort by name");
        Set<Book> books1 = new TreeSet<>(new NameComparator());
        books1.add(book1);
        books1.add(book2);
        books1.add(book3);
        books1.add(book4);
        books1.add(book5);

        Iterator<Book> iterator = books1.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }

        System.out.println("Sort by pageCount");

        books1 = new TreeSet<>(new PageCountComparator());
        books1.add(book1);
        books1.add(book2);
        books1.add(book3);
        books1.add(book4);
        books1.add(book5);

        Iterator<Book> iterator2 = books1.iterator();
        while (iterator2.hasNext()) {
            System.out.println(iterator2.next());
        }


    }
}
