package LearnPattern.TemplateMethod;

public class MyWoodCutPrint extends WoodCutPrint {

    public void draw(Cuttable hanzai) {
        System.out.println("draw on hanzai");
    }

    public void cut(Cuttable hanzai) {
        System.out.println("carved on hanzai");
    }

    public void print(Cuttable hanzai) {
        System.out.println("printed using hanzai");
    }

}
