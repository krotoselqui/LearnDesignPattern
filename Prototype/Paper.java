package LearnPattern.Prototype;

public class Paper implements Cloneable{
    private String name;
    public Paper(){}
    public Paper(String name){
        this.name = name;
    }

    public Cloneable createClone(){
        // newPaper と this を重ねて, this の形に切り抜く
        Paper newPaper = new Paper(this.name);  
        return newPaper;
    }

    public String getName(){
        return name;
    }
}
