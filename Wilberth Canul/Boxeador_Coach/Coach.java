public class Coach {
    // ATRIBUTOS
    private String nombre;
    private int edad;
    private String categoria;

    // CONSTRUCTOR
    public Coach(String nombre, int edad, String categoria){
        setNombre(nombre);
        setEdad(edad);
        setCategoria(categoria);
    }

    // METODOS DE ACCESO

    public String getNombre(){
        return nombre;
    }

    public void setNombre(String nombre){
        if (nombre != null && !nombre.isEmpty()) {
            this.nombre = nombre;
        } else {
            System.out.println("Error: El nombre no puede ser nulo ni vacío.");
        }
    }

    public int getEdad(){
        return edad;
    }

    public void setEdad(int edad){
        if (edad >= 0) {
            this.edad = edad;
        } else {
            System.out.println("Error: La edad no puede ser negativa.");
        }
    }

    public String getCategoria(){
        return categoria;
    }

    public void setCategoria(String categoria){
        this.categoria = categoria;
    }

    public void enseñar(Boxeador boxeador){
        System.out.println(nombre + " va a entrenar a : " + boxeador.getNombre());
    }

    public void crearEstrategia(Boxeador boxeador) {
        System.out.println("Estrategia para " + boxeador.getNombre() + ":");
        System.out.println("- Mejorar la defensa");
        System.out.println("- Trabajar en la velocidad de los golpes");
        System.out.println("- Practicar combinaciones de golpes");
    }

    public void planificarEjercicios(Boxeador boxeador) {
        System.out.println("Rutina de ejercicios planificada para " + boxeador.getNombre() + ":");

        System.out.println("1. Calentamiento: Trotar durante 10 minutos para aumentar la circulacion sanguinea.");
        System.out.println("2. Fuerza y resistencia:");
        System.out.println("- Realizar 3 series de flexiones de brazos.");
        System.out.println("3. Velocidad y agilidad:");
        System.out.println("- Realizar ejercicios de sombra boxeo durante 10 minutos.");

    }
}
