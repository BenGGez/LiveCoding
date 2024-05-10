import java.util.*;


import java.util.Scanner; // Agrega la importación de la clase Scanner

public class Codigo4 {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in); // Crea una instancia de Scanner correctamente
        
        System.out.print("Turno del jugador 1 (introduzca piedra, papel o tijeras): ");
        String j1 = s.nextLine();
        
        System.out.print("Turno del jugador 2 (introduzca piedra, papel o tijeras): ");
        String j2 = s.nextLine(); // Usa la misma instancia de Scanner para el segundo jugador

        if (j1.equals(j2)) { // Compara cadenas de texto con el método equals()
            System.out.println("Empate");
        } else {
            int g = 2;
            switch(j1) {
                case "piedra":
                    if (j2.equals("tijeras")) { // Cambia == por equals()
                        g = 1;
                    }
                    break; // Agrega break para salir del switch
                case "papel":
                    if (j2.equals("piedra")) {
                        g = 1;
                    }
                    break; // Agrega break para salir del switch
                case "tijeras":
                    if (j2.equals("papel")) {
                        g = 1;
                    }
                    break; // Agrega break para salir del switch
                default:
            }
            System.out.println("Gana el jugador " + g);
        }
        s.close(); // Cierra el Scanner al finalizar su uso
    }
}