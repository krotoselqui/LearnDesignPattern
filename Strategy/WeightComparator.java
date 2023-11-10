package LearnPattern.Strategy;

public class WeightComparator implements Comparator{
    public int compare(Human h1, Human h2) {
        if (h1.weight > h2.weight) {
            return 1;
        } else if (h1.weight == h2.weight) {
            return 0;
        } else {
            return -1;
        }
    }
}
