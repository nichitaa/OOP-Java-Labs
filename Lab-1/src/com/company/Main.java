package com.company;
import java.util.Arrays;
import java.util.List;


public class Main {

    public static void main(String[] args) {

//        6 studentii : (nume, varsta, medie)
        Student Student1 = new Student("Ion", 19, 8.7f);
        Student Student2 = new Student("Vasile", 20, 6.7f);
        Student Student3 = new Student("Dan", 18, 9.7f);
        Student Student4 = new Student("Petru", 21, 7.4f);
        Student Student5 = new Student("Alexandru", 20, 9.9f);
        Student Student6 = new Student("Mark", 18, 5.5f);

//        lista de studenti din UTM, ASEM, MED
        List<Student> listSudentsUTM = Arrays.asList( Student1,Student2);
        List<Student> listSudentsASEM = Arrays.asList( Student3,Student4);
        List<Student> listSudentsMED = Arrays.asList( Student5,Student6);

//        lista de universitat (numeleUniversitatii, anul, listaDeStudenti)
        University UTM = new University("UTM", 1960, listSudentsUTM);
        University ASEM = new University("ASEM", 1975, listSudentsASEM);
        University MED = new University("MED", 1955, listSudentsMED);

//        pentru a afisa atributele studentilor din diferite universitati
//        ex: studentul1 din UTM
        Student StudentExample;
        StudentExample = (Student) UTM.StudentsList.get(1);
        StudentExample.ShowStudentInfo();

//        calculam si afisam mediile studentilor per universitate
        UTM.Average();
        ASEM.Average();
        MED.Average();

    }
}
