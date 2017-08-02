/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pl.sda.ejb.books;

import dtos.BookDto;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import javax.ejb.EJB;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;
import org.modelmapper.ModelMapper;
import pl.sda.ejb.logic.BookBeanIfc;
import pl.sda.ejb.model.Book;

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

    public List<BookDto> getList() {
        List<Book> books = bbi.getBooks();
        List<BookDto> collect;
        collect = books.stream().map(this::map).collect(Collectors.toList());
        
        return collect;
    }

    private BookDto map(Book b) {
        ModelMapper mapper = new ModelMapper();
        BookDto map = mapper.map(b, BookDto.class);       
        return map;
    }

    private void collect(Collector<Object, ?, List<Object>> toList) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
