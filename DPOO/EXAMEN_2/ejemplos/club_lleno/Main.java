// 3. La interfaz. Llama al método y atrapa el aviso si llega.
public class Main {
    public static void main(String[] args) {
        Club club = new Club(2);   // caben 2 socios

        try {
            club.agregarSocio("Ana");
            System.out.println("Ana inscrita");

            club.agregarSocio("Luis");
            System.out.println("Luis inscrito");

            club.agregarSocio("Eva");             // ya no cabe: lanza
            System.out.println("Eva inscrita");   // esta línea se salta
        } catch (CupoLlenoException e) {
            System.out.println("Error: " + e.getMessage());
        }

        System.out.println("El programa sigue");
    }
}
