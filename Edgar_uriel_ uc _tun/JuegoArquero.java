import java.util.Scanner;

public class Arquero {
    private boolean tieneArco = false;
    private int cantidadFlechas = 0;

    public void agarrarArco() {
        tieneArco = true;
        System.out.println("El arquero ha agarrado un arco.");
    }

    public void lanzarFlecha() {
        if (tieneArco && cantidadFlechas > 0) {
            System.out.println("El arquero ha lanzado una flecha.");
            cantidadFlechas--;
        } else {
            System.out.println("El arquero no tiene arco o no tiene flechas.");
        }
    }

    public void correr() {
        System.out.println("El arquero está corriendo.");
    }

    public void caminar() {
        System.out.println("El arquero está caminando.");
    }
}

public class JuegoArquero {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Arquero arquero = new Arquero();
        int opcion;
        do {
            System.out.println("Selecciona una opción:");
            System.out.println("1. Agarrar arco");
            System.out.println("2. Lanzar flecha");
            System.out.println("3. Correr");
            System.out.println("4. Caminar");
            System.out.println("0. Salir");
            System.out.print("Opción: ");
            opcion = scanner.nextInt();

            switch (opcion) {
                case 1:
                    arquero.agarrarArco();
                    break;
                case 2:
                    arquero.lanzarFlecha();
                    break;
                case 3:
                    arquero.correr();
                    break;
                case 4:
                    arquero.caminar();
                    break;
                case 0:
                    System.out.println("Saliendo del juego.");
                    break;
                default:
                    System.out.println("Opción no válida. Inténtalo de nuevo.");
            }
        } while (opcion != 0);

        scanner.close();
    }
}