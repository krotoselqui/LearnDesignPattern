package LearnPattern.Iterator;

public class NewStudentListIterator extends NewStudentList implements Iterator{

    private NewVeteranStudentList newVeteranStudentList;
    private int index;

    public NewStudentListIterator(NewVeteranStudentList list){
        this.newVeteranStudentList = list;
        this.index = 0;
    }

    public boolean hasNext(){
        if(newVeteranStudentList.getLastNum() > index){
            return true;
        }else{
            return false;
        }
    }

    public Student next(){
        return newVeteranStudentList.getStudentAt(index);
    }
}
