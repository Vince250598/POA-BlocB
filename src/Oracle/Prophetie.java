package Oracle;

public class Prophetie implements ProphetieInterface{

    @Override
    public void donnerUneProphetie() {
        System.out.println("Voici une prophetie...");
    }

    @Override
    public void donnerUneProphetieDansUnReve() {
        System.out.println("*Un paysan fait un reve etrange*");
    }
}
