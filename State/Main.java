package LearnPattern.State;

public class Main {

    public static void main(String[] args){
        
        Yumichan yumichan = new Yumichan();

        yumichan.changeState(new OrdinaryState());

        System.out.println(yumichan.morningGreet());
        System.err.println(yumichan.getProtectionForCold());

    }
    
}
