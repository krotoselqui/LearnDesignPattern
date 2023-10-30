package LearnIterator;

public class Main {
    public static void main(String args[])
    {
        // Student a = new Student("Kimura",1);
        // MyStudent b = new MyStudent("Tanaka",2);
        // Student c = new MyStudent("Hanada",2);

        // System.out.println(a.getName());
        // System.out.println(b.getName());
        // System.out.println(c.getName());

        Teacher you = new MyTeacher();
        you.createStudentList();
        you.callStudents();
    }
}
