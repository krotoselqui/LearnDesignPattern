package LearnPattern.AbstractFactory.HotPot;

import java.util.*;

public class Cook {

    public static void main(String[] args) {
        HotPot hotPot = new HotPot(new Pot());

        hotPot.addSoup(new ChikenBonesSoup());
        hotPot.addMain(new Chiken());

        List<Vegetable> vegetables = new ArrayList<Vegetable>();
        vegetables.add(new ChineseCabbage());
        vegetables.add(new Leek());
        vegetables.add(new Chrysanthemum());
        hotPot.addVegetables(vegetables);

        List<Ingredients> otherIngredients = new ArrayList<Ingredients>();
        otherIngredients.add(new Tofu());
        hotPot.addOtherIngredients(otherIngredients);

    }
}
