package Oracle;

public final class Miracle implements MiracleInterface {

    @Override
    public void realiserUnMiracle() {
        System.out.println("Un miracle s'est realisé!");
    }

    @Override
    public void realiserUnGrosMiracle() {
        System.out.println("Un énorme miracle s'est realisé!");
    }
}
