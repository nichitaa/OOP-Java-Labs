package com.company;

import java.util.ArrayList;
import java.util.List;

public class University {
    public String UniversityName;
    public int foundationYear;
    public List StudentsList = new ArrayList();

//    constructor
    public University(String n, int year, List students){
        UniversityName = n;
        foundationYear = year;
        StudentsList = students;
    }

//    metoda ce calculeaza si afizeaza mediile studentilor universitatii
    public void Average(){
        float total = 0;
        float average = 0;
        Student StudentIter;
        System.out.println(this.UniversityName + " Students Marks:");
        for (int i = 0; i < StudentsList.size(); i++){
            StudentIter = (Student) StudentsList.get(i); // extragem obiectul studentului din lista
            System.out.println(StudentIter.name + ": "+StudentIter.mark); // afisam numele si nota lui
            total += StudentIter.mark; // suma totala
        }
        average = total / StudentsList.size();
        System.out.println(this.UniversityName + " Students Average grade: " + average + "\n"); // afisam media
    }

}
