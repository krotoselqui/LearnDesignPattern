package LearnPattern.Composite;

import java.util.List;
import java.util.ArrayList;
import java.util.Iterator;

public class Directory {
    private List<Object> list = null;
    private String name = null;
    public Directory(String name){
        this.name = name;
        list = new ArrayList<Object>();
    }
    public void add(File file){
        list.add(file);
    }
    public void add(Directory dir){
        list.add(dir);
    }
    public void remove(){
        Iterator<Object> itr = list.iterator();
        while(itr.hasNext()){
            Object obj = itr.next();
            if(obj instanceof File){
                ((File)obj).remove();
            }else if(obj instanceof Directory){
                ((Directory)obj).remove();
            }else{
                System.out.println("削除できません");
            }
        }
        System.out.println(name + "を削除しました");
    }
}
