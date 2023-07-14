//  considering that a student is a CollegePerson that can learn, define a subclass Student that:
//          implements the right interface and overrides the abstract method with an informative message
//          has an attribute academicYear of type int
//          has a constructor that takes 4 params (name, surname, id, year) and assigns their values to the right attributes

import java.text.DateFormat;


public class Student extends CollegePerson implements LearningPerson{
    private int accademicYear;

    public Student(String name, String surname, int id, int year) {
        this.name = name;
        this.surname = surname;
        this.collegeId = id;
        this.accademicYear = year;
    }

    @Override
    public void studyAtHome() {
        System.out.println(name + " " + surname + " prefers to study at home");
    }
}
