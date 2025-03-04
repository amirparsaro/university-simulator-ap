package uni;

import base.Person;
import java.util.HashMap;

public class Transcript {
    public int studentID;
    public HashMap<Integer, Double> transcript;

    public Transcript(int newStudentID) {
        studentID = newStudentID;
        transcript = new HashMap<Integer, Double>();
    }

    public void setGrade(int presentedCourseID, double grade) {
        transcript.put(presentedCourseID, grade);
    }

    public void printTranscript() {
        String name = Person.findByID(Student.findByID(studentID).personID).name;
        String stdID = Student.findByID(studentID).studentID;
        System.out.println("============ Student Transcript ============");
        System.out.println("Name: " + name + " | " + "StudentID: " + stdID);
        System.out.println();

        for (int i : transcript.keySet()) {
            String courseTitle = Course.findByID(PresentedCourse.findByID(i).courseID).title;
            System.out.println("Course: " + courseTitle + " | " + "Grade: " + transcript.get(i));
        }
        System.out.println();

        System.out.printf("Average Grade:  %.2f\n", getGPA());
        System.out.println();
    }

    public double getGPA() {
        double sum = 0;
        int sumOfUnits = 0;
        for (int i : transcript.keySet()) {
            int courseUnits = Course.findByID(PresentedCourse.findByID(i).courseID).units;
            sum += transcript.get(i) * courseUnits;
            sumOfUnits += courseUnits;
        }
        return sum / sumOfUnits;
    }
}
