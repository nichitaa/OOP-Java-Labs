package com.company;

import java.util.Date;

public class Technician extends TechnicalStaff {
    Technician(Person person, Date date, String[] education, String[] certification, String[] languages, Department dep) {
        super(person, date, education, certification, languages, dep);
    }
}
