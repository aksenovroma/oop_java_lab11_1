package by.bntu.fitr.povt.noname.lab11.controller;

import by.bntu.fitr.povt.noname.lab11.model.entity.Brigade;
import by.bntu.fitr.povt.noname.lab11.model.entity.Student;
import by.bntu.fitr.povt.noname.lab11.model.logic.Calculator;
import by.bntu.fitr.povt.noname.lab11.model.logic.Searcher;
import by.bntu.fitr.povt.noname.lab11.util.PrinterCreator;
import by.bntu.fitr.povt.noname.lab11.view.Printable;
import by.bntu.fitr.povt.noname.lab11.view.PrinterType;

public class Main {
    public static void main(String[] args) {
        Printable printer = PrinterCreator.create(PrinterType.CONSOLE);

        Student student1 = new Student("Roma", 7.5);
        Student student2 = new Student("Leha", 8);
        Student student3 = new Student("Ilya", 6.9);

        Brigade brigade = new Brigade("no name", student1, student2);

        printer.print(brigade);

        brigade.add(student3);
        printer.print("add: " + brigade);

        brigade.remove(student2);
        printer.print("remove: " + brigade);

        double averageMark = Calculator.calcAverageMark(brigade);
        printer.print("averageMark: " + averageMark);

        Student studentWithMaxMark = Searcher.findStudentWithMaxMark(brigade);
        printer.print("student with max mark: " + studentWithMaxMark);

        Student studentWithMinMark = Searcher.findStudentWithMinMark(brigade);
        printer.print("student with min mark: " + studentWithMinMark);

        brigade.replaceByIndex(student2, 0);
        printer.print(brigade);

        boolean atBrigade = brigade.isAtBrigade(student1);
        printer.print("is student at brigade: " + atBrigade);
    }
}
