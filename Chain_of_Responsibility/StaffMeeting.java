package LearnPattern.Chain_of_Responsibility;

public class StaffMeeting extends Responsible{

    private int _responsiblelevel = 4;

    public StaffMeeting(String responsiblePerson){
        super(responsiblePerson);
    }

    public boolean beAbleToJudge(Question q) {
        return q.level.lessThan(new Level(_responsiblelevel));
    }

    public void judge(Question q) {
    }
}
