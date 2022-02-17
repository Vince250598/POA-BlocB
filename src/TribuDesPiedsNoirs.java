import Oracle.Oracle;

public class TribuDesPiedsNoirs implements EspritDeLaNuit {

    @Override
    public void demanderConseil() {
        Oracle.getInstance().getConseilInterface().conseiller();
    }

    @Override
    public void demanderMiracle() {
        Oracle.getInstance().getMiracleInterface().realiserUnMiracle();
    }

}
