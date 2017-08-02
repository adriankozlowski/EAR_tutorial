/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pl.sda.ejb.rents;

import dtos.BookDto;
import dtos.RentDto;
import java.util.List;
import java.util.stream.Collectors;
import javax.ejb.EJB;
import javax.enterprise.context.RequestScoped;
import javax.faces.bean.ManagedBean;
import org.modelmapper.ModelMapper;
import pl.sda.ejb.logic.AccountingBeanIfc;
import pl.sda.ejb.logic.UserBeanIfc;
import pl.sda.ejb.model.Book;
import pl.sda.ejb.model.Rent;
import pl.sda.ejb.model.User;

/**
 *
 * @author Adrian
 */
@ManagedBean(name = "rentsTableController")
@RequestScoped
public class RentsTableController {

    @EJB
    private AccountingBeanIfc abi;
    @EJB
    private UserBeanIfc ubi;
    
    public String getSaldo(){
        
        User user = ubi.findUser(1L); //todo: pobrać usera z sesji (albo jego ID)
        return abi.saldo(user).toString();        
    }
    
    /**
     * Creates a new instance of RentsTableController
     */
    public RentsTableController() {
    }
    
  public List<RentDto> getList(){
      List<Rent> rentBooks = ubi.getRentBooks(1L);
      List<RentDto> dtos = rentBooks.stream().map(this::map).collect(Collectors.toList());
      return dtos;
  }
    private RentDto map(Rent b) {
        ModelMapper mapper = new ModelMapper();
        RentDto map = mapper.map(b, RentDto.class);
        return map;
    }
}
