package LearnPattern.Proxy;

import java.time.LocalDateTime;

public class Fujiwara implements Teacher {

    private Teacher _yamada = new Yamada();

    private void printWithAnswerFormat(String st) {
        System.out.println("それは" + st + "です");
    }

    public void question1() {
        printWithAnswerFormat("解答1(by Fujiwara)");
    }

    public void question2() {
        printWithAnswerFormat("解答2(by Fujiwara)");
    }

    public void question3() {

        LocalDateTime localDateTime = LocalDateTime.now();
        System.out.println("今は.." + localDateTime.getHour() + "時ですね。");
        if (localDateTime.getHour() >= 12) {
            System.out.println("明日、返答します。");
        } else {
            printWithAnswerFormat("山田先生によると、");
            _yamada.question3();
        }

    }

}
