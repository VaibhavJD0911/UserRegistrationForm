package com.example.user.UserRegistrationForm;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.persistence.Column;

@Entity
@Table(name = "form_details") // match your table name
public class Registration {

    @Id
    @Column(name = "ID") // matches DB column exactly
    private String id;

    @Column(name = "Name")
    private String name;

    @Column(name = "City")
    private String city;

    @Column(name = "Mobile")
    private String mobile;

    @Column(name = "DOB")
    private String dob;

    // Getters and Setters (IDE can generate these)
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getMobile() {
        return mobile;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile;
    }

    public String getDob() {
        return dob;
    }

    public void setDob(String dob) {
        this.dob = dob;
    }
}
