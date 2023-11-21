package LearnPattern.State;

public class Yumichan {
    private static final int STATE_ORDINARY = 0;
    private static final int STATE_IN_BAD_MOOD = 1;
    private int _state = -1;

    public void changeState(int state) {
        _state = state;
    }

    public String morningGreet() {
        if (_state == STATE_ORDINARY) {
            return "おっす！";
        } else if (_state == STATE_IN_BAD_MOOD) {
            return "おお";
        } else {
            return "・・・";
        }
    }

    public String getProtectionForCold() {
        if (_state == STATE_ORDINARY) {
            return "走る";
        } else if (_state == STATE_IN_BAD_MOOD) {
            return "ももひきをはく";
        } else {
            return "・・・";
        }
    }
}
