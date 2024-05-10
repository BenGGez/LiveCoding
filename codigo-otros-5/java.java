import java.util.Scanner; // Importa la clase Scanner

public class Codigo5 {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in); // Crea una instancia de Scanner correctamente

        System.out.print("Introduzca un número: ");
        String ni = s.nextLine();
        int c = Integer.parseInt(ni); // Convierte el número ingresado a un entero

        int afo = 0;
        int noAfo = 0;

        while (c > 0) { // Usa la variable c en lugar de ni
            int digito = c % 10;
            if ((digito == 3) || (digito == 7) || (digito == 8) || (digito == 9)) {
                afo++;
            } else {
                noAfo++;
            }
            c /= 10; // Usa la variable c en lugar de ni
        }
        if (afo > noAfo) {
            System.out.println("El " + ni + " es un número afortunado."); // Corrige la impresión
        } else {
            System.out.println("El " + ni + " no es un número afortunado."); // Corrige la impresión
        }

        s.close(); // Cierra el Scanner al finalizar su uso
    }
}
