package LearnPattern.Chain_of_Responsibility;

public abstract class Responsible {
    public Responsible next;
    public abstract Responsible setNext(Responsible r);
    public abstract void putQuestion(Question q);
    public boolean beAbleToJudge(Question q){
        return false;
    }
    public abstract void judge(Question q);
}
