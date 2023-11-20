package LearnPattern.Memento;

public class Calc {
    private int _sum = 0;

    public void plus(int plus){
        _sum += plus;
    }

    public Memento createMemento() {
        return new Memento(_sum);
    }

    public void setMemento(Memento memento){
        _sum = memento.result;
    }

    public int getSum(){
        return _sum;
    }
    
}


