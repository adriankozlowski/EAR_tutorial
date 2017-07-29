/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package pl.sda.ejb;

import java.util.ArrayList;
import java.util.List;
import javax.ejb.Remote;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 *
 * @author martin
 */
@Stateless
public class NewSessionBean implements NewSessionBeanRemote{

    private final ArrayList<String> books;
    
    @PersistenceContext(unitName = "persistance_unit")
    private EntityManager em;

    public NewSessionBean() {
        this.books = new ArrayList<String>();
    }

    @Override
    public List<String> getBooks() {
        return this.books;
    }

    @Override
    public void addBook(String bookName) {
        this.books.add(bookName);
    }

}
