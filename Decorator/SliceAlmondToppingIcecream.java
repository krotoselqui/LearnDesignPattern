package LearnPattern.Decorator;

public class SliceAlmondToppingIcecream implements Icecream{

    private Icecream ice = null;
    public SliceAlmondToppingIcecream(Icecream ice){
		this.ice = ice;
	}
    public String getName(){
        String name = "スライスアーモンド";
        name += ice.getName();
        return name;
    }
    public String getFlavor(){
        return ice.getFlavor();
    }
}
