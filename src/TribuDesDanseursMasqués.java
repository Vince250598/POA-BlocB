import Oracle.Oracle;

public class TribuDesDanseursMasqués implements Totems{


    @Override
    public void chanterEtFaireDesRituels() {
        Oracle.getInstance().getEcouterInterface().ecouterLesBesoins();
    }

    @Override
    public void transeDuShaman(String demandePourConseil) {
        //TODO ajouter de la proba pour le conseil ?
        Oracle.getInstance().getConseilInterface().conseiller(demandePourConseil);
    }
}
