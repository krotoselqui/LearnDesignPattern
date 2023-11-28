package LearnPattern.Interpreter;

public class Plus implements Operator {

    private Operand _operand1 = null;
    private Operand _operand2 = null;

    public Plus(Operand operand1, Operand operand2) {
        _operand1 = operand1;
        _operand2 = operand2;
    }

    public Operand execute() {
        return new Ingredient(_operand1.getOperandString() + "と" + _operand2.getOperandString() + "を足したもの");
    }
}
