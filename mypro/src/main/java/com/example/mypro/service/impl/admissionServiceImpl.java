package com.example.mypro.service.impl;



import com.example.mypro.entity.admissionEntity;
import com.example.mypro.repository.formsrepository;
import com.example.mypro.service.formservice;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class admissionServiceImpl implements formservice {

    private final formsrepository fr;

    public admissionServiceImpl(formsrepository fr) {
        this.fr = fr;
    }

    @Override
    public List<admissionEntity> findAllForms() {
        return fr.findAll();
    }

    @Override
    public Optional<admissionEntity> findById(Long id) {
        return fr.findById(id);
    }

    @Override
    public admissionEntity saveForm(admissionEntity admissionentity) {
        return fr.save(admissionentity);
    }

    @Override
    public admissionEntity updateForm(admissionEntity admissionentity) {
        return fr.save(admissionentity);
    }

    @Override
    public void deleteForm(Long id) {
        fr.deleteById(id);
    }

    @Override
    public Optional<admissionEntity> findadmissionById(Long id) {
        return Optional.empty();
    }
}
