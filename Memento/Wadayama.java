package LearnPattern.Memento;

import java.util.*;

public class Wadayama {
    private static Map<String, Memento> map = new HashMap<String, Memento>();

    public static void main(String args[]) {

        int sectionNumber = 5000;
        int sectionNumber2 = 10000;

        if (sectionNumber2 < sectionNumber) {
            System.out.println("sectionNum2 must be lesser than sectionNum.");
        }

        Calc calc = new Calc();
        for (int n = 1; n <= sectionNumber; n++) {
            calc.plus(n);
        }
        System.out.println(calc.getSum());
        map.put(String.valueOf(sectionNumber) + "までの足し算", calc.createMemento());

        Calc calc2 = new Calc();
        calc2.setMemento(map.get(String.valueOf(sectionNumber) + "までの足し算"));
        for (int n = sectionNumber + 1; n <= sectionNumber2; n++) {
            calc2.plus(n);
        }
        System.out.println(calc2.getSum());
        map.put(String.valueOf(sectionNumber2) + "までの足し算", calc2.createMemento());
    }

}
