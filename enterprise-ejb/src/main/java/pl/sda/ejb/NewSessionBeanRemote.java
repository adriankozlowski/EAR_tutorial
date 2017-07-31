/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pl.sda.ejb;

import pl.sda.ejb.model.Book;

import java.util.List;
import javax.ejb.Local;
import javax.ejb.Remote;

/**
 *
 * @author Adrian
 */
@Local
public interface NewSessionBeanRemote {    

    public List<Book> getBooks();

    public void addBook(String bookName);
    
}
