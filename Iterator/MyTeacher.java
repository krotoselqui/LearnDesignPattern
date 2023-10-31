package LearnPattern.Iterator;

public class MyTeacher extends Teacher {

    protected MyStudentList myStudentList;
    
    public void createStudentList() {

        myStudentList = new MyStudentList(5);

        myStudentList.add(new MyStudent("赤井亮太", 1));
        myStudentList.add(new MyStudent("赤羽里美", 2));
        myStudentList.add(new MyStudent("岡田美央", 2));
        myStudentList.add(new MyStudent("西森俊介", 1));
        myStudentList.add(new MyStudent("中ノ森玲菜", 2));

    }

    public void callStudents() {

        Iterator itr = myStudentList.iterator();

        while(itr.hasNext()){
            Student m = (Student)(itr.next());
            System.out.println(m.getName());
        }

    }
}
