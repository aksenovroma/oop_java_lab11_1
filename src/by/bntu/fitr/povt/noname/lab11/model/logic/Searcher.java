package by.bntu.fitr.povt.noname.lab11.model.logic;

import by.bntu.fitr.povt.noname.lab11.model.entity.Brigade;
import by.bntu.fitr.povt.noname.lab11.model.entity.Student;


public class Searcher {
    public static Student findStudentWithMaxMark(Brigade brigade){
        if (brigade != null && brigade.getStudents() != null) {

            Student maxMarkStudent = brigade.getStudents()[0];

            for (Student student : brigade.getStudents()) {
                if (maxMarkStudent.getMark() < student.getMark()) {
                    maxMarkStudent = student;
                }
            }
            return maxMarkStudent;
        }
        return null;
    }

    public static Student findStudentWithMinMark(Brigade brigade){
        if (brigade != null && brigade.getStudents() != null) {

            Student minMarkStudent = brigade.getStudents()[0];

            for (Student student : brigade.getStudents()) {
                if (minMarkStudent.getMark() > student.getMark()) {
                    minMarkStudent = student;
                }
            }
            return minMarkStudent;
        }
        return null;
    }
}