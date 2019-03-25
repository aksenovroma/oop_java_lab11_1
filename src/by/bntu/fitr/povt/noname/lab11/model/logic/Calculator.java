package by.bntu.fitr.povt.noname.lab11.model.logic;

import by.bntu.fitr.povt.noname.lab11.model.entity.Brigade;
import by.bntu.fitr.povt.noname.lab11.model.entity.Student;


public class Calculator {
    public static double calcAverageMark(Brigade brigade) {
        if (brigade != null && brigade.getStudents() != null) {
            double sumMark = 0.0;

            for (Student student : brigade.getStudents()){
                sumMark += student.getMark();
            }

            return sumMark / brigade.size();
        }
        return 0.0;
    }
}
