package Oracle;

public final class Ecouter implements EcouterInterface {


    @Override
    public void ecouterLesBesoins() {
        System.out.println("*Ecoute les besoins*");
    }

    @Override
    public String ecouterLesBesoinsEtRepondre() {
        return "Voici comment régler vos problèmes...";
    }

    @Override
    public void ecouterLesBesoinsEtRealiserMiracle() {
        ecouterLesBesoins();
        Oracle.getInstance().getMiracle().realiserUnMiracle();
    }
}
