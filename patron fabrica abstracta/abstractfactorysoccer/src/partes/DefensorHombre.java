package partes;

public class DefensorHombre implements Defensor {
    public String toString() {
        return "Defensor Hombre";
    }

    @Override
    public String barrida() {
        return "Barrida Defensor Hombre";
    }

    @Override
    public String despeje() {
        return "Despeje Defensor Hombre";
    }

    @Override
    public String cabezasoDefensivo() {
        return "Cabezaso Defensivo Defensor Hombre";
    }
    
}
