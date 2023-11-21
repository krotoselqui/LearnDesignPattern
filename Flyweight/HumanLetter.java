package LearnPattern.Flyweight;

public class HumanLetter {
    private String _letter = "";

    public HumanLetter(String letter) {
        _letter = letter;
        System.out.println("letter{ " + letter + " }が生成されました");
    }

    public String getLetter() {
        return _letter;
    }
}
