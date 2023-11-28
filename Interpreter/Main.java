package LearnPattern.Interpreter;

public class Main {
    public static void main(String[] args){
        
        Ingredient ing1 = new Ingredient("ing1");
        Ingredient ing2 = new Ingredient("ing2");
        

        Operator plus = new Plus(ing1,ing2);
        Expression pls = new Expression(plus);
        Operator wait = new Wait(3,pls);

        System.out.println(wait.execute().getOperandString());

    }
    
}
