public class Termometro1 {
    public static void main(String[] args) {

        Termometro termometro = new Termometro("Sony", "Celsius");
        termometro.setEstadoTermometro(true);
        if (termometro.getEstadoTermometro() == true) {
            termometro.medirTemperatura();
            System.out.println();
            System.out.println();
            System.out.println("Metodo sobrecargado");
            termometro.medirTemperatura("°K");
            System.out.println();
            System.out.println();
            System.out.println();
            termometro.almacenarTemperatura();
            termometro.identificarTemperaturas();
            System.out.println("Temperatura promedio: " + termometro.promediarTemperaturas() + " grados Celsius");
            termometro.convertirAEscala();
        } else {
            System.out.println("Está apagado");
        }
    }
}