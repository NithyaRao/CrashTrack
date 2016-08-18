package com.chyld.models;

import com.chyld.Gender;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "people")
public class Person {
    private int personId;
    private String name;
    private int age;
    private String gender;
    private String address;

    public Person() { // !!!!!!!!!!!!!!!!!!!!!!!!!!  hibernate needs a default constructor !!!!!!!!!!!!!!!!!!!!!!!
    }

    public Person(String name, int age, String gender, String address) {
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.address = address;
    }

    @Id
    @GeneratedValue
    @Column(name = "person_id", columnDefinition = "int")
    public int getPersonId() {
        return personId;
    }
    public void setPersonId(int personId) {this.personId = personId;} // !!!!!!!!!!!!!!!!!!!!!!!!!!  hibernate needs a default constructor !!!!!!!!!!!!!!!!!!!!!!!

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        this.age = age;
    }

    public String getGender() {
        return gender;
    }
    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getAddress() {
        return address;
    }
    public void setAddress(String address) {
        this.address = address;
    }
}
