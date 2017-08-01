/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pl.sda.ejb.authors;

import javax.ejb.EJB;
import javax.inject.Named;
import javax.enterprise.context.Dependent;
import pl.sda.ejb.logic.BookBeanIfc;
import pl.sda.ejb.model.Author;

/**
 *
 * @author Adrian
 */
@Named(value = "addAuthorFormController")
@Dependent
public class AddAuthorFormController {

    @EJB
    private BookBeanIfc bbi;
    
    private String name;
    
    /**
     * Creates a new instance of AddAuthorFormController
     */
    public AddAuthorFormController() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    
    public void save(){
        Author author = new Author();
        author.setName(this.name);
        bbi.addAuthor(author);
    }
}
