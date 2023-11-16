package LearnPattern.Chain_of_Responsibility;

public class ChiefTeacher extends Responsible{

    public ChiefTeacher(String responsiblePerson) {
        super(responsiblePerson);
    }

    private int _responsiblelevel = 3;

    public boolean beAbleToJudge(Question q) {
        return q.level.lessThan(new Level(_responsiblelevel));
    }

    public void judge(Question q) {
    }

}
