package LearnPattern.Chain_of_Responsibility;

public class ClassTeacher extends Responsible{
    private Level responsibleLevel = new Level(2);
    public ClassTeacher(String responsiblePerson) {
        super(responsiblePerson);
    }

    public boolean beAbleToJudge(Question q){
        if(q.level.lessThan(responsibleLevel)){ 
            return true; 
        } 
        return false; 
    }

    public void judge(Question q){
        
    }
}
