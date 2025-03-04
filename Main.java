import base.*;
import uni.*;

public class Main {
    public static void main(String[] args) {
        Major ComputerScience = new Major("Computer Science", 50);
        Major Mathematics = new Major("Mathematics", 50);

        Person parsa = new Person("Parsa", "1");
        Person sara = new Person("Sara", "2");
        Person arya = new Person("Arya", "3");
        Person nafise = new Person("Nafise", "4");
        Person kourosh = new Person("Kourosh", "5");

        Student parsaSt = new Student(parsa.personID, 403, ComputerScience.majorID);
        ComputerScience.addStudent();
        Student saraSt = new Student(sara.personID, 402, ComputerScience.majorID);
        ComputerScience.addStudent();
        Student aryaSt = new Student(arya.personID, 403, Mathematics.majorID);
        Mathematics.addStudent();

        Professor nafisePr = new Professor(nafise.personID, ComputerScience.majorID);
        Professor kouroshPr = new Professor(kourosh.personID, Mathematics.majorID);

        Course ap = new Course("Advanced Programming", 4);
        PresentedCourse apPre = new PresentedCourse(ap.id, nafisePr.id, 50);
        apPre.addStudent(parsaSt.id);
        apPre.addStudent(saraSt.id);

        Course ds = new Course("Data Structures", 3);
        PresentedCourse dsPre = new PresentedCourse(ds.id, nafisePr.id, 50);
        dsPre.addStudent(parsaSt.id);
        dsPre.addStudent(saraSt.id);
        dsPre.addStudent(aryaSt.id);

        Course math = new Course("Math", 3);
        PresentedCourse mathPre = new PresentedCourse(math.id, kouroshPr.id, 50);
        mathPre.addStudent(aryaSt.id);

        Transcript parsaTr = new Transcript(parsaSt.id);
        parsaTr.setGrade(apPre.id, 17.5);
        parsaTr.setGrade(ds.id, 18);

        Transcript saraTr = new Transcript(saraSt.id);
        saraTr.setGrade(apPre.id, 18);
        saraTr.setGrade(dsPre.id, 16);

        Transcript aryaTr = new Transcript(aryaSt.id);
        aryaTr.setGrade(dsPre.id, 17);
        aryaTr.setGrade(mathPre.id, 19);

        parsaTr.printTranscript();
        saraTr.printTranscript();
        aryaTr.printTranscript();
    }
}
