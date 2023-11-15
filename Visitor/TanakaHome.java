package LearnPattern.Visitor;

public class TanakaHome extends Home {

    public class KashiOri {

    }

    public Object praisedChild(){
		System.out.println("そうですか・・・。");
		return new Tea();
	}
	public Object reprovedChild(){
		System.out.println("そう・・・。");
		return new KashiOri();
	}
    public void accept(Teacher teacher){
        teacher.visit(this);
    }
}
