/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pl.sda.ejb.logic;

import pl.sda.ejb.model.Book;

import javax.ejb.Local;
import javax.ejb.Remote;
import pl.sda.ejb.model.User;

/**
 *
 * @author Adrian
 */
@Local
@Remote
public interface UserBeanIfc {    

    public User createUser(User user);
    public Book rentBook(Long userId, Long bookId);

    public User logIn(String username, String password);

    public User findUser(Long l);
    
}
