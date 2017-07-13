/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pl.sda.ejb;

import java.util.List;
import javax.ejb.Local;
import javax.ejb.Remote;

/**
 *
 * @author Adrian
 */
@Remote
public interface NewSessionBeanRemote {    

    public List<String> getBooks();

    public void addBook(String bookName);
    
}
