package uni;

import java.util.ArrayList;

public class Student {
    public int id;
    public static ArrayList<Student> studentList = new ArrayList<>();
    public int personID;
    public final int entranceYear;
    public int majorID;
    public String studentID;
    public static ArrayList<ArrayList<Integer>> studentIDBasedOnYear = new ArrayList<>();
    public static ArrayList<Integer> entranceYearList = new ArrayList<>();

    public Student(int newPersonID, int newEntranceYear, int newMajorID) {
        personID = newPersonID;
        entranceYear = newEntranceYear;
        majorID = newMajorID;
        id = studentList.size() + 1;
        studentList.add(this);

        int isInList = 0;
        int yearListIndex = -1;
        for (int i : entranceYearList) {
            if (i == entranceYear) {
                isInList = 1;
                yearListIndex = entranceYearList.indexOf(i);
                break;
            }
        }
        if (isInList == 0) {
            entranceYearList.add(entranceYear);
            studentIDBasedOnYear.add(new ArrayList<>());
            studentIDBasedOnYear.get(studentIDBasedOnYear.size() - 1).add(id);
        }
        else {
            studentIDBasedOnYear.get(yearListIndex).add(id);
        }

        setStudentCode();
    }

    public static Student findByID(int ID) {
        for (int i = 0; i < studentList.size(); i++) {
            if (i + 1 == ID) {
                return studentList.get(i);
            }
        }
        return null;
    }

    public void setStudentCode() {
        String idString = String.valueOf(id);
        int yearListIndex = 0;
        for (int i : entranceYearList) {
            if (i == entranceYear) {
                yearListIndex = entranceYearList.indexOf(i);
            }
        }
        for (int i : studentIDBasedOnYear.get(yearListIndex)) {
            if (i == id) {
                idString = String.valueOf(studentIDBasedOnYear.get(yearListIndex).indexOf(i) + 1);
            }
        }
        if (idString.length() == 1) {
            idString = "00" + idString;
        }
        else if (idString.length() == 2) {
            idString = "0" + idString;
        }
        String majorIDString = String.valueOf(majorID);
        if (majorIDString.length() == 1) {
            majorIDString = "0" + majorIDString;
        }
        studentID = String.valueOf(entranceYear) + majorIDString + idString;
    }
}
