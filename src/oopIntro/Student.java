package oopIntro;

import java.sql.SQLOutput;
import java.util.*;


public class Student {
    int id;
    String name;
    HashMap<Integer, Double> grades;
    List<Course> enrolledCourses;
    public Student(int id, String name) {
        this.id = id;
        this.name = name;
        this.grades = new HashMap<>();
        this.enrolledCourses = new ArrayList<>();

    }
    public void displayCourses() {
        for(int i = 0; i < enrolledCourses.size(); i++){
            System.out.println(enrolledCourses.get(i));
        }
    }

    public double calculateGPA() {
        double gpa = 0;
        int totalCredits = 0;
        double counter = 0.0;
        for (Course c : this.enrolledCourses) {
            gpa = gpa + (this.grades.get(c.getID())*c.getCredit());
            totalCredits = totalCredits + c.getCredit();
            counter = counter + 1.0;

            }
        gpa = gpa/counter;
        gpa = gpa*totalCredits;
        return gpa;
        }

    public void enrollCourse(Course course) {
        enrolledCourses.add(course);
    }
    public boolean setGrade(Course course, double grade) {
        if(enrolledCourses.contains(course)){
            grades.put(course.getID(), grade);
            return true;
        }
        return false;
    }
    public List<Course> getEnrolledCourses() {
        return enrolledCourses;
    }

}

