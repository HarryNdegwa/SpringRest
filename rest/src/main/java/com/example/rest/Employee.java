package com.example.rest;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Data
@Entity
class Employee {

    private @Id @GeneratedValue Long id;
    private String name;
    private String role;

    protected Employee() {
    }

    public Employee(String name, String role) {
        this.name = name;
        this.role = role;
    }

    // public void setId(Long id){
    // id=id;
    // }

    public String getName() {
        return name;
    }

    public String getRole() {
        return role;
    }

    public void setName(String newName) {
        name = newName;
    }

    public void setRole(String newRole) {
        {
            role = newRole;
        }
    }
}
