public class MainP {

    public static void main(String[] args) {

        // Crear una instancia de PilotoF1
        PilotoF1 piloto = new PilotoF1("Mexicana");

        // Mostrar información inicial del piloto
        System.out.println("Información inicial del piloto:");
        System.out.println("Nombre: " + piloto.getNombre());
        System.out.println("Equipo: " + piloto.getEquipo());
        System.out.println("Número de coche: " + piloto.getNocoche());
        System.out.println("Nacionalidad: " + piloto.getNacionalidad());
        System.out.println("Altura: " + piloto.getAltura());
        System.out.println("Peso: " + piloto.getPeso());

        // Actualizar información del piloto
        piloto.setNombre("Nuevo Piloto");
        piloto.setEquipo("Nuevo Equipo");
        piloto.setNocoche(22); // Cambié el número del coche a un valor entero
        piloto.setNacionalidad("Otra Nacionalidad");
        piloto.setAltura(1.80);
        piloto.setPeso(70);

        // Mostrar información actualizada del piloto
        System.out.println("\nInformación actualizada del piloto:");
        System.out.println("Nombre: " + piloto.getNombre());
        System.out.println("Equipo: " + piloto.getEquipo());
        System.out.println("Número de coche: " + piloto.getNocoche());
        System.out.println("Nacionalidad: " + piloto.getNacionalidad());
        System.out.println("Altura: " + piloto.getAltura());
        System.out.println("Peso: " + piloto.getPeso());
    }
}
