/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package pl.sda.ejb.logic;

import pl.sda.ejb.model.Book;

import java.util.List;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
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
    public User createUser(){
        return null;
    }


    @Override
    public Book rentBook(Long userId, Long bookId){
        return null;
    }
}
