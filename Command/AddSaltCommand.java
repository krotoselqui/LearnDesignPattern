package LearnPattern.Command;

public class AddSaltCommand extends Command{
    public void execute(){
        while(beaker.isMelted()){
            beaker.addSalt(0.1);
            beaker.mix();
        }

        System.out.println("食塩を1gずつ加える実験");
        beaker.note();
    }
    
}
