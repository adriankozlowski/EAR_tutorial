/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package pl.sda.ejb.logic;

import java.util.Date;
import java.util.List;
import javax.ejb.EJB;
import pl.sda.ejb.model.Book;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import pl.sda.ejb.model.Rent;
import pl.sda.ejb.model.User;

/**
 *
 * @author martin
 */
@Stateless
public class UserBean implements UserBeanIfc{
    
    @PersistenceContext(unitName = "pl.sda.ejb_enterprise-ejb_ejb_1.0-SNAPSHOTPU")
    private EntityManager em;

    @EJB
    private AccountingBeanIfc abi;
    
    public UserBean() {

    }


    @Override
    public Book rentBook(Long userId, Long bookId){
        User user = em.find(User.class, userId);
        Book book = em.find(Book.class, bookId);
        Rent rent = new Rent();
        rent.setBook(book);
        rent.setUser(user);
        rent.setRentalDate(new Date());
        em.persist(rent);
        abi.doDebit(rent);
        return book;
    }

    @Override
    public User createUser(User user) {
        if(user != null){
            em.persist(user);
            return user;
        }
        return null;
    }

    @Override
    public User logIn(String username, String password) {
        Query query = em.createQuery("from User u where u.username = :username and u.password = :passowrd");
        query.setParameter("username", username);
        query.setParameter("password", password);
        User user = (User) query.getSingleResult();
        return user;
    }

    @Override
    public User findUser(Long userId) {        
       return em.find(User.class, userId);                
    }

    @Override
    public List<Rent> getRentBooks(Long l) {
        Query query = em.createQuery("from Rent r where r.user = :user");
        query.setParameter("user", this.findUser(l));
        return query.getResultList();
    }
}
