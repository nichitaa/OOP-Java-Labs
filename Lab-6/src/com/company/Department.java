package com.company;

import java.util.ArrayList;

public class Department {

    public Hospital hospital;
    public ArrayList<Staff> staffs = new ArrayList<>();

    Department(Hospital hospital) {
        this.hospital = hospital;
    }

    public void setStaffs(ArrayList<Staff> staffs) {
        this.staffs = staffs;
    }

}
