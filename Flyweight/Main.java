package LearnPattern.Flyweight;

public class Main {

    public static void main(String args[]){
        HumanLetter あ = new HumanLetter("あ");
        takeAPhoto(あ);
        HumanLetter い = new HumanLetter("い");
        takeAPhoto(い);
        HumanLetter は = new HumanLetter("は");
        takeAPhoto(は);
        takeAPhoto(あ);
        takeAPhoto(い);
        HumanLetter よ = new HumanLetter("よ");
        takeAPhoto(よ);
        HumanLetter り = new HumanLetter("り");
        takeAPhoto(り);
        HumanLetter も = new HumanLetter("も");
        takeAPhoto(も);
        takeAPhoto(あ);
        HumanLetter お = new HumanLetter("お");
        takeAPhoto(お);
        takeAPhoto(い);
    }

    private static void takeAPhoto(HumanLetter letter){
        System.out.println(letter.getLetter());
    }
    
}
