package com.company;

import java.util.Date;

public class SurgicalTechnologist extends Technologist {
    SurgicalTechnologist(Person person, Date date, String[] education, String[] certification, String[] languages, Department dep) {
        super(person, date, education, certification, languages, dep);
    }
}
