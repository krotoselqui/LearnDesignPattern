package LearnPattern.Command;

public class Beaker {
    private double _water = 0;
    private double _salt = 0;
    private boolean _melted;

    public static final int ADD_SALT = 1;
    public static final int ADD_WATER = 2;

    public static final double SATURATED_THRESHOLD = 0.264;

    public Beaker(double water, double salt) {
        _water = water;
        _salt = salt;
        mix();
    }

    public void Experiment(int param) {
        if (param == ADD_SALT) {
            while (isMelted()) {
                addSalt(1);
                mix();
            }
            System.out.println("食塩を1gずつ加える実験");
            note();
        } else if (param == ADD_WATER) {
            while (!isMelted()) {
                addWater(10);
                mix();
            }
            System.out.println("水を10gずつ加える実験");
            note();
        }
    }

    public void addSalt(double salt) {
        _salt += salt;
    }

    public void addWater(double water) {
        _water += water;
    }

    public void mix() {
        if (getConcentrations() < SATURATED_THRESHOLD) {
            _melted = true;
        } else {
            _melted = false;
        }
    }

    public double getSalt() {
        return _salt;
    }

    public double getWater() {
        return _water;
    }

    public double getConcentrations() {
        if (_water + _salt == 0)
            return 0;
        return _salt / (_water + _salt);
    }

    public boolean isMelted() {
        return _melted;
    }

    public void note() {
        System.out.println("水 : " + getWater() + " g");
        System.out.println("食塩 : " + getSalt() + " g");

        double percent_concentrations = getConcentrations() * 100;
        System.out.println("濃度 : " + String.format("%.2f", percent_concentrations) + " %");
    }

}
