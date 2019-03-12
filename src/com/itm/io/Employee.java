/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.itm.io;
/////////////////////////////////////POJO////////////////////////

import java.io.Serializable;

public class Employee implements Serializable{
    //Serializable send data in smalll form or in fragments and collects in the form of objects
    
    //this field is used to identify Employee class objects during deserialization
    //if this value differs differs in objects and class the deserialization process
    //wont acept the serialized objects
    
    private static final long serialVersionUID =11723456789L;
    
    private int id;
    private String name;
    private double salary;
    

    public Employee() {
        //default constructor
    }

    public Employee(int id, String name, double salary) {
        this.id = id;
        this.name = name;
        this.salary = salary;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public double getSalary() {
        return salary;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }    
}










