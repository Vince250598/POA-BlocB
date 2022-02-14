package Oracle;

public final class Conseil implements ConseilInterface {

    public Conseil(){
    }

    public String conseiller(){
        return "Voici un sage conseil: ...";
    }

    public String conseiller(String raison){
        return "Voici un sage conseil pour la raison " + raison + " ...";
    }
}