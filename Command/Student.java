package LearnPattern.Command;

public class Student {

    // public static void main(String[] args){
    //     Beaker beaker = new Beaker(100, 0);
    //     beaker.Experiment(Beaker.ADD_SALT);

    //     Beaker beaker2 = new Beaker(0, 10);
    //     beaker2.Experiment(Beaker.ADD_WATER);
    // }

    public static void main(String[] args){

        Command addSalt = new AddSaltCommand();
        Command addWater = new AddWaterCommand();
        Command makeSaltWater = new MakeSaltWaterCommand();

        addSalt.setBeaker(new Beaker(100,0));
        addWater.setBeaker(new Beaker(0,10));
        makeSaltWater.setBeaker(new Beaker(90,10));

        addSalt.execute();
        addWater.execute();
        makeSaltWater.execute();

    }

}
