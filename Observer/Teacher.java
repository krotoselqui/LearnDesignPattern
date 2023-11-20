package LearnPattern.Observer;

//import java.util.*;

public class Teacher {
    //Map<String,Integer> runCount = new HashMap<String,Integer>();
    private int _count;

    public void update(Student student,int count){
        _count += count;
        System.out.println(_count);
    }
    
    
}
