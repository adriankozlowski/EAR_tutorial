/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dtos;

import java.util.Collection;

/**
 *
 * @author Adrian
 */
public class BookDto {
    
    private Long id;

    private String bookTitle;
    private String bookIsbn;
    private int bookReleaseDate;
    private Collection<AuthorDto> authors;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getBookTitle() {
        return bookTitle;
    }

    public void setBookTitle(String bookTitle) {
        this.bookTitle = bookTitle;
    }

    public String getBookIsbn() {
        return bookIsbn;
    }

    public void setBookIsbn(String bookIsbn) {
        this.bookIsbn = bookIsbn;
    }

    public int getBookReleaseDate() {
        return bookReleaseDate;
    }

    public void setBookReleaseDate(int bookReleaseDate) {
        this.bookReleaseDate = bookReleaseDate;
    }

    public Collection<AuthorDto> getAuthors() {
        return authors;
    }

    public void setAuthors(Collection<AuthorDto> authors) {
        this.authors = authors;
    }
    
    
}
