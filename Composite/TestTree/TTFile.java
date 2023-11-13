package LearnPattern.Composite.TestTree;

import java.io.File;

public class TTFile implements DirectoryEntry{

    private File _file;
    private String _path;

    public TTFile(String path){
        _path = path;
    }
    public void create(){
        _file = new File(_path);
    }
    public void remove(){
        _file.delete();
    }
}
