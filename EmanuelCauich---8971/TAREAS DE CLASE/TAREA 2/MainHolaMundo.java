public class MainHolaMundo {
    public static void main(String[] args) {
        HolaMundoColor mensaje1 = new HolaMundoColor(" ", "¡Hola, Mundo!", 20);
        mensaje1.imprimir();

        HolaMundoColor mensaje2 = new HolaMundoColor("amarillo", "¡Hola, Mundo!", 16);
        mensaje2.imprimir();

        HolaMundoColor mensaje3 = new HolaMundoColor("rojo", "¡Hola, Mundo!", 12);
        mensaje3.imprimir();
    }
}
