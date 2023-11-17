package LearnPattern.Mediator;

public class Nitta implements Colleague{

    private String _name = "新田";
    private int _tension;
    private Colleague _secretLover = null;
    private LoveMediator _mediator = new Saito();

    public void setSecretLover(Colleague c) {
        _secretLover = c;
    }

    public void needsAdvice() {
        _tension = _mediator.consulation(this,_secretLover);
        System.out.println(_tension);
    }

    public String getName() {
        return _name;
    }
    
}
