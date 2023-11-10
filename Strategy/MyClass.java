package LearnPattern.Strategy;

import java.util.Comparator;

public class MyClass {
    // public int compare(Human h1,Human h2){
    //     return new AgeComparator().compare(h1,h2);
    // }

    private Comparator comparator = null;
    public MyClass(Comparator comparator){
        this.comparator = comparator;
    }
    public int compare(Human h1,Human h2){
        return comparator.compare(h1, h2);
    }

}