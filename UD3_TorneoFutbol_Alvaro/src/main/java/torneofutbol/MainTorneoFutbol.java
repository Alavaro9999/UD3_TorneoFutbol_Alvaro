
package torneofutbol;

public class MainTorneoFutbol {

    public static void main(String[] args) {

        System.out.println("Hola, voy a mostrar los jugadores de los equipos");
        
        // Crear una instancia de la clase Equipo
        Equipo equipoMH = new Equipo("IES MH FC");

        // Agregar jugadores al equipoMH
        equipoMH.agregarJugador("Pepe", 9);
        equipoMH.agregarJugador("Aitana", 8);
        equipoMH.agregarJugador("Alvaro", 7);
        equipoMH.agregarJugador("Manuel", 6);

        // Mostrar la lista de jugadores del equipoMH
        System.out.println("\nLista de jugadores en el equipo "+equipoMH.getNombreEquipo()+":");
        equipoMH.mostrarJugadores();

        // Obtener y mostrar el número de jugadores en el equipoMH
        int numeroDeJugadores = equipoMH.obtenerNumeroDeJugadores();
        System.out.println("\nNumero de jugadores en el equipo: " + numeroDeJugadores);

    }
}
