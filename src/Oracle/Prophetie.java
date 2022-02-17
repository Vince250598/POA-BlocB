package Oracle;

public final class Prophetie implements ProphetieInterface{

    @Override
    public void donnerUneProphetie() {
        System.out.println("Voici une prophétie : ...");
    }

    @Override
    public void donnerUneProphetieDansUnReve() {
        System.out.println("*Un paysan fait un rêve étrange*");
    }
}
