package com.romeoh.company.controller;

import com.romeoh.company.model.Company;
import com.romeoh.company.service.CompanyService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
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
        Logger logger = LoggerFactory.getLogger(CompanyController.class);

        logger.trace("trace - Hello world");
        logger.debug("debug - Hello world");
        logger.info("info - Hello world");
        logger.warn("warn - Hello world");
        logger.error("error - Hello world");

        return companyService.all();
    }

    // http://localhost:9988/google
    @GetMapping("{id}")
    public Company company(@PathVariable("id") String id) {
        return companyService.company(id);
    }
}
