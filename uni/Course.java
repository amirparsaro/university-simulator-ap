package uni;

import java.util.ArrayList;

public class Course {
    public int id;
    public static ArrayList<Course> courseList = new ArrayList<>();
    public String title;
    public int units;

    public Course(String newTitle, int newUnits) {
        title = newTitle;
        units = newUnits;
        id = courseList.size() + 1;
        courseList.add(this);
    }

    public static Course findByID (int ID) {
        for (int i = 0; i < courseList.size(); i++) {
            if (i + 1 == ID) {
                return courseList.get(i);
            }
        }
        return null;
    }
}