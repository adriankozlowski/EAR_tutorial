/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pl.sda.ejb;

import javax.ejb.EJB;
import javax.faces.bean.ApplicationScoped;
import javax.faces.bean.ManagedBean;

/**
 *
 * @author Adrian
 */
@ManagedBean(name = "applicationController")
@ApplicationScoped
public class ApplicationController {
    
    @EJB
    private NewSessionBeanRemote bean;

    /**
     * Creates a new instance of ApplicationController
     */
    public ApplicationController() {
        
    }
    
    public String getText() {        
        bean.addBook("Tytul ksionszki");
        return "hsfadfsd";
    }
}
