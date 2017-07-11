/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package pl.sda.ejb;

import java.util.ArrayList;
import java.util.List;
import javax.ejb.Stateless;
import javax.ejb.LocalBean;
import javax.ejb.Remote;

/**
 *
 * @author martin
 */
@Stateless
@Remote(NewSessionBeanRemote.class)
public class NewSessionBean implements NewSessionBeanRemote{

    private final ArrayList<String> books;

    public NewSessionBean() {
        this.books = new ArrayList<String>();
    }

    
    public void businessMethod() {
    }

    // Add business logic below. (Right-click in editor and choose
    // "Insert Code > Add Business Method")

    @Override
    public List<String> getBooks() {
        return this.books;
    }

    @Override
    public void addBook(String bookName) {
        this.books.add(bookName);
    }

}
