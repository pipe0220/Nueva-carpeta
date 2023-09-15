package partes;

public class DefensorMujer implements Defensor {
    public String toString(){
        return "Defensor Mujer";
    }

    @Override
    public String barrida() {
        return "Barrida Defensor Mujer";
    }

    @Override
    public String despeje() {
        return "DEspeje Defensor Mujer";
    }

    @Override
    public String cabezasoDefensivo() {
        return " Cabezaso Defensivo Defensor Mujer";
    }
    
}
