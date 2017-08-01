/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pl.sda.ejb.logic;

import java.math.BigDecimal;
import javax.ejb.Local;
import pl.sda.ejb.model.Rent;
import pl.sda.ejb.model.User;

/**
 *
 * @author Adrian.Kozlowski
 */
@Local
public interface AccountingBeanIfc {
    
    BigDecimal doDebit(Rent rent);
    BigDecimal doCredit(User user, BigDecimal credit);
    BigDecimal saldo(User user);
    
}
