public class MagoDeFuego {
    private String nombre; // Almacena el nombre del mago
    private int nivel; // Almacena el nivel del mago
    private int puntosDeVida; // Almacena los puntos de vida del mago

    public MagoDeFuego(String nombre, int nivel, int puntosDeVida) {
        this.nombre = nombre; // Inicializa el nombre del mago con el valor proporcionado
        this.nivel = nivel; // Inicializa el nivel del mago con el valor proporcionado
        this.puntosDeVida = puntosDeVida; // Inicializa los puntos de vida del mago con el valor proporcionado
    }

    public void lanzarHechizo() {
        System.out.println(nombre + " lanza un hechizo de fuego!"); // Muestra un mensaje indicando que el mago ha
                                                                    // lanzado un hechizo de fuego
    }

    public void recibirDanio(int cantidad) {
        puntosDeVida -= cantidad; // Resta la cantidad de daño recibida a los puntos de vida del mago
        System.out.println(nombre + " recibe " + cantidad + " puntos de daño."); // Muestra un mensaje indicando la
                                                                                 // cantidad de daño recibida
        if (puntosDeVida <= 0) {
            System.out.println(nombre + " ha sido derrotado."); // Si los puntos de vida llegan a cero o menos, muestra
                                                                // un mensaje indicando que el mago ha sido derrotado
        }
    }

    public void aumentarNivel() {
        nivel++; // Incrementa el nivel del mago en uno
        System.out.println(nombre + " ha subido de nivel. Ahora es nivel " + nivel + "."); // Muestra un mensaje
                                                                                           // indicando el nuevo nivel
                                                                                           // del mago
    }

    public void mostrarEstado() {
        System.out.println("Nombre: " + nombre); // Muestra el nombre del mago
        System.out.println("Nivel: " + nivel); // Muestra el nivel del mago
        System.out.println("Puntos de Vida: " + puntosDeVida); // Muestra los puntos de vida del mago
    }
}