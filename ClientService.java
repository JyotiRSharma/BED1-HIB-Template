package com.bed1.service;

import com.bed1.dao.CreditCard;
import com.bed1.dao.CreditCardDAO;
import org.hibernate.*;
//import org.hibernate.cfg.Configuration;
//import org.hibernate.service.ServiceRegistry;
//import org.hibernate.service.ServiceRegistryBuilder;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Service;

@Service
public class ClientService {

    CreditCardDAO dao;
    public double checkScore(String panNo)
    {
        ApplicationContext con = new ClassPathXmlApplicationContext("spring.xml");
//        CreditCard cardData = (CreditCard)con.getBean("dao");

        dao = (CreditCardDAO) con.getBean("ccDao");
        CreditCard cardData = dao.getCustomer(panNo);

//        Configuration cfg = new Configuration().configure().addAnnotatedClass(CreditCard.class);
//        ServiceRegistry reg = new ServiceRegistryBuilder().applySettings(cfg.getProperties()).buildServiceRegistry();
//        SessionFactory sf = cfg.buildSessionFactory(reg);
//        Session session = sf.openSession();
//
//            cardData = (CreditCard) session.get(CreditCard.class, panNo);
//            session.close();

            if (cardData == null)
            {
                return 0;
            }

            double result = cardData.getCreditScore();

        return result;
    }
}
