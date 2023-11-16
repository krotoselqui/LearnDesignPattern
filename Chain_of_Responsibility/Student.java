package LearnPattern.Chain_of_Responsibility;

public class Student extends Responsible{

    public Student(String responsiblePerson) {
        super(responsiblePerson);
    }

    private int _responsiblelevel = 1;

    public boolean beAbleToJudge(Question q) {
        return q.level.lessThan(new Level(_responsiblelevel));
    }

    public void judge(Question q) {
    }
    
}
