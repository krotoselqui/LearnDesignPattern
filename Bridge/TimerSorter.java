package LearnPattern.Bridge;

public class TimerSorter extends Sorter {
    
    public void timerSorter(Object obj[]) {
        long start = System.currentTimeMillis();
        sort(obj);
        long end = System.currentTimeMillis();
        System.out.println("time:" + (end - start));
    }

    public void sort(Object[] obj){
        QuickSorter q = new QuickSorter();
        q.sort(obj);
    }
}
