/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.cox;

import javax.annotation.ManagedBean;
import javax.enterprise.context.SessionScoped;
import org.hibernate.Session;

/**
 *
 * @author Matthew
 */
@ManagedBean
@SessionScoped
public class Data {
    private platoon p;
    private HibernateUtil helper;
    private Session session;
    
    public void addplatoon(){
        p = new platoon("Cox");
        session = helper.getSessionFactory().openSession();
        session.beginTransaction();
        session.save(p);
        session.getTransaction().commit();
        session.close();
    }
}
