package com.example.intership_application_api.repository;

import com.example.intership_application_api.entity.Application;
import com.example.intership_application_api.entity.Company;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.*;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicLong;

@Repository
public interface CompanyRepository extends JpaRepository<Company, Long> {

}
