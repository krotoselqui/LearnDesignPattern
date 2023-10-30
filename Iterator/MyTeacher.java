package LearnIterator;

import java.util.List;
import java.util.ArrayList;

public class MyTeacher extends Teacher {

    protected List<MyStudent> students;

    public void createStudentList() {
        List<MyStudent> students = new ArrayList<MyStudent>();
        students.add(new MyStudent("赤井亮太", 1));
        students.add(new MyStudent("赤羽里美", 2));
        students.add(new MyStudent("岡田美央", 2));
        students.add(new MyStudent("西森俊介", 1));
        students.add(new MyStudent("中ノ森玲菜", 2));

        this.students = students;
    }

    public void callStudents() {
        if (students == null)
            return;

        for (MyStudent s : students) {
            System.out.println(s.getName());
        }
    }
}
