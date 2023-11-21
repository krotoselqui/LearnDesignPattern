package LearnPattern.Flyweight;

public class Main {

    private static HumanLetterFactory _humanLetterFactory = HumanLetterFactory.getInstance();

    public static void main(String args[]) {

        _humanLetterFactory.getHumanLetter("あ");
        _humanLetterFactory.getHumanLetter("い");
        _humanLetterFactory.getHumanLetter("は");
        _humanLetterFactory.getHumanLetter("あ");
        _humanLetterFactory.getHumanLetter("い");
        _humanLetterFactory.getHumanLetter("よ");
        _humanLetterFactory.getHumanLetter("り");
        _humanLetterFactory.getHumanLetter("も");
        _humanLetterFactory.getHumanLetter("あ");
        _humanLetterFactory.getHumanLetter("お");
        _humanLetterFactory.getHumanLetter("い");

    }

    // private static void takeAPhoto(HumanLetter letter) {
    //     System.out.println(letter.getLetter());
    // }

}
