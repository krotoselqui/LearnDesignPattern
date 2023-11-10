package LearnPattern.Bridge;

public class ExecSort {
    
    public static void main(String[] args){
        Object[] myArray = {1,5,2,6,3,4,9,15,439,524,22,16,534,23,102};

        TimerSorter sorter= new TimerSorter(new QuickSorter());
        sorter.timerSorter(myArray);

        for (Object item : myArray) {
            System.out.print(item + " ");
        }
    }
}