package com.bed1.dao;

import org.springframework.orm.hibernate3.HibernateTemplate;

public class CreditCardDAO {
    private HibernateTemplate ht;

    public HibernateTemplate getHt() {
        return ht;
    }

    public void setHt(HibernateTemplate ht) {
        this.ht = ht;
    }

    public CreditCard getCustomer(String panNo) {
        CreditCard card = (CreditCard) ht.get(CreditCard.class, panNo);
        return card;
    }
}
