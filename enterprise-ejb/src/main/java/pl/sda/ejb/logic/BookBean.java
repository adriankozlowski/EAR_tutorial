/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pl.sda.ejb.logic;

import java.util.ArrayList;
import java.util.List;
import javax.ejb.EJB;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import pl.sda.ejb.model.Author;
import pl.sda.ejb.model.Book;

/**
 *
 * @author Adrian.Kozlowski
 */
@Stateless
public class BookBean implements BookBeanIfc {

    @EJB
    private AccountingBeanIfc abi;

    @PersistenceContext(unitName = "pl.sda.ejb_enterprise-ejb_ejb_1.0-SNAPSHOTPU")
    private EntityManager em;

    // Add business logic below. (Right-click in editor and choose
    // "Insert Code > Add Business Method")
    @Override
    public Author addAuthor(Author author) {
        if (author != null) {
            em.persist(author);
            return author;
        }
        return null;

    }

    @Override
    public Book addBook(Book book) {
        if (book != null) {
            em.persist(book);
            return book;
        }
        return null;
    }

    @Override
    public List<Book> getBooks() {
        try {
            Query createQuery = em.createQuery("from Book b");
            return createQuery.getResultList();
        } catch (Exception ex) {
            ex.printStackTrace();
            return new ArrayList();
        }
    }
}
