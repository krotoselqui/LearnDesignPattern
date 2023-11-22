package LearnPattern.Proxy;

public class Student {
    public static void main(String[] args) {
        Teacher fujiwara = new Fujiwara();
        fujiwara.question1();
        fujiwara.question2();
        fujiwara.question3();
    }
}
