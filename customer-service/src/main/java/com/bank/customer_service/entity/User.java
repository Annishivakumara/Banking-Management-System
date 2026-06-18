package com.bank.customer_service.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "users") // Maps this entity to the 'users' table in your DB
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY) // Auto-increments the ID (like SERIAL in PostgreSQL or AUTO_INCREMENT in MySQL)
    private Long id;

    private String name;
    private String email;

    // 1. Default Constructor (Required by JPA/Hibernate)
    public User() {
    }

    // 2. Parameterized Constructor (Convenient for creating new users)
    public User(String name, String email) {
        this.name = name;
        this.email = email;
    }

    // 3. Getters and Setters
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

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}