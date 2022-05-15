package com.tubanurbalci.booksttore;

import com.tubanurbalci.booksttore.model.Book;
import com.tubanurbalci.booksttore.repository.BookRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.Arrays;

@SpringBootApplication
public class BookSttoreApplication implements CommandLineRunner {

    private final BookRepository bookRepository;

    public BookSttoreApplication(BookRepository bookRepository) {
        this.bookRepository = bookRepository;
    }

    public static void main(String[] args) { //it came default

        SpringApplication.run(BookSttoreApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
        Book book1=Book.builder()
                .name("Yüzyıllık Yalnızlık")
                .author("Gabriel García Márquez")
                .price(60.0)
                .stock(16).build();
        Book book2=Book.builder()
                .name("Simyacı")
                .author("Paulo Coelho")
                .price(60.0)
                .stock(16).build();
        Book book3=Book.builder()
                .name("Küçük Prens")
                .author("Antoine de Saint-Exupéry")
                .price(60.0)
                .stock(16).build();
        Book book4=Book.builder()
                .name("Suç ve Ceza")
                .author("Fyodor Dostoyevski")
                .price(60.0)
                .stock(16).build();
        Book book5=Book.builder()
                .name("Hayvan Çiftliği")
                .author("George Orwell")
                .price(60.0)
                .stock(16).build();
        Book book6=Book.builder()
                .name("Bülbülü Öldürmek")
                .author("Harper Lee")
                .price(60.0)
                .stock(16).build();
        Book book7=Book.builder()
                .name("İlahi Komedya")
                .author("Dante")
                .price(60.0)
                .stock(16).build();

        bookRepository.saveAll(Arrays.asList(book1,book2,book3,book4,book5,book6,book7));

    }
}
