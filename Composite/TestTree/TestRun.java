package LearnPattern.Composite.TestTree;

public class TestRun {

    public static void main(String[] args) {

        try {

            String cwd = System.getProperty("user.dir");
            cwd += "\\LearnPattern\\Composite\\TestTree\\TestDir";

            TTFile ttfile1 = new TTFile(cwd, "file1");
            TTFile ttfile2 = new TTFile(cwd, "file2");
            TTFile ttfile3 = new TTFile(cwd, "file3");
            TTFile ttfile4 = new TTFile(cwd, "file4");
            TTDirectory ttdir1 = new TTDirectory(cwd, "dir1");
            ttdir1.add(ttfile1);

            TTDirectory ttdir2 = new TTDirectory(cwd, "dir2");
            ttdir2.add(ttfile2);
            ttdir2.add(ttfile3);
            ttdir1.add(ttdir2);
            ttdir1.add(ttfile4);

            System.out.println( ttdir1.remove());
         
            ttdir1 = null;
            ttdir2 = null;

        } catch (Exception e) {

            System.out.println("An error occurred.");
            e.printStackTrace();

        }

    }

}
