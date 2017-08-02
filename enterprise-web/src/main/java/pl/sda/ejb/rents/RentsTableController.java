/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pl.sda.ejb.rents;

import javax.ejb.EJB;
import javax.enterprise.context.RequestScoped;
import javax.faces.bean.ManagedBean;
import pl.sda.ejb.logic.AccountingBeanIfc;
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
    
    public String getSaldo(){
        User user = new User(); //todo: pobrać usera z sesji (albo jego ID)
        return abi.saldo(user).toString();        
    }
    
    /**
     * Creates a new instance of RentsTableController
     */
    public RentsTableController() {
    }
    
//  public List<RentDto> list(){
//      
//  }
    
}
