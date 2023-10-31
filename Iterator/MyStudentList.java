package LearnPattern.Iterator;

public class MyStudentList extends StudentList implements Aggregate {

    public MyStudentList() {
        super();
    }

    public MyStudentList(int studentCount) {
        super(studentCount);
    }

    public MyStudentListIterator iterator() {
        return new MyStudentListIterator(this);
    }
}
