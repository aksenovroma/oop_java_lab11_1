package by.bntu.fitr.povt.noname.lab11.model.logic;

import by.bntu.fitr.povt.noname.lab11.model.entity.Brigade;
import by.bntu.fitr.povt.noname.lab11.model.entity.Student;


public class Calculator {
    public static double calcAverageMark(Brigade brigade){
        if (brigade == null){
            return 0;
        }

        Student[] students = brigade.getStudents();
        double averageMark = 0;

        for (Student student : students){
            averageMark += student.getMark();
        }

        return averageMark / students.length;
    }
}
