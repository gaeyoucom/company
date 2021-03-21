package com.romeoh.company.service;

import com.romeoh.company.model.Company;
import org.springframework.stereotype.Service;

import java.util.Hashtable;

@Service
public class CompanyService {

    Hashtable<String, Company> companies = new Hashtable<String, Company>();

    public CompanyService() {
        Company c1 = new Company();
        c1.setName("Google");
        c1.setProduct("Android");
        c1.setNation("USA");
        companies.put("google", c1);

        Company c2 = new Company();
        c2.setName("Samsung");
        c2.setProduct("Galaxy");
        c2.setNation("Korea");
        companies.put("samsung", c2);
    }

    public Hashtable<String, Company> all() {
        return companies;
    }

    public Company company(String id) {
        return companies.get(id);
    }
}
