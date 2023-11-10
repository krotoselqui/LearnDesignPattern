package LearnPattern.Strategy;

public class MyClass {
    public int compare(Human h1,Human h2){
        return new AgeComparator().compare(h1,h2);
    }
}
