package factory;

import partes.Archer;
import partes.ArcherMan;
import partes.Rider;
import partes.RiderMan;

public class ManFactory extends SoldierFactory {

    @Override
    public Archer crearArcher() {
        return new ArcherMan();
    }

    @Override
    public Rider crearRider() {
        return new RiderMan();
    }

}
