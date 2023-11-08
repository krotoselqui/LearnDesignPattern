package LearnPattern.AbstractFactory.HotPot;

import java.util.ArrayList;
import java.util.List;

public class MizutakiFactory extends Factory {
    public Soup getSoup() {
        return new ChikenBonesSoup();
    }

    public Protein getMain() {
        return new Chiken();
    }

    public List<Vegetable> getVegetables() {
        List<Vegetable> vegetables = new ArrayList<Vegetable>();
        vegetables.add(new ChineseCabbage());
        vegetables.add(new Leek());
        vegetables.add(new Chrysanthemum());
        return vegetables;
    }

    public List<Ingredients> getOtherIngredients() {
        List<Ingredients> otherIngredients = new ArrayList<Ingredients>();
        otherIngredients.add(new Tofu());
        return otherIngredients;
    }
}
