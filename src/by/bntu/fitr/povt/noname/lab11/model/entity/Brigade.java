package by.bntu.fitr.povt.noname.lab11.model.entity;

import java.util.Arrays;
import java.util.Objects;

public class Brigade {

    private String name;
    private Student[] students;

    public Brigade() {
    }

    public Brigade(String name, Student... students) {
        this.name = name;
        this.students = students;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Student[] getStudents() {
        return students;
    }

    public void setStudents(Student[] students) {
        this.students = students;
    }

    public int size() {
        return students.length;
    }

    public void add(Student student) {
        Student[] newEquipment = new Student[students.length + 1];

        System.arraycopy(students, 0, newEquipment, 0, students.length);
        newEquipment[students.length] = student;

        students = newEquipment;
    }

    public void remove(Student student) {
        if (isAtBrigade(student)) {
            Student[] newEquipment = new Student[students.length - 1];

            for (int i = 0, j = 0; i < students.length; i++, j++) {
                if (!(student.equals(students[i]))) {
                    newEquipment[j] = students[i];
                } else {
                    j--;
                }
            }
            students = newEquipment;
        }
    }

    public void replaceByIndex(Student student, int index) {
        if (student == null || (index > students.length - 1 || index < 0)) {
            return;
        }

        students[index] = student;
    }

    public boolean isAtBrigade(Student student) {
        if (student == null) {
            return false;
        }

        for (Student student1 : students) {
            if (student.equals(student1)) {
                return true;
            }
        }
        return false;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Brigade brigade = (Brigade) o;
        return Objects.equals(name, brigade.name) &&
                Arrays.equals(students, brigade.students);
    }

    @Override
    public int hashCode() {
        int result = Objects.hash(name);
        result = 31 * result + Arrays.hashCode(students);
        return result;
    }

    @Override
    public String toString() {
        return "Brigade{" +
                "name='" + name + '\'' +
                ", students=" + Arrays.toString(students) +
                '}';
    }
}
