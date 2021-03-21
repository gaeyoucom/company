package com.romeoh.company.controller;

import com.romeoh.company.model.Company;
import com.romeoh.company.service.CompanyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.Hashtable;

@RestController
public class CompanyController {

    @Autowired
    CompanyService companyService;

    // http://localhost:9988/
    @GetMapping("/")
    public Hashtable<String, Company> all() {
        return companyService.all();
    }

    // http://localhost:9988/google
    @GetMapping("{id}")
    public Company company(@PathVariable("id") String id) {
        return companyService.company(id);
    }
}
