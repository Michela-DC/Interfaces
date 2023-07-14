//        define a Java superclass CollegePerson that has:
//          3 attributes (name, surname and a numeric collegeId)
//          a method goToCollege that prints all the CollegePerson attributes

public class CollegePerson {
    protected String name;
    protected String surname;
    protected int collegeId;

    public void goToCollege() {
        System.out.println(name + " " + surname + " " + collegeId);
    }
}
