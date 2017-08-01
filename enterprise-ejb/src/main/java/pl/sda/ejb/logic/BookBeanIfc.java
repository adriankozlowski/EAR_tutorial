/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pl.sda.ejb.logic;

import javax.ejb.Local;
import pl.sda.ejb.model.Author;
import pl.sda.ejb.model.Book;

/**
 *
 * @author Adrian.Kozlowski
 */
@Local
public interface BookBeanIfc {
    Book addBook(Book book);
    Author addAuthor(Author author);
}
