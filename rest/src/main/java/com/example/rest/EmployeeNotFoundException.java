package com.example.rest;

@SuppressWarnings("serial")
class EmployeeNotFoundException extends RuntimeException {
    
    EmployeeNotFoundException(Long id){
        super("Could not find employee "+id);
    }

}
