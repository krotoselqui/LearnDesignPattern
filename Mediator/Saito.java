package LearnPattern.Mediator;

import java.util.*;

public class Saito implements LoveMediator{

    private Map<String,Colleague> _colleagueMap = new HashMap<String,Colleague>();

    public void addColleague(Colleague c) {
        _colleagueMap.put(c.getName(),c);
    }

    public int consulation(Colleague colleagueInLove, Colleague secretLover) {
        int possibility = 0;
        //
        return possibility;
    }   

}
