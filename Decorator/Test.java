package LearnPattern.Decorator;

public class Test {

    public static void main(String[] args) {
        Icecream ice1 = new CashewNutsToppingIcecream(new VanillaIcecream());
        Icecream ice2 = new CashewNutsToppingIcecream(new GreenTeaIcecream());
        Icecream ice3 = new SliceAlmondToppingIcecream(new CashewNutsToppingIcecream(new VanillaIcecream()));
        System.out.println(ice1.getName());
        System.out.println(ice2.getName());
        System.out.println(ice3.getName());
    }
}
