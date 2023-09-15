package factory;

import partes.Archer;
import partes.ArcherMan;
import partes.ArcherOrc;
import partes.Rider;
import partes.RiderMan;
import partes.RiderOrc;

public abstract class SoldierFactory {
    public abstract Archer crearArcher();

    public abstract Rider crearRider();

}
