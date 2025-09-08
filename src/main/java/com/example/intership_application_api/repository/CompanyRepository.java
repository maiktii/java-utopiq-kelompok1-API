package com.example.intership_application_api.repository;

import com.example.intership_application_api.entity.Company;
import org.springframework.stereotype.Repository;

import java.util.*;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicLong;

@Repository
public class CompanyRepository {
    private final Map<Long, Company> store = new ConcurrentHashMap<>();
    private final AtomicLong seq = new AtomicLong(0);

    public Company save(Company c) {
        if (c.getId() == null) c.setId(seq.incrementAndGet());
        store.put(c.getId(), c);
        return c;
    }

    public List<Company> findAll() {
        return new ArrayList<>(store.values());
    }
}
