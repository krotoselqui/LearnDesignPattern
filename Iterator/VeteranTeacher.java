package LearnPattern.Iterator;

public class VeteranTeacher extends Teacher{
    private MyStudentList list;
    public void createStudentList(){
        list = new MyStudentList(3);
        list.add(new Student("中川雄介",1));
        list.add(new Student("坂東恵美",2));
        list.add(new Student("水島太郎",1));
    }
    public void callStudents(){
        Iterator itr = list.iterator();
        while(itr.hasNext()){
            System.out.println(((Student)itr.next()).getName());
        }
    }
}
