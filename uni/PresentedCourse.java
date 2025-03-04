package uni;

import java.util.ArrayList;

import java.util.ArrayList;

public class PresentedCourse {
    public int id;
    public static ArrayList<PresentedCourse> presentedCourseList = new ArrayList<>();
    public int courseID;
    public int professorID;
    public int capacity;
    public ArrayList<Integer> studentids = new ArrayList<>();

    public PresentedCourse(int newCourseID, int newProfessorID, int maxCapacity) {
        courseID = newCourseID;
        professorID = newProfessorID;
        capacity = maxCapacity;
        id = presentedCourseList.size() + 1;
        presentedCourseList.add(this);
    }

    public static PresentedCourse findByID(int ID) {
        for (int i = presentedCourseList.size() - 1; i >= 0; i--) {
            if (i + 1 == ID) {
                return presentedCourseList.get(i);
            }
        }
        return null;
    }

    public void addStudent(int studentID) {
        if (studentids.size() < capacity)
            studentids.add(studentID);
        else
            System.out.println("[ERROR] Max capacity reached for this certain course.");
    }
}