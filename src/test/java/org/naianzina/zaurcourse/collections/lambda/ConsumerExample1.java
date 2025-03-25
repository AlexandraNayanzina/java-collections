package org.naianzina.zaurcourse.collections.lambda;

import java.util.function.Consumer;
import java.util.ArrayList;

public class ConsumerExample1 {


    public static void changeBook(Book book, Consumer<Book> bookConsumer){
        bookConsumer.accept(book);
    }

    public static void main(String [] args){
        Book b1 = new Book("Adventures", 200);
        Book b2 = new Book("Astronomy", 100);
        Book b3 = new Book("Mathematics", 50);

        changeBook(b1, b-> {
            b.title = "Updated b1 book title";
            b.pagesCount = 400;
            System.out.println("Updated car: " + b);
        });

        ArrayList<Book> bookList = new ArrayList<>();
        bookList.add(b2);
        bookList.add(b3);
        bookList.forEach(el-> {
            System.out.println(el);
            el.pagesCount *= 2;
            System.out.println(el);
        });





    }
}

class Book{
    String title;
    int pagesCount;

    public Book(String title, int pagesCount) {
        this.title = title;
        this.pagesCount = pagesCount;
    }

    @Override
    public String toString() {
        return "Book{" +
                "title='" + title + '\'' +
                ", pagesCount=" + pagesCount +
                '}';
    }
}
