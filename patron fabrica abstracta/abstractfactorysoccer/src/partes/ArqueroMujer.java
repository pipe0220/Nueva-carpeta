package partes;

public class ArqueroMujer implements Arquero {

    public String toString() {
        return "Arquera mujer";
    }

    @Override
    public String tirarseIzquierda() {
        return " Tirarse Izquierda Arquera mujer";
    }

    @Override
    public String saqueArco() {
        return "Saque Arco Arquera mujer";
    }

    @Override
    public String tirarseDerecha() {
        return "Tirarse Derecha Arquera mujer";
    }

}
