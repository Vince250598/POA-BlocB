import Oracle.Oracle;

public class TribuDesOursAffames implements DieuOurs {

    @Override
    public void danser() {
        Oracle.getInstance().getProphetieInterface().donnerUneProphetie();
    }

    @Override
    public void faireUnFestinPourLeDieuOurs() {
        Oracle.getInstance().getEcouterInterface().ecouterLesBesoinsEtRepondre();
    }

    @Override
    public void construireMonumentAuDieuOurs() {
        Oracle.getInstance().getEcouterInterface().ecouterLesBesoinsEtRealiserMiracle();
    }
}
