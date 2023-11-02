package LearnPattern.FactoryMethod;

public class Main {
    public static void main(String[] args)
    {
        System.out.println("Hello World");
        CutPrint cutPrint = new ImagawasCutPrint();
        cutPrint.createCutPrint();
    }
}
