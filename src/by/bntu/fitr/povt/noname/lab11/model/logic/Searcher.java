package by.bntu.fitr.povt.noname.lab11.model.logic;

import by.bntu.fitr.povt.noname.lab11.model.entity.Brigade;
import by.bntu.fitr.povt.noname.lab11.model.entity.Student;


public class Searcher {
    public static Student findStudentWithMaxMark(Brigade brigade){
        if (brigade == null){
            return null;
        }

        Student[] equipment = brigade.getStudents();

        if (equipment == null || equipment.length == 0){
            return null;
        }

        Student maxPowerEquipment = equipment[0];

        for (Student anEquipment : equipment) {
            if (maxPowerEquipment.getMark() < anEquipment.getMark()) {
                maxPowerEquipment = anEquipment;
            }
        }
        return maxPowerEquipment;
    }

    public static Student findStudentWithMinMark(Brigade brigade){
        if (brigade == null){
            return null;
        }

        Student[] equipment = brigade.getStudents();

        if (equipment == null || equipment.length == 0){
            return null;
        }

        Student minPowerEquipment = equipment[0];

        for (Student anEquipment : equipment) {
            if (minPowerEquipment.getMark() > anEquipment.getMark()) {
                minPowerEquipment = anEquipment;
            }
        }
        return minPowerEquipment;
    }
}