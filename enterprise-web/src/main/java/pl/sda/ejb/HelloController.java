/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pl.sda.ejb;

import javax.ejb.EJB;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;

/**
 *
 * @author Adrian
 */
@ManagedBean(name = "homeController")
@RequestScoped
public class HelloController {

    @EJB
    private NewSessionBeanRemote newSessionBean;
    
    
    public String getText(){
        return "ok";
    }
    
}
