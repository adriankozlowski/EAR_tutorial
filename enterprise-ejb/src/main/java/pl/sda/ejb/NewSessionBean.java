/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package pl.sda.ejb;

import pl.sda.ejb.model.Book;

import java.util.List;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import javax.transaction.Transactional;

/**
 *
 * @author martin
 */
@Stateless
public class NewSessionBean implements NewSessionBeanRemote{

//    private final ArrayList<String> books;
    
    @PersistenceContext(unitName = "pl.sda.ejb_enterprise-ejb_ejb_1.0-SNAPSHOTPU")
    private EntityManager em;

    public NewSessionBean() {

    }

    @Override
    public List<Book> getBooks() {
        Query query = em.createQuery("from Book");
        return query.getResultList();
    }

    @Override       
    public void addBook(String bookName) {
       try{
        Book book = new Book();
        book.setIsbn("1234567890");
        book.setTitle(bookName);        
        em.persist(book);
       }catch(Exception e){
           e.printStackTrace();
       }
    }
    
    public void robieCos(){
        
    }

}
