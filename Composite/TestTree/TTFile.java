package LearnPattern.Composite.TestTree;

import java.io.File;

public class TTFile implements DirectoryEntry {

    private File _file;
    private String _path;
    private String _name;

    public TTFile(String path, String name) {

        _path = path;
        _name = name;
        create();

    }

    public void create() {
        
        try {

            System.out.println("making file in" + _path + "  -   " + _name);
            _file = new File(_path, _name);

            if (_file.createNewFile()) {
                System.out.println("File created: " + _file.getName());
            } else {
                System.out.println("File already exists.");
            }

        } catch (Exception e) {

            System.out.println("An error occurred.");
            e.printStackTrace();
            
        }
    }

    public void remove() {

        if(_file == null) return;

        _file.delete();
    }
}
