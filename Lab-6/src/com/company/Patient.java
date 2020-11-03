package com.company;

import java.util.ArrayList;
import java.util.Date;

public class Patient extends Person{

    public String id;
    public int age;
    public Date accepted;
    public String[] history;
    public String[] prescriptions;
    public String[] allergies;
    public String[] specialReqs;

    public ArrayList<OperationsStaff> opsStaffs = new ArrayList<OperationsStaff>();

    Patient(Person person, String id, int age, Date accepted, String[] history, String[] prescriptions, String[] allergies, String[] specialReqs ) {
        super(person);
        this.id = id;
        this.age = age;
        this.accepted = accepted;
        this.history = history;
        this.prescriptions = prescriptions;
        this.allergies = allergies;
        this.specialReqs = specialReqs;
    }

    public void setOpsStaffsForPatient(ArrayList<OperationsStaff> ops) {
        this.opsStaffs = ops;
    }
}
