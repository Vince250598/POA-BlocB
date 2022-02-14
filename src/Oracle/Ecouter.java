package Oracle;

public final class Ecouter implements EcouterInterface {


    @Override
    public void ecouterLesBesoins() {
        System.out.println("*Ecoute les besoins*");
    }

    @Override
    public String ecouterLesBesoinsEtRepondre() {
        return "Voici comment regler tes problemes...";
    }

    @Override
    public void ecouterLesBesoinsEtRealiserMiracle() {
        ecouterLesBesoins();
        Oracle.getInstance().getMiracle().realiserUnMiracle();
    }
}
