package com.example.intership_application_api.repository;

import com.example.intership_application_api.entity.Application;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ApplicationRepository extends JpaRepository <Application, Long> {

}
