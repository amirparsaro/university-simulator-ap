package uni;

import base.Person;

import java.util.ArrayList;

public class Major {
    public int majorID;
    public static ArrayList<Major> majorList = new ArrayList<Major>();
    public String name;
    public final int capacity;
    public int numberOfStudents = 0;

    public Major(String newName, int newCapacity) {
        name = newName;
        capacity = newCapacity;
        majorID = majorList.size() + 1;
        majorList.add(this);
    }

    public static Major findByID(int ID) {
        for (int i = 0; i < majorList.size(); i++) {
            if (i + 1 == ID) {
                return majorList.get(i);
            }
        }
        return null;
    }

    public void addStudent() {
        if (numberOfStudents < capacity)
            numberOfStudents++;
        else
            System.out.println("[ERROR] Max capacity reached for this certain major.");
    }
}
