package LearnPattern.Iterator;

public class Main {
    public static void main(String args[])
    {
        Teacher you = new MyTeacher();
        you.createStudentList();
        you.callStudents();

        Teacher veteran = new VeteranTeacher();
        veteran.createStudentList();
        veteran.callStudents();
    }
}
