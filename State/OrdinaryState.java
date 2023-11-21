package LearnPattern.State;

public class OrdinaryState implements State{

    public String morningGreet() {
        return "ossu";
    }

    public String getProtectionForCold() {
        return "run";
    }
}
