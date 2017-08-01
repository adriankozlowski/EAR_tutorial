/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pl.sda.ejb.authors;

import javax.inject.Named;
import javax.enterprise.context.Dependent;
import javax.faces.bean.RequestScoped;

/**
 *
 * @author Adrian
 */
@Named(value = "authorsTableController")
@RequestScoped
public class AuthorsTableController {

    /**
     * Creates a new instance of AuthorsTableController
     */
    public AuthorsTableController() {
    }
    
}
