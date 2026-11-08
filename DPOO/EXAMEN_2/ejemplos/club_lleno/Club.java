import java.util.ArrayList;

// 2. El modelo. Tiene UN SOLO método agregarSocio.
public class Club {
    private int capacidad;
    private ArrayList<String> socios;

    public Club(int capacidad) {
        this.capacidad = capacidad;
        this.socios = new ArrayList<>();
    }

    // El "throws" no es otro método: es parte de la firma de este.
    // Solo avisa: "ojo, este método puede terminar con un CupoLlenoException".
    public void agregarSocio(String nombre) throws CupoLlenoException {
        if (socios.size() >= capacidad) {
            // Final con aviso: no agrega a nadie y el método termina AQUÍ.
            throw new CupoLlenoException("No hay cupo para " + nombre);
        }
        // Final normal: si no se lanzó nada, hace su trabajo.
        socios.add(nombre);
    }
}
