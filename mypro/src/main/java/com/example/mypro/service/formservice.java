package com.example.mypro.service;

import com.example.mypro.entity.admissionEntity;

import java.util.List;
import java.util.Optional;

public interface formservice {
    List<admissionEntity> findAllForms();
    Optional<admissionEntity> findById(Long id);
    admissionEntity saveForm(admissionEntity admissionentity);
    admissionEntity updateForm(admissionEntity admissionentity);
    void deleteForm(Long id);


    Optional<admissionEntity> findadmissionById(Long id);
}
