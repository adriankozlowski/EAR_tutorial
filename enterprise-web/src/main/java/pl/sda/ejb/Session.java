/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pl.sda.ejb;

import javax.inject.Named;
import javax.enterprise.context.SessionScoped;
import java.io.Serializable;
import javax.ejb.EJB;
import javax.faces.bean.ManagedBean;
import pl.sda.ejb.logic.UserBeanIfc;
import pl.sda.ejb.model.User;

/**
 *
 * @author Adrian
 */
@ManagedBean(name = "session")
@SessionScoped
public class Session implements Serializable {

    private User user;
    private Boolean loggedIn;
    
    private String username;

    /**
     * Get the value of username
     *
     * @return the value of username
     */
    public String getUsername() {
        return username;
    }

    /**
     * Set the value of username
     *
     * @param username new value of username
     */
    public void setUsername(String username) {
        this.username = username;
    }

    private String password;

    /**
     * Get the value of password
     *
     * @return the value of password
     */
    public String getPassword() {
        return password;
    }

    /**
     * Set the value of password
     *
     * @param password new value of password
     */
    public void setPassword(String password) {
        this.password = password;
    }

    
    @EJB
    private UserBeanIfc ubi;
    
    /**
     * Creates a new instance of Session
     */
    public Session() {
    }

    public User getUser() {
        return user;
    }

    public Boolean getLoggedIn() {
        return loggedIn;
    }
    
    public void logIn(){
        this.user = ubi.logIn(this.username, this.password);
        if (this.user != null){
            this.loggedIn = Boolean.TRUE;
        }
    }
}
