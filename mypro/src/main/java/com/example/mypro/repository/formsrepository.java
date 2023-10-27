package com.example.mypro.repository;

import com.example.mypro.entity.admissionEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface formsrepository extends JpaRepository<admissionEntity,Long> {


}