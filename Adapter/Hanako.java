package LearnPattern.Adapter;

public class Hanako implements Chairperson{

    Taro taro;
    public Hanako(){
        taro = new Taro();
    }
    
    public void organizeClass(){
        taro.enjoyWithAllClassmate();
    }
}
