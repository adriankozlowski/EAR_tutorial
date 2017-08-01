/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package pl.sda.ejb.logic;

import pl.sda.ejb.model.Book;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import pl.sda.ejb.model.User;

/**
 *
 * @author martin
 */
@Stateless
public class UserBean implements UserBeanIfc{
    
    @PersistenceContext(unitName = "pl.sda.ejb_enterprise-ejb_ejb_1.0-SNAPSHOTPU")
    private EntityManager em;

    public UserBean() {

    }


    @Override
    public Book rentBook(Long userId, Long bookId){
        return null;
    }

    @Override
    public User createUser(User user) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
