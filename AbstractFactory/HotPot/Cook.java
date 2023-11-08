package LearnPattern.AbstractFactory.HotPot;

public class Cook {

    public static void main(String[] args) {
        HotPot hotPot = new HotPot(new Pot());

        // hotPot.addSoup(new ChikenBonesSoup());
        // hotPot.addMain(new Pork());  //間違いの例
        // //hotPot.addMain(new Chiken());

        // List<Vegetable> vegetables = new ArrayList<Vegetable>();
        // vegetables.add(new ChineseCabbage());
        // vegetables.add(new Leek());
        // vegetables.add(new Chrysanthemum());
        // hotPot.addVegetables(vegetables);

        // List<Ingredients> otherIngredients = new ArrayList<Ingredients>();
        // otherIngredients.add(new Tofu());
        // hotPot.addOtherIngredients(otherIngredients);

        //MizutakiFactoryクラスを用いて鍋を作る
        Factory factory = new MizutakiFactory();
        hotPot.addSoup(factory.getSoup());
        hotPot.addMain(factory.getMain());
        hotPot.addVegetables(factory.getVegetables());
        hotPot.addOtherIngredients(factory.getOtherIngredients());

    }
}
