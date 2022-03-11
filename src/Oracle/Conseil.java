package Oracle;

public final class Conseil implements ConseilInterface {

    public Conseil() {
    }

    @Override
    public void conseiller() {
        System.out.println("Voici un sage conseil: ...");
    }

    @Override
    public void conseiller(String demande) {
        System.out.println("Voici un sage conseil par rapport à : " + demande + " ...");
    }


}