package LearnPattern.Prototype;

public class Teacher {

    private Paper[] papers;

    public Paper[] createManyCrystals(int count) {

        // Paper[] papers = new Paper[100];
        // for (int n = 0; n < papers.length; n++) {
        //     drawCrystal(papers[n]);
        //     cutAccordanceWithLine(papers[n]);
        // }
        // return papers;

        Paper prototype = new Paper("雪の結晶");
        drawCrystal(prototype);
        cutAccordanceWithLine(prototype);

        Paper[] papers = new Paper[count];
        for(int i=0;i<papers.length;i++){
            papers[i] = (Paper)prototype.createClone();
        }

        this.papers = papers;
        return papers;
    }

    public void showPapers(){

        if(papers == null)return;


        for(int i=0;i<papers.length;i++){
            System.out.println(papers[i].getName());
        }
    }

    private void drawCrystal(Paper paper) {}

    private void cutAccordanceWithLine(Paper paper) {}

}
