package base;

import java.util.ArrayList;

public class Person {
    public int personID;
    public static ArrayList<Person> personList = new ArrayList<Person>();
    public String name;
    public String nationalID;

    public Person(String newName, String newNationalID) {
        name = newName;
        nationalID = newNationalID;
        personID = personList.size() + 1;
        personList.add(this);
    }

    public static Person findByID(int ID) {
        for (int i = 0; i < personList.size(); i++) {
            if (i + 1 == ID) {
                return personList.get(i);
            }
        }
        return null;
    }
}