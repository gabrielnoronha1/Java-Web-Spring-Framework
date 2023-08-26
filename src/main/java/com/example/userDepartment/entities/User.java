package com.example.userDepartment.entities;

import jakarta.persistence.*;

@Entity
@Table(name = "tb_user")
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY) // automatic primary key generation
    private Long id;

    private String name;
    private String email;
    private Long nCellphone;
    @ManyToOne
    @JoinColumn(name = "department_id")
    private Department department;

    public User() {
        // default constructor
    }

    public User(String name, String email, Long nCellphone) {
        this.name = name;
        this.email = email;
        this.nCellphone = nCellphone;
    }

    // Getters e Setters

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

    public Long getNCellphone() {
        return nCellphone;
    }

    public void setNCellphone(Long nCellphone) {
        this.nCellphone = nCellphone;
    }

    public Department getDepartment() {
        return department;
    }

    public void setDepartment(Department department) {
        this.department = department;
    }
}
