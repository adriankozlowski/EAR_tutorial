/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pl.sda.ejb.books;

import java.util.ArrayList;
import javax.ejb.EJB;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;
import pl.sda.ejb.logic.BookBeanIfc;
import pl.sda.ejb.model.Author;
import pl.sda.ejb.model.Book;

/**
 *
 * @author Adrian
 */
@ManagedBean(name = "addBookController")
@RequestScoped
public class AddBookController {

    @EJB
    private BookBeanIfc bookBean;

    private String title;
    private String isbn;
    private int releaseDate;
    private String authors;

    /**
     * Creates a new instance of AddBookController
     */
    public AddBookController() {
    }

    public void save() {
        try {
            Book book = new Book();
            book.setIsbn(isbn);
            book.setReleaseDate(releaseDate);
            book.setTitle(title);
            String[] names = authors.split(",");
            ArrayList<Author> booksAuthors = new ArrayList<>();
            for (String name : names) {
                //tutaj też mozna sprawdzic czy autor juz nie istnieje w bazie
                //np.: Author author = bookBean.checkIfAuthorExists(name);
                Author author = new Author();
                author.setName(name);
                ArrayList<Book> arrayList = new ArrayList<Book>();
                arrayList.add(book);
                author.setBooks(arrayList);
                booksAuthors.add(author);
            }
            book.setAuthors(booksAuthors);
            bookBean.addBook(book);
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public int getReleaseDate() {
        return releaseDate;
    }

    public void setReleaseDate(int releaseDate) {
        this.releaseDate = releaseDate;
    }

    public String getAuthors() {
        return authors;
    }

    public void setAuthors(String authors) {
        this.authors = authors;
    }

}
