package factorias;

import partes.Arquero;
import partes.ArqueroHombre;
import partes.ArqueroMujer;
import partes.Atacante;
import partes.AtacanteHombre;
import partes.AtacanteMujer;
import partes.Defensor;
import partes.DefensorHombre;
import partes.DefensorMujer;

public abstract class EquipoFactory {

    public abstract Arquero crearArquero();

    public abstract Defensor crearDefensor();

    public abstract Atacante crearAtacante();

}
