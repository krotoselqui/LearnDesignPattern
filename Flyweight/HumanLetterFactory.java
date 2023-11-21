package LearnPattern.Flyweight;

import java.util.*;

public class HumanLetterFactory {

    Map<String, HumanLetter> map = new HashMap<String, HumanLetter>();
    private static HumanLetterFactory _singleton = new HumanLetterFactory();

    private HumanLetterFactory() {

    }

    public static HumanLetterFactory getInstance(){
        return _singleton;
    }

    public synchronized HumanLetter getHumanLetter(String letter){
        HumanLetter humanLetter = map.get(letter);
        if(humanLetter == null){
            humanLetter = new HumanLetter(letter);
            map.put(letter,humanLetter);
        }
        return humanLetter;
    }
}
