//       considering that an assistant is a CollegePerson that can learn and teach, define a subclass Assistant that:
//          implements the right interfaces and overrides the abstract methods with informative messages
//          has an attribute of type boolean called isGoingToBeAPhD
//          has a constructor that takes 4 params (name, surname, id, willBeAPhD) and assigns their values to the right attributes

public class Assistant extends CollegePerson implements LearningPerson, TeachingPerson{

    private boolean isGoingToBeAPhD;

    public Assistant(String name, String surname, int id, boolean willBeaAPhD) {
        super(name, surname, id);
        isGoingToBeAPhD = willBeaAPhD;
    }

    @Override
    public void studyAtHome() {
        System.out.println(name + " " + surname + " likes to study in the libraby" );
    }

    @Override
    public void teachToOtherPeople() {
        System.out.println(name + " " + surname + " likes to teach to other people");
        System.out.println("Is " + name + " " + surname + " going to be a PhD? " + isGoingToBeAPhD);
    }
}
