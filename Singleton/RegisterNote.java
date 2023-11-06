package LearnPattern.Singleton;
import java.util.Date;

public class RegisterNote {

    private static Date createdDateTime = new Date();
    private static RegisterNote registerNote = new RegisterNote();
    private RegisterNote(){}

    public static RegisterNote getInstance(){
        return registerNote;
    }

    public static void outputCreatedDate(){
        System.out.println(createdDateTime);
    }
    
}
