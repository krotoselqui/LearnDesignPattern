package LearnPattern.TemplateMethod;

public class MyWoodCutPrint extends WoodCutPrint {

    // Reduced Visibility (public -> private) でコンパイルエラー
    // private void draw(Cuttable hanzai)
    // {
    //      System.out.println("版材に描いている振りをしてスマホを見ている");
    // }

    // オーバーロードはできる
    public int draw(Cuttable hanzai, int val) {
        return 10;
    }

    public void draw(Cuttable hanzai) {
        System.out.println("draw");
    }

    public void cut(Cuttable hanzai) {
        System.out.println("cut");
    }

    public void print(Cuttable hanzai) {
        String className = new Object() {
        }.getClass().getEnclosingClass().getName();
        System.out.println(className);
    }

}
