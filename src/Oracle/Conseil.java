package Oracle;

public final class Conseil implements ConseilInterface {

    public Conseil(){
    }

    public void conseiller(){
        System.out.println("Voici un sage conseil: ...");
    }

    public void conseiller(String raison){
        System.out.println("Voici un sage conseil pour la raison " + raison + " ...");
    }
}