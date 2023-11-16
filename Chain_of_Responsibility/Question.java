package LearnPattern.Chain_of_Responsibility;

public class Question {
    private String _question;
    public Level level;

    public Question(String question, Level level) {
        _question = question;
        this.level = level;
        printQuestion();
    }

    private void printQuestion(){
        System.out.println("question:"+_question+", level:"+level);
    }
}
