import java.util.Scanner;

public class Television {
    private boolean encendida;
    private int canalActual;

    public Television() {
        this.encendida = false;
        this.canalActual = 3;  // Inicia en el canal 3
    }

    public void encenderApagar() {
        encendida = !encendida;
        if (encendida) {
            System.out.println("Televisión encendida");
        } else {
            System.out.println("Televisión apagada");
        }
    }

    public void cambiarCanal(int nuevoCanal) {
        if (encendida) {
            if (nuevoCanal >= 3 && nuevoCanal <= 6) {
                System.out.println("Cambiando al canal " + nuevoCanal);
                canalActual = nuevoCanal;
                realizarAccionPorCanal();  // Lógica adicional por cada cambio de canal
            } else {
                System.out.println("Canal no válido. Debe estar entre 3 y 6.");
            }
        } else {
            System.out.println("La televisión está apagada, enciéndela primero.");
        }
    }

    private void realizarAccionPorCanal() {
        // Lógica adicional por cada cambio de canal
        System.out.println("Realizando acción específica para el canal " + canalActual);
    }

    public static void main(String[] args) {
        Television miTv = new Television();
        Scanner scanner = new Scanner(System.in);

        int opcion;
        do {
            System.out.println("1. Encender");
            System.out.println("2. Apagar");
            System.out.println("3. Cambiar canal (3-6)");
            System.out.println("0. Salir");
            System.out.print("Elige una opción: ");
            opcion = scanner.nextInt();

            switch (opcion) {
                case 1:
                    miTv.encenderApagar();
                    break;
                case 2:
                    miTv.encenderApagar();
                    break;
                case 3:
                    if (miTv.encendida) {
                        System.out.print("Introduce el número del canal (3-6): ");
                        int nuevoCanal = scanner.nextInt();
                        miTv.cambiarCanal(nuevoCanal);
                    } else {
                        System.out.println("La televisión está apagada, enciéndela primero.");
                    }
                    break;
                case 0:
                    System.out.println("Saliendo del programa.");
                    break;
                default:
                    System.out.println("Opción no válida. Inténtalo de nuevo.");
            }
        } while (opcion != 0);
    }
}