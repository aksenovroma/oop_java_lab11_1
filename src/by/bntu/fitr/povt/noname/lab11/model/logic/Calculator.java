package by.bntu.fitr.povt.noname.lab11.model.logic;

import by.bntu.fitr.povt.noname.lab11.model.entity.Brigade;
import by.bntu.fitr.povt.noname.lab11.model.entity.Student;


public class Calculator {
    public static double calcAverageMark(Brigade brigade){
        if (brigade == null){
            return 0.0;
        }

        Student[] students = brigade.getStudents();
        double sumMark = 0.0;

        if (students == null || students.length == 0){
            return sumMark;
        }

        for (Student student : students){
            sumMark += student.getMark();
        }

        return sumMark / students.length;
    }
}
