package com.company;

import java.util.Date;

public class Technologist extends TechnicalStaff {
    Technologist(Person person, Date date, String[] education, String[] certification, String[] languages, Department dep) {
        super(person, date, education, certification, languages, dep);
    }
}
