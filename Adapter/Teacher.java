package LearnPattern.Adapter;

public class Teacher {
    public static void main(String args[]){
        // Chairperson chairperson = new NewTaro();
        Chairperson chairperson = new Hanako();
        chairperson.organizeClass();

    }
}
