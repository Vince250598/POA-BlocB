import Oracle.Oracle;

public class TribuDesGuerriersDuSoleil implements AmeDesAncêtres {

    @Override
    public void sacrifice() {
        Oracle.getInstance().getMiracleInterface().realiserUnGrosMiracle();
    }

    @Override
    public void prierLeSoleil() {
        Oracle.getInstance().getProphetieInterface().donnerUneProphetieDansUnReve();
    }
}
