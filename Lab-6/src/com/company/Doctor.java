package com.company;

import java.util.ArrayList;

public class Doctor extends OperationsStaff{

    public String[] speciality;
    public String[] locations;

    public Person person;
    public Staff staff;


    Doctor(Person person, Staff staff,
           String[] speciality, String[] locations) {
        super(person, staff);
        this.person = person;
        this.staff = staff;
        this.speciality = speciality;
        this.locations = locations;
    }

    Doctor(Doctor doctor, ArrayList<Patient> patients) {
        super(doctor.person, doctor.staff, patients);
        this.speciality = doctor.speciality;
        this.locations = doctor.locations;
    }

}
