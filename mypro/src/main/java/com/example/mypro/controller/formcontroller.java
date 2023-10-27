package com.example.mypro.controller;

import com.example.mypro.entity.admissionEntity;
import com.example.mypro.service.formservice;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/admit")

public class formcontroller {
    private final formservice fs;


    public formcontroller(formservice fs) {
        this.fs = fs;
    }
    @GetMapping
    public List<admissionEntity> findAllForms() {
        return fs.findAllForms();
    }
    @GetMapping("/{id}")
    public Optional<admissionEntity> findById(@PathVariable("id") Long id){
        return fs.findadmissionById(id);
    }
    @PostMapping
    public admissionEntity saveForm(@RequestBody admissionEntity admissionentity){
        return fs.saveForm(admissionentity);
    }
    @PutMapping
    public admissionEntity updateForm(@RequestBody admissionEntity admissionentity) {
        return fs.updateForm(admissionentity);
    }
    @DeleteMapping("/{id}")
    public void deleteForm(@PathVariable("id") Long id){
        fs.deleteForm(id);
    }
}
