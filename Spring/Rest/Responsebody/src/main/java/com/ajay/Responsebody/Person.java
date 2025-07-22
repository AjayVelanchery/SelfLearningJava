package com.ajay.Responsebody;

// Class
public class Person {

    // Attributes of Person
    int id;
    String name;
    int age;

    // Constructor of this class
    public Person(int id, String name, int age) {

        // this keyword refers to current instance object
        this.id = id;
        this.name = name;
        this.age = age;
    }

    // Method of Person class
    // toString() method
    public String toString() {

        // Simply returning the name and age of person
        return id + " " + name + " " + age;
    }}