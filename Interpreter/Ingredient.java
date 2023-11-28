package LearnPattern.Interpreter;

public class Ingredient implements Operand {

    private String _operandString = null;

    public Ingredient(String operandString) {
        _operandString = operandString;
    }

    public String getOperandString() {
        return _operandString;
    }

}
