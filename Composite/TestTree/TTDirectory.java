package LearnPattern.Composite.TestTree;

import java.io.File;
import java.util.List;
import java.util.ArrayList;
import java.util.Iterator;


public class TTDirectory implements DirectoryEntry {

    private List<DirectoryEntry> _list = null;
    private File _dir;
    private String _path;
    private String _name;

    public TTDirectory(String path,String name) {
        _path = path;
        _name = name;
        _list = new ArrayList<DirectoryEntry>();
        create();
    }

    public void add(TTFile file){
        _list.add(file);
    }

    public void add(TTDirectory dir){
        _list.add(dir);
    }

    public void create(){
        try {

            System.out.println("making file in" + _path + "  -   " + _name);
            _dir = new File(_path, _name);

            if (_dir.mkdirs()) {
                System.out.println("Directory created: " + _path);
            } else {
                System.out.println("Directory already exists.");
            }

        } catch (Exception e) {

            System.out.println("An error occurred.");
            e.printStackTrace();
            
        }
    }

    public void remove(){
        Iterator<DirectoryEntry> itr = _list.iterator();
        while(itr.hasNext()){
            DirectoryEntry entry = itr.next();
            entry.remove();
        }
    }
}
