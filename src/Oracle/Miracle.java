package Oracle;

public final class Miracle implements MiracleInterface {

    public Miracle(){
    }


    @Override
    public void realiserUnMiracle() {
        System.out.println("Un miracle s'est realise!");
    }

    @Override
    public void realiserUnGrosMiracle() {
        System.out.println("Un gros miracle s'est realise!");
    }
}
