package com.test;

import org.hibernate.*;
import org.hibernate.cfg.Configuration;

public class EmployeeDemo {

    public static void main(String[] args) {

        SessionFactory sf = new Configuration()
                .configure("hibernate.cfg.xml")
                .buildSessionFactory();

        Session session = sf.openSession();
        Transaction tx = session.beginTransaction();

        FullTimeEmployee fte = new FullTimeEmployee();
        fte.setName("Riya");
        fte.setDepartment("HR");
        fte.setSalary(75000);

        ContractEmployee ce = new ContractEmployee();
        ce.setName("Anil");
        ce.setDepartment("IT");
        ce.setHours(120);

        session.persist(fte);
        session.persist(ce);

        tx.commit();

        System.out.println("Employees saved!");

        session.close();
        sf.close();
    }
}