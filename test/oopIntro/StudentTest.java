package oopIntro;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StudentTest {

    @Test
    void displayCourses() {
    }

    @Test
    void calculateGPA() {
        Course gpaTest = new Course(0,12,"gpatest", "hopefully this works", 3);
        Course gpaTest1 = new Course(1, 13,"gpatest1","part2",3);
        Course gpaTest2 = new Course(2, 14, "gpatest2", "part3", 3);
        Student gpaTestStudent =  new Student(0,"gpaTest");
        gpaTestStudent.enrollCourse(gpaTest);
        gpaTestStudent.enrollCourse(gpaTest1);
        gpaTestStudent.enrollCourse(gpaTest2);
        gpaTestStudent.setGrade(gpaTest, 90.0);
        gpaTestStudent.setGrade(gpaTest1, 70.0);
        gpaTestStudent.setGrade(gpaTest2, 80.0);
        assertEquals(2160, gpaTestStudent.calculateGPA());

    }

    @Test
    void enrollCourse() {

    }

    @Test
    void setGrade() {
        Course gradeTest = new Course(0,12,"test", "testing", 3);
        Student studentGradeTest = new Student(1,"testingStudent");
        studentGradeTest.enrollCourse(gradeTest);
        studentGradeTest.setGrade(gradeTest,80.0);
        assertTrue(studentGradeTest.setGrade(gradeTest, 80.0));

        Course gradeTest1 = new Course(1,13,"test1", "testing1", 4);
        Student studentGradeTest1 = new Student(1,"testingStudent1");
        studentGradeTest1.setGrade(gradeTest1,80.0);
        assertFalse(studentGradeTest.setGrade(gradeTest1, 80.0));




    }

    @Test
    void getEnrolledCourses() {
        Course coursetest = new Course(0,12,"test","for testing purposes",3);
        Student studentCourseTest = new Student(0,"testingStudent");
        studentCourseTest.enrollCourse(coursetest);
    }
}