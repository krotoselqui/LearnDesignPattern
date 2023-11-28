package LearnPattern.Interpreter;

public class Expression implements Operand {
    
    private Operator _operator = null;

    public Expression(Operator operator) {
        _operator = operator;
    }

    public String getOperandString() {
        return _operator.execute().getOperandString();
    }
}
