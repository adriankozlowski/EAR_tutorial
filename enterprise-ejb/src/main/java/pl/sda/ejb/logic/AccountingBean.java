/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pl.sda.ejb.logic;

import java.math.BigDecimal;
import java.util.Date;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import pl.sda.ejb.model.Account;
import pl.sda.ejb.model.Rent;
import pl.sda.ejb.model.User;

/**
 *
 * @author Adrian.Kozlowski
 */
@Stateless
public class AccountingBean implements AccountingBeanIfc {
    
    @PersistenceContext(unitName = "pl.sda.ejb_enterprise-ejb_ejb_1.0-SNAPSHOTPU")
    private EntityManager em;
   
    @Override
    public void doDebit(Rent rent) {
        Account account = new Account();
        account.setDebit(new BigDecimal(10));
        account.setDate(new Date());
        account.setUser(rent.getUser());
        account.setRent(rent);
       em.persist(account);
    }

    @Override
    public void doCredit(User user, BigDecimal credit) {
        Account account = new Account();
        account.setCredit(credit);
        account.setDate(new Date());
        account.setUser(user);
        em.persist(account);
    }

    @Override
    public BigDecimal saldo(User user) {
        Query q = em.createQuery("select sum(a.credit) - sum(a.debit) from Account a where a.user = :user");
        Object singleResult = q.getSingleResult();
        return (BigDecimal) singleResult;
    }

    // Add business logic below. (Right-click in editor and choose
    // "Insert Code > Add Business Method")
}
