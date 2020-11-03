package com.company;

import java.util.ArrayList;

public class Hospital {

    public String hospitalName;
    public String address;
    public String phone;

    public ArrayList<Person> persons = new ArrayList<Person>();
    public ArrayList<Department> departments = new ArrayList<Department>();

    public Hospital(String id, String address, String phone, ArrayList<Person> persons) {
        this.hospitalName = id;
        this.address = address;
        this.phone = phone;
        this.persons = persons;
    }

    public void showPersonsFirstName() {
        for(int i=0; i<persons.size(); i++) {
            System.out.println(persons.get(i).givenName);
        }
    }

    public void setDepartments(ArrayList<Department> deps) {
        this.departments = deps;
    }
}
