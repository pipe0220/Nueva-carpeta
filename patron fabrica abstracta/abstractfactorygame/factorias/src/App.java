import factory.ManFactory;
import factory.OrcFactory;
import factory.SoldierFactory;
import partes.Archer;
import partes.Rider;

public class App {
    public static void main(String[] args) throws Exception {
        crearSoldados(new ManFactory());
        crearSoldados(new OrcFactory());

    }

    public static void crearSoldados(SoldierFactory factory) {
        Archer arquero = factory.crearArcher();
        Rider rider = factory.crearRider();

        System.out.println("-----NUEVOS SOLDADOS CREADOS-----");
        System.out.println(arquero.shotDisparo());
        System.out.println(arquero.lifeVida());
        System.out.println(arquero.moveMoverse());
        System.out.println("");
        System.out.println(rider.moveMoverse());
        System.out.println(rider.shotDisparo());
        System.out.println(rider.lifeVida());

    }

}
