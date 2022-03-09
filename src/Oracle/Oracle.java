package Oracle;

public class Oracle {

    private static Oracle instance = new Oracle();
    private Conseil conseil;
    private Miracle miracle;
    private Ecouter ecouter;
    private Prophetie prophetie;

    private Oracle() {
        conseil = new Conseil();
        miracle = new Miracle();
        ecouter = new Ecouter();
        prophetie = new Prophetie();
    }

    public static Oracle getInstance() {
        return instance;
    }

    public ConseilInterface getConseilInterface() {

        return conseil;
    }

    public MiracleInterface getMiracleInterface() {

        return miracle;
    }

    public EcouterInterface getEcouterInterface() {
        return ecouter;
    }

    public ProphetieInterface getProphetieInterface() {
        return prophetie;
    }


    Conseil getConseil() {
        return conseil;
    }

    Miracle getMiracle() {
        return miracle;
    }

    Ecouter getEcouter() {
        return ecouter;
    }

    Prophetie getProphetie() {
        return prophetie;
    }
}