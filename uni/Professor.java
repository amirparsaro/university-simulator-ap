package uni;

import java.util.ArrayList;

public class Professor {
    public int id;
    public static ArrayList<Professor> professorList = new ArrayList<Professor>();
    public int personID;
    public int majorID;

    public Professor(int newPersonID, int newMajorID) {
        personID = newPersonID;
        majorID = newMajorID;
        id = professorList.size() + 1;
        professorList.add(this);
    }

    public static Professor findByID (int ID) {
        for (int i = 0; i < professorList.size(); i++) {
            if (i + 1 == ID) {
                return professorList.get(i);
            }
        }
        return null;
    }
}
