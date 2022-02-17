import Oracle.Oracle;

public class Main {

    public static void main(String args[]){

        System.out.println("------------------Tribu des pieds noirs------------------");
        TribuDesPiedsNoirs tribuDesPiedsNoirs = new TribuDesPiedsNoirs();
        tribuDesPiedsNoirs.demanderConseil();
        tribuDesPiedsNoirs.demanderMiracle();

        System.out.println("------------------Tribu des danseurs masqués------------------");
        TribuDesDanseursMasqués tribuDesDanseursMasqués = new TribuDesDanseursMasqués();
        tribuDesDanseursMasqués.chanterEtFaireDesRituels();
        tribuDesDanseursMasqués.transeDuShaman("guerre");

        System.out.println("------------------Tribu des guerriers du soleil------------------");
        TribuDesGuerriersDuSoleil tribuDesGuerriersDuSoleil = new TribuDesGuerriersDuSoleil();
        tribuDesGuerriersDuSoleil.prierLeSoleil();
        tribuDesGuerriersDuSoleil.sacrifice();

        System.out.println("------------------Tribu des ours affamés------------------");
        TribuDesOursAffamés tribuDesOursAffamés = new TribuDesOursAffamés();
        tribuDesOursAffamés.danser();
        tribuDesOursAffamés.faireUnFestinPourLeDieuOurs();
        tribuDesOursAffamés.construireMonumentAuDieuOurs();
    }
}


