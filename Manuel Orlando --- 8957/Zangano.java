import java.util.Scanner;

public class Zangano {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        Abeja zangano1 = new Abeja();
        boolean vivo = true;
        String tipo = "";
        System.out.println("Raza = " + zangano1.getRaza());
        System.out.println("Tipo = " + zangano1.getTipo());
        System.out.println("Dias Vivo = " + zangano1.getDias_Vivo());
        System.out.println("Color = " + zangano1.getColor());
        System.out.println("Tamaño = " + zangano1.getTamanio());
        System.out.println("Quieres modificar los atributos: [n]no  [s]si");
        char opcion = teclado.next().charAt(0);
        teclado.nextLine();
        if(opcion == 's'){
            while (opcion == 's') {
                System.out.println("Selecciona que quieres modificar");
                System.out.println("1.- Raza    2.- Tipo    3.- Dias Vivo");
                System.out.println("4.- Color    5.- Tamaño 6.- Vivo");
                int seleccion = teclado.nextInt();
                teclado.nextLine();
                switch (seleccion) {
                    case 1:
                        System.out.println("Ingrese la raza");
                        String raza = teclado.nextLine();
                        zangano1.setRaza(raza);
                        break;
                    case 2:
                        System.out.println("Ingrese el tipo de abeja");
                        tipo = teclado.nextLine();
                        zangano1.setTipo(tipo);
                        break;
                    case 3:
                        System.out.println("Ingrese la cantidad de dia vivo");
                        int dia_vivo = teclado.nextInt();
                        teclado.nextLine();
                        zangano1.setDias_Vivo(dia_vivo);
                        break;
                    case 4:
                        System.out.println("Ingrese el color");
                        String color = teclado.nextLine();
                        zangano1.setColor(color);
                        break;
                    case 5:
                        System.out.println("Ingrese el tamaño");
                        double tamanio = teclado.nextDouble();
                        teclado.nextLine();
                        zangano1.setTamanio(tamanio);
                        break;
                    case 6:
                        System.out.println("si esta vivo o muerto");
                        vivo = teclado.nextBoolean();
                        teclado.nextLine();
                        zangano1.setVivo(vivo);
                        break;
                
                    default:
                        System.out.println("Opcion Invalida");
                        break;
                }
                System.out.println("Quieres seguir modificando los atributos: [n]no  [s]si");
                opcion = teclado.  next().charAt(0);
            }
        }
        zangano1.comer();
        zangano1.tomarAgua();
        zangano1.volar();
        zangano1.picar();
        zangano1.trabajo();
    }
}