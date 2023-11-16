package LearnPattern.Chain_of_Responsibility;

public abstract class Responsible {

    private Responsible _next = null;
    private String _responsiblePerson = null;

    public Responsible(String responsiblePerson) {
        _responsiblePerson = responsiblePerson;
        System.out.println("Resiponsible set:"+_responsiblePerson);
    }

    public Responsible setNext(Responsible next) {
        _next = next;
        return _next;
    }

    public final void putQuestion(Question q) {
        if (beAbleToJudge(q)) {
            judge(q);
        } else if (_next != null) {
            _next.putQuestion(q);
        } else {
            System.out.println("誰にも判断できませんでした.");
        }
    };

    public abstract boolean beAbleToJudge(Question q);

    public abstract void judge(Question q);
}
