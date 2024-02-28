public class Main {
    public static void main(String[] args) {
        Boxeador boxeador1 = new Boxeador(true, "Wil", 1.69, 18, 1, 63, "baja");
        Coach coach1 = new Coach("Ryan", 54, "peso pesado");

        // aqui se juega con los metodos
        System.out.println("-- EJECUCION DEL CODIGO --");
        System.out.println("B O X E A D O R");
        System.out.println(" ");
        boxeador1.entrenar(3);
        boxeador1.pelear(3);
        boxeador1.recibirGolpe(20);
        boxeador1.setEstado(false);
        boxeador1.descansar();

        
        System.out.println("---------------------------------------");
        System.out.println("C O A CH");
        coach1.enseñar(boxeador1);
        System.out.println("\n");
        coach1.crearEstrategia(boxeador1);
        System.out.println("\n");
        coach1.planificarEjercicios(boxeador1);
    }
}