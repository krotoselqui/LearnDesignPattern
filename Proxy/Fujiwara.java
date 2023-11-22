package LearnPattern.Proxy;

public class Fujiwara implements Teacher{

    private Teacher _yamada = new Yamada();

    private void printWithAnswerFormat(String st){
        System.out.println("それは" + st + "です");
    }

    public void question1(){
        printWithAnswerFormat("解答1(by Fujiwara)");
    }

    public void question2(){
        printWithAnswerFormat("解答2(by Fujiwara)");
    }

    public void question3(){
        printWithAnswerFormat("山田先生によると、");
        _yamada.question3();
    }
    
}
