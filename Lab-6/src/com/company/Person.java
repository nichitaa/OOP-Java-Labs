package com.company;

import java.util.Date;

public class Person {
    public String title;
    public String givenName;
    public String middleName;
    public String familyName;
    public Date birthDate;
    // I dont see any sense for making another classes to represent the address,
    // gender and phone , I will use strings instead
    public String homeAddress;
    public String gender;
    public String phone;

    // It can be done such that a person can have multiple hospitals using an arrayList
    // Examples with arrayList I have implemented in other relations. (ex: department-staff)
    // in order not to create multiple dumb objects, I will use the relation that a
    // person can be linked only to one hospital
    public Hospital hospital;

    Person(String title, String givenName, String middleName, String familyName, Date birthDate, String gender, String homeAddress, String phone) {
        this.title = title;
        this.givenName = givenName;
        this.middleName = middleName;
        this.familyName = familyName;
        this.birthDate = birthDate;
        this.gender = gender;
        this.homeAddress = homeAddress;
        this.phone = phone;
    }

    // constructor for the classes where Person is super class
    Person(Person person) {
        this.title = person.title;
        this.givenName = person.givenName;
        this.middleName = person.middleName;
        this.familyName = person.familyName;
        this.birthDate = person.birthDate;
        this.gender = person.gender;
        this.homeAddress = person.homeAddress;
        this.phone = person.phone;
    }

    public String getFullName() {
        String FullName = this.givenName + " " + this.middleName + " " + this.familyName;
        return FullName;
    }

    public void setHospital(Hospital hospital) {
        this.hospital = hospital;
    }

}
