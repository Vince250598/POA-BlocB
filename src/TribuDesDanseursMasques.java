import Oracle.Oracle;

public class TribuDesDanseursMasques implements Totems {


    @Override
    public void chanterEtFaireDesRituels() {
        Oracle.getInstance().getEcouterInterface().ecouterLesBesoins();
    }

    @Override
    public void transeDuShaman(String demandePourConseil) {
        Oracle.getInstance().getConseilInterface().conseiller(demandePourConseil);
    }
}
