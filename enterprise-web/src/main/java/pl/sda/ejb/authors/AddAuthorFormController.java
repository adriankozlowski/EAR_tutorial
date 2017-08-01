/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pl.sda.ejb.authors;

import javax.inject.Named;
import javax.enterprise.context.Dependent;

/**
 *
 * @author Adrian
 */
@Named(value = "addAuthorFormController")
@Dependent
public class AddAuthorFormController {

    /**
     * Creates a new instance of AddAuthorFormController
     */
    public AddAuthorFormController() {
    }
    
}
