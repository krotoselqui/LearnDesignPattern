package LearnPattern.AbstractFactory.HotPot;
import java.util.*;

public abstract class Factory {
    public abstract Soup getSoup();
    public abstract Protein getMain();
    public abstract List<Vegetable> getVegetables();
    public abstract List<Ingredients> getOtherIngredients();
}
