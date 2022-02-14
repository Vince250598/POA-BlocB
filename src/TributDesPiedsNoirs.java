import Oracle.Oracle;

public class TributDesPiedsNoirs implements EspritDeLaNuit {
    @Override
    public void donnerConseilJudicieux() {
        Oracle.getInstance().getConseilInterface().conseiller();

    }

    @Override
    public void faireUnRareMiracle() {
        Oracle.getInstance().getMiracleInterface().realiserUnMiracle();

    }
}
