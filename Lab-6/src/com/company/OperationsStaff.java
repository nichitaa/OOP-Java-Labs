package com.company;

import java.util.ArrayList;
import java.util.Date;

public class OperationsStaff extends Staff {

    public ArrayList<Patient> patients = new ArrayList<Patient>();

    OperationsStaff(Person person, Staff staff) {
        super(person, staff);
    }

    OperationsStaff(Person person, Staff staff, ArrayList patients) {
        super(person, staff);
        this.patients = patients;
    }

    public void setPatientsForOperationsStaff(ArrayList<Patient> patients) {
        this.patients = patients;
    }
}
