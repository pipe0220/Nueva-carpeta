package factory;

import partes.Archer;
import partes.ArcherOrc;
import partes.Rider;
import partes.RiderOrc;

public class OrcFactory extends SoldierFactory {

    @Override
    public Archer crearArcher() {
        return new ArcherOrc();
    }

    @Override
    public Rider crearRider() {
        return new RiderOrc();
    }

}
