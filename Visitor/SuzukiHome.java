package LearnPattern.Visitor;

public class SuzukiHome extends Home{
    public Object praisedChild(){
		System.out.println("あら、先生ったらご冗談を");
		return new Tea();
	}
	public Object reprovedChild(){
		System.out.println("うちの子に限ってそんなことは・・・。");
		return null;
	}
    public void accept(Teacher teacher){
        teacher.visit(this);
    }
}
