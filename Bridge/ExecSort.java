package LearnPattern.Bridge;

public class ExecSort {
    
    public static void main(String[] args){
        Object[] myArray = {1,5,2,6,3,4,9};

        QuickSorter sorter = new QuickSorter();
        sorter.sort(myArray);

        for (Object item : myArray) {
            System.out.print(item + " ");
        }
    }
}
