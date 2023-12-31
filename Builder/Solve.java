package LearnPattern.Builder;

public class Solve {
    public static void main(String[] args) {

        //Builderを用いずに解く
        SaltWater saltWater = new SaltWater(100, 40);

        double saltDelta = 70 * (saltWater.salt / (saltWater.salt + saltWater.water));
        double waterDelta = 70 * (saltWater.water / (saltWater.salt + saltWater.water));
        saltWater.salt -= saltDelta;
        saltWater.water -= waterDelta;
        saltWater.water += 100;
        saltWater.salt += 15;

        System.out.println("water = " + saltWater.water + ", salt = " + saltWater.salt);
        
        //Builderを用いる
        Builder builder = new SaltWaterBuilder();
        Director dir = new Director(builder);
        dir.constract();
        SaltWater saltWater2 = (SaltWater)builder.getResult();

        System.out.println("water = " + saltWater2.water + ", salt = " + saltWater2.salt);
        
    }
}
