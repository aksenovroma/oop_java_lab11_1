package by.bntu.fitr.povt.noname.lab11.model.logic;

import by.bntu.fitr.povt.noname.lab11.model.entity.Brigade;
import by.bntu.fitr.povt.noname.lab11.model.entity.Student;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class CalculatorTest {
    private Brigade brigade1;
    private Brigade brigade2;
    private Brigade brigade3;
    private Brigade brigade4;


    @BeforeTest
    public void setBrigade(){
        Student student1 = new Student("Roma", 7.5);
        Student student2 = new Student("Leha", 7.0);
        Student student3 = new Student("Ilya", 6.5);

        Student[] students1 = new Student[]{student1, student2, student3};
        Student[] students2 = new Student[]{};
        Student[] students3 = null;

        brigade1 = new Brigade("no name 1", students1);
        brigade2 = new Brigade("no name 2", students2);
        brigade3 = new Brigade("no name 3", students3);
        brigade4 = null;
    }

    @Test
    public void calcAverageMarkTest(){
        double expected1 = 7.0;
        double actual1 = Calculator.calcAverageMark(brigade1);

        double expected2 = 0.0;
        double actual2 = Calculator.calcAverageMark(brigade2);

        double expected3 = 0.0;
        double actual3 = Calculator.calcAverageMark(brigade3);

        double expected4 = 0.0;
        double actual4 = Calculator.calcAverageMark(brigade4);

        Assert.assertEquals(expected1, actual1);
        Assert.assertEquals(expected2, actual2);
        Assert.assertEquals(expected3, actual3);
        Assert.assertEquals(expected4, actual4);
    }
}
