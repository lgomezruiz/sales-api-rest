package com.lgomezruiz.sales_api_rest.models;

import jakarta.persistence.*;

@Entity
@Table(name = "Customer")
public class CustomerModel {
    //Attributes
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(name = "Name", nullable = false, length = 70)
    private String name;
    @Column(name = "Surname", nullable = false, length = 70)
    private String surnames;
    @Column(name = "Direction", nullable = true, length = 150)
    private String direction;
    @Column(name = "Phone Number", nullable = true, length = 9)
    private String phone;
    @Column(name = "Email", nullable = true, length = 55)
    private String email;

    //Getters & Setters
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

    public String getSurnames() {
        return surnames;
    }

    public void setSurnames(String surnames) {
        this.surnames = surnames;
    }

    public String getDirection() {
        return direction;
    }

    public void setDirection(String direction) {
        this.direction = direction;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
