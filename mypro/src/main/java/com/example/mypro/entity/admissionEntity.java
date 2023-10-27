package com.example.mypro.entity;

import jakarta.persistence.*;

import java.util.Date;

@Entity
@Table(name="admission")

public class admissionEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="id")
    private Long id;
    @Column(name="name")
    private String name;
    @Column(name="dob")
    private Date  dob;
    @Column(name="mobile")
    private Long mobile;
    @Column(name="email")
    private String email;
    @Column(name="address")
    private String address;
    @Column(name="gender")
    private String gender;
    @Column(name="fatherName")
    private String fatherName;
    @Column(name="course")
    private String course;
    @Column(name="percentage12th")
    private String percentage12th;

    public admissionEntity() {
    }

    public admissionEntity(Long id,String name,Date dob,Long mobile,String email,String address,String gender,String fatherName,String course,String percentage12th) {
        this.id=id;
        this.name=name;
        this.dob=dob;
        this.mobile=mobile;
        this.email=email;
        this.address=address;
        this.gender=gender;
        this.fatherName=fatherName;
        this.course=course;
        this.percentage12th=percentage12th;

    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Date getDob() {
        return dob;
    }

    public void setDob(Date dob) {
        this.dob = dob;
    }

    public Long getMobile() {
        return mobile;
    }

    public void setMobile(Long mobile) {
        this.mobile = mobile;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getFatherName() {
        return fatherName;
    }

    public void setFatherName(String fatherName) {
        this.fatherName = fatherName;
    }

    public String getCourse() {
        return course;
    }

    public void setCourse(String course) {
        this.course = course;
    }

    public String getPercentage12th() {
        return percentage12th;
    }

    public void setPercentage12th(String percentage12th) {
        this.percentage12th = percentage12th;
    }
}

