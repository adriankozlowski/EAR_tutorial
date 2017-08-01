/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pl.sda.ejb.books;

import dtos.BookDto;
import java.util.List;
import javax.ejb.EJB;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;
import pl.sda.ejb.logic.BookBeanIfc;

/**
 *
 * @author Adrian
 */
@ManagedBean(name = "booksTableController")
@RequestScoped
public class BooksTableController {

    @EJB
    private BookBeanIfc bbi;
    /**
     * Creates a new instance of BooksTableController
     */
    public BooksTableController() {
    }
    
    public List<BookDto> getList(){
       return null; 
    }
    
}
