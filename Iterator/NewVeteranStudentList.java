package LearnPattern.Iterator;

public class NewVeteranStudentList extends NewStudentList implements Aggregate{
    public NewStudentListIterator iterator() {
        return new NewStudentListIterator(this);
    }
}
