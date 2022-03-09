public class Main {

    public static void main(String args[]){

        System.out.println("------------------Tribu des pieds noirs------------------");
        TribuDesPiedsNoirs tribuDesPiedsNoirs = new TribuDesPiedsNoirs();
        tribuDesPiedsNoirs.demanderConseil();
        tribuDesPiedsNoirs.demanderMiracle();

        System.out.println("------------------Tribu des danseurs masqués------------------");
        TribuDesDanseursMasques tribuDesDanseursMasques = new TribuDesDanseursMasques();
        tribuDesDanseursMasques.chanterEtFaireDesRituels();
        tribuDesDanseursMasques.transeDuShaman("guerre");

        System.out.println("------------------Tribu des guerriers du soleil------------------");
        TribuDesGuerriersDuSoleil tribuDesGuerriersDuSoleil = new TribuDesGuerriersDuSoleil();
        tribuDesGuerriersDuSoleil.prierLeSoleil();
        tribuDesGuerriersDuSoleil.sacrifice();

        System.out.println("------------------Tribu des ours affamés------------------");
        TribuDesOursAffames tribuDesOursAffames = new TribuDesOursAffames();
        tribuDesOursAffames.danser();
        tribuDesOursAffames.faireUnFestinPourLeDieuOurs();
        tribuDesOursAffames.construireMonumentAuDieuOurs();
    }
}


