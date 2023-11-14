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

    public TTDirectory(String path, String name) {
        _path = path;
        _name = name;
        _list = new ArrayList<DirectoryEntry>();
        create();
    }

    public void add(TTFile add_file) {
        _list.add(add_file);
        add_file.move(new File(_path, _name).getPath());
    }

    public void add(TTDirectory add_dir) {
        _list.add(add_dir);
        add_dir.move(new File(_path, _name).getPath());
    }

    public void move(String new_path) {
        if (_dir == null)
            return;
        _path = new_path;
        _dir.renameTo(new File(new_path, _name));

    }

    public boolean create() {
        try {

            System.out.println("making file in " + _path + "  -   " + _name);
            _dir = new File(_path, _name);

            if (_dir.mkdirs()) {
                System.out.println("Directory created: " + _path);
                return true;
            } else {
                System.out.println("Directory already exists.");
            }

        } catch (Exception e) {

            System.out.println("An error occurred.");
            e.printStackTrace();
        }

        return false;
    }

    public boolean remove() {

        Iterator<DirectoryEntry> itr = _list.iterator();

        while (itr.hasNext()) {
            DirectoryEntry entry = itr.next();
            try {
                entry.remove();
            } catch (Exception e) {
                System.out.println("remove failed : " + entry.toString());
                e.printStackTrace();
            }

        }
        return _dir.delete();
    }

    @Override
    public String toString() {
        return _name;
    }
}
