package LearnPattern.Composite;

import java.util.List;
import java.util.ArrayList;
import java.util.Iterator;

public class Directory implements DirectoryEntry {
    private List<DirectoryEntry> list = null;
    private String name = null;
    public Directory(String name){
        this.name = name;
        list = new ArrayList<DirectoryEntry>();
    }
    public void add(File file){
        list.add(file);
    }
    public void add(Directory dir){
        list.add(dir);
    }
    public void remove(){
        Iterator<DirectoryEntry> itr = list.iterator();
        while(itr.hasNext()){
            DirectoryEntry entry = itr.next();
            //Object obj = itr.next();
            entry.remove();
        }
        System.out.println(name + "を削除しました");
    }
}
