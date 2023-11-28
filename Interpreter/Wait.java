package LearnPattern.Interpreter;

public class Wait implements Operator{
    private int _minutes = -1;
    private Operand _operand = null;

    public Wait(int minutes,Operand operand){
        _minutes = minutes;
        _operand = operand;
    }

    public Operand execute(){
        return new Ingredient(_operand.getOperandString() + "を" + _minutes + "分置いたもの");
    }
}
