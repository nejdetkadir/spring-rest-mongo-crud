package com.nejdetkadirbektas.springrestmongocrud.domain;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.HashMap;

/**
 * @author nejdetkadirr
 */
@Document
public class User {

    @Id
    private String id;
    private String firstName;
    private String lastName;
    private int age;
    private HashMap informations;

    public User(String id, String firstName, String lastName, int age, HashMap informations) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.informations = informations;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public HashMap getInformations() {
        return informations;
    }

    public void setInformations(HashMap informations) {
        this.informations = informations;
    }
}
