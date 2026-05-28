package com.gabriel.library.config;

import com.gabriel.library.entities.Book;
import com.gabriel.library.entities.Categories;
import com.gabriel.library.repositories.BookRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.core.annotation.Order;
import org.springframework.context.annotation.Configuration;

import java.util.List;

@Configuration
@Order(1)
public class MenuBookList implements CommandLineRunner{
    private final BookRepository bookRepository;

    public MenuBookList(BookRepository bookRepository) {
        this.bookRepository = bookRepository;
    }

    @Override
    public void run(String... args) throws Exception {
        if (bookRepository.count() == 0){
            Book b1 = new Book("Orgulho e Preconceito", "Jane Austen", "Um clássico da literatura que acompanha Elizabeth Bennet e sua relação cheia de conflitos e sentimentos com o misterioso Sr. Darcy.", 39.90);
            b1.getCategoriesList().add(Categories.ROMANCE);
            Book b2 = new Book("Como Eu Era Antes de Você", "Jojo Moyes", "A história emocionante de Louisa Clark, que começa a trabalhar como cuidadora de um homem tetraplégico e acaba mudando sua vida.", 49.90);
            b2.getCategoriesList().add(Categories.ROMANCE);
            b2.getCategoriesList().add(Categories.DRAMA);
            Book b3 = new Book("It: A Coisa", "Stephen King","Em uma pequena cidade, um grupo de amigos enfrenta uma entidade maligna que assume a forma de seus maiores medos.", 69.90);
            b3.getCategoriesList().add(Categories.TERROR);
            b3.getCategoriesList().add(Categories.SUSPENSE);
            Book b4 = new Book("Drácula", "Bram  Stoker", "O clássico vampírico que conta a chegada do Conde Drácula à Inglaterra e o terror que ele espalha.", 34.90);
            b4.getCategoriesList().add(Categories.TERROR);
            Book b5 = new Book("Garota Exemplar", "Gillian Flynn", "No dia do aniversário de casamento, Amy desaparece misteriosamente e todas as pistas começam a apontar para seu marido, Nick. Um suspense psicológico cheio de reviravoltas.", 49.90);
            b4.getCategoriesList().add(Categories.SUSPENSE);
        }
    }
}
