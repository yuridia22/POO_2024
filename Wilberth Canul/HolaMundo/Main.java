public class Main {
    public static void main(String[] args) {
        HolaMundo holaMundo = new HolaMundo("azul", "¡Hola Mundo en azul!", 20);

        System.out.println("Color original: " + holaMundo.getColor());
        System.out.println("Texto original: " + holaMundo.getTexto());
        System.out.println("Tamaño de letra original: " + holaMundo.getTamañoLetra());

        holaMundo.setColor("amarillo");
        holaMundo.setTexto("¡Hola Mundo en amarillo!");
        holaMundo.setTamañoLetra(16);

        System.out.println("\nColor actualizado: " + holaMundo.getColor());
        System.out.println("Texto actualizado: " + holaMundo.getTexto());
        System.out.println("Tamaño de letra actualizado: " + holaMundo.getTamañoLetra());
    }
}
