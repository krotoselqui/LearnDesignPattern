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

    public void move(String new_path) {
        if (_file == null)
            return;
        _path = new_path;
        _file.renameTo(new File(new_path, _name));
    }

    public boolean create() {

        try {

            System.out.println("making file in" + _path + "  -   " + _name);
            _file = new File(_path, _name);

            if (_file.createNewFile()) {
                System.out.println("File created: " + _file.getName());
                return true;
            } else {
                System.out.println("File already exists.");
            }

        } catch (Exception e) {

            System.out.println("An error occurred.");
            e.printStackTrace();

        }

        return false;
    }

    public boolean remove() {

        if (_file == null)
            return false;

        return _file.delete();
    }

    @Override
    public String toString() {
        return _name;
    }
}
