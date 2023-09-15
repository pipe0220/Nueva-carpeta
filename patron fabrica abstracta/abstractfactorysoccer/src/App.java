import factorias.EquipoFactory;
import factorias.EquipoFemeninoFactory;
import factorias.EquipoMasculinoFactory;
import partes.Arquero;
import partes.Atacante;
import partes.Defensor;

public class App {
    public static void main(String[] args) throws Exception {
        crearEquipo(new EquipoMasculinoFactory());
        crearEquipo(new EquipoFemeninoFactory());
    }

    public static void crearEquipo(EquipoFactory factory) {
        Arquero arquero = factory.crearArquero();
        Defensor defensor = factory.crearDefensor();
        Atacante atacante = factory.crearAtacante();

        System.out.println("______UN EQUIPO FUE CREADO:______");
        System.out.println(arquero.saqueArco());
        System.out.println(defensor.barrida());
        System.out.println(atacante.cabezasoOfensivo());
    }

}
