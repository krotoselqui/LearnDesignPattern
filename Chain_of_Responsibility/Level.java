package LearnPattern.Chain_of_Responsibility;

public class Level {
    private int _level;

    public int getLevel(){
        return _level;
    }

    public Level(int level) {
        _level = level;
    }

    public boolean lessThan(Level other) {
        return _level < other.getLevel();
    }

    @Override
    public String toString(){
        return String.valueOf(_level);
    }

}
