package LearnPattern.Visitor;

import java.util.List;

public class RookieTeacher extends Teacher{
    List students = null;
    public RookieTeacher(List students){
        this.students = students;
    }
    public void visit(Home studentHome){
        System.out.println("こんにちは");
    }
    public void visit(TanakaHome studentHome){
        studentHome.praisedChild();
    }
    public void visit(SuzukiHome studentHome){
        studentHome.reprovedChild();
    }

}
