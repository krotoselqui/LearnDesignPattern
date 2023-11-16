package LearnPattern.Facade;

public class Visitor {
    public static void main(String[] args){
        Librarian nakamura = new Librarian();
        String location = nakamura.searchBook("昆虫図鑑");
        System.out.println(location + " なのか");
    }
}
