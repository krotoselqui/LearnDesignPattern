package LearnPattern.Composite.TestTree;

public interface DirectoryEntry {
    public boolean create();
    public boolean remove();
    public void move(String new_path);
}
