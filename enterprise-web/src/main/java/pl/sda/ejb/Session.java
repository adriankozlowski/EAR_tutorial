/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pl.sda.ejb;

import javax.inject.Named;
import javax.enterprise.context.SessionScoped;
import java.io.Serializable;
import javax.faces.bean.ManagedBean;

/**
 *
 * @author Adrian
 */
@ManagedBean(name = "session")
@SessionScoped
public class Session implements Serializable {

    /**
     * Creates a new instance of Session
     */
    public Session() {
    }
    
}
