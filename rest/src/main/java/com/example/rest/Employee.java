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

    protected Employee(){}

    public Employee(String name,String role){
        this.name = name;
        this.role = role;
    }

    @Override
    public String toString(){
        return String.format("Employee[id=%d,name=%s,role=%s]",id,name,role);
    }

    public Long getId(){
        return id;
    }

    public String getName(){
        return name;
    }

    public String getRole(){
        return role;
    }

}
