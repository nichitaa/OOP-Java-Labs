package com.company;

import java.util.Date;

public class Staff extends Person {

    public Date joined;
    public String[] education;
    public String[] certification;
    public String[] languages;

    public Department department;

    Staff(Person person, Date date, String[] education, String[] certification, String[] languages, Department dep) {
        super(person);
        this.joined = date;
        this.education = education;
        this.certification = certification;
        this.languages = languages;
        this.department = dep;
    }
    Staff(Person person , Staff staff) {
        super(person);
        this.joined = staff.joined;
        this.education = staff.education;
        this.certification = staff.certification;
        this.languages = staff.languages;
        this.department = staff.department;
    }
}
