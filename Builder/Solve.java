package LearnPattern.Builder;

public class Solve {
    public static void main(String[] args) {
        SaltWater saltWater = new SaltWater(100, 40);

        double saltDelta = 70 * (saltWater.salt / (saltWater.salt + saltWater.water));
        double waterDelta = 70 * (saltWater.water / (saltWater.salt + saltWater.water));
        saltWater.salt -= saltDelta;
        saltWater.water -= waterDelta;
        saltWater.water += 100;
        saltWater.salt += 15;

        System.out.println("water = " + saltWater.water + ", salt = " + saltWater.salt);
        // ... (saltWaterに対する各種処理)
    }
}
