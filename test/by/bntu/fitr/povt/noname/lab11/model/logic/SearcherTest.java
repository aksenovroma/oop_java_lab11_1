package by.bntu.fitr.povt.noname.lab11.model.logic;

import by.bntu.fitr.povt.noname.lab11.model.entity.Brigade;
import by.bntu.fitr.povt.noname.lab11.model.entity.Student;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class SearcherTest {
    private Brigade brigade1;
    private Brigade brigade2;
    private Brigade brigade3;
    private Brigade brigade4;
    private Student student1 = new Student("Roma", 7.5);
    private Student student2 = new Student("Leha", 7.0);
    private Student student3 = new Student("Ilya", 6.5);

    @BeforeTest
    public void setBrigadeAndStudent(){
        student1 = new Student("Roma", 7.5);
        student2 = new Student("Leha", 7.0);
        student3 = new Student("Ilya", 6.5);

        Student[] students1 = new Student[]{student1, student2, student3};
        Student[] students2 = new Student[]{};
        Student[] students3 = null;

        brigade1 = new Brigade("no name 1", students1);
        brigade2 = new Brigade("no name 2", students2);
        brigade3 = new Brigade("no name 3", students3);
        brigade4 = null;
    }

    @Test
    public void findStudentWithMaxMarkTest(){
        Student expected1 = student1;
        Student actual1 = Searcher.findStudentWithMaxMark(brigade1);

        Student expected2 = null;
        Student actual2 = Searcher.findStudentWithMaxMark(brigade2);

        Student expected3 = null;
        Student actual3 = Searcher.findStudentWithMaxMark(brigade3);

        Student expected4 = null;
        Student actual4 = Searcher.findStudentWithMaxMark(brigade4);

        Assert.assertEquals(expected1, actual1);
        Assert.assertEquals(expected2, actual2);
        Assert.assertEquals(expected3, actual3);
        Assert.assertEquals(expected4, actual4);
    }

    @Test
    public void findStudentWithMinMarkTest(){
        Student expected1 = student3;
        Student actual1 = Searcher.findStudentWithMinMark(brigade1);

        Student expected2 = null;
        Student actual2 = Searcher.findStudentWithMinMark(brigade2);

        Student expected3 = null;
        Student actual3 = Searcher.findStudentWithMinMark(brigade3);

        Student expected4 = null;
        Student actual4 = Searcher.findStudentWithMinMark(brigade4);

        Assert.assertEquals(expected1, actual1);
        Assert.assertEquals(expected2, actual2);
        Assert.assertEquals(expected3, actual3);
        Assert.assertEquals(expected4, actual4);
    }
}
