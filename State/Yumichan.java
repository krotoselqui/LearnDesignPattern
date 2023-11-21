package LearnPattern.State;

public class Yumichan {

    private State _state = null;

    public void changeState(State state) {
        _state = state;
    }

    public String morningGreet() {
        return _state.morningGreet();
    }

    public String getProtectionForCold() {
        return _state.getProtectionForCold();
    }
}
