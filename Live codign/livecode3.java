import java.util.Scanner;

class MangosNaranjas {
    private int mangos;
    private int naranjas;

    public MangosNaranjas(int mangos, int naranjas) {
        this.mangos = mangos;
        this.naranjas = naranjas;
    }

    public void imprimir() {
        int cajas = Math.min(mangos, naranjas);
        System.out.println("Número de cajas: " + cajas);
        System.out.println("Número de mangos por caja: " + (mangos / cajas));
        System.out.println("Número de naranjas por caja: " + (naranjas / cajas));
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese el número de mangos: ");
        int mangos = scanner.nextInt();
        System.out.print("Ingrese el número de naranjas: ");
        int naranjas = scanner.nextInt();
        scanner.close();

        MangosNaranjas mn = new MangosNaranjas(mangos, naranjas);
        mn.imprimir();
    }
}