package LearnPattern.Command;

public class Student {
    public static void main(String[] args){
        Beaker beaker = new Beaker(100, 0);
        beaker.Experiment(Beaker.ADD_SALT);

        Beaker beaker2 = new Beaker(0, 10);
        beaker2.Experiment(Beaker.ADD_WATER);
    }

}
