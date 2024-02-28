package Objeto2;

public class Jaguar {
    private String nombre;
    private int edad;
    private double peso;
    private double altura;
    private double velocidad;

    public Jaguar(String nombre, int edad, double peso, double altura, double velocidad){
        setNombre(nombre);
        setEdad(edad);
        setPeso(peso);
        setAltura(altura);
        setVelocidad(velocidad);

    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        if (nombre != null && !nombre.isEmpty()) {
            this.nombre = nombre;
        } else {
            System.out.println("Error: El nombre no puede estar vacío.");
        }
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        if (edad >= 0) {
            this.edad = edad;
        } else {
            System.out.println("Error: La edad no puede ser negativa.");
        }
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        if (peso > 0) {
            this.peso = peso;
        } else {
            System.out.println("Error: El peso debe ser mayor que cero.");
        }
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        if (altura > 0) {
            this.altura = altura;
        } else {
            System.out.println("Error: La altura debe ser mayor que cero.");
        }
    }

    public double getVelocidad() {
        return velocidad;
    }

    public void setVelocidad(double velocidad) {
        if (velocidad >= 0) {
            this.velocidad = velocidad;
        } else {
            System.out.println("Error: La velocidad no puede ser negativa.");
        }
    }

    // metodos

    public void caminar(double distancia) {
        if (distancia > 0 && velocidad > 0) {
            System.out.println(nombre + " está caminando " + distancia + " metros a una velocidad de " + velocidad + " km/h.");
        } else {
            System.out.println("No se puede caminar, la distancia o la velocidad no son válidas.");
        }
    }

    public void correr(double distancia) {
        if (distancia > 0 && velocidad > 0) {
            System.out.println(nombre + " está corriendo " + distancia + " metros a una velocidad de " + velocidad + " km/h.");
        } else {
            System.out.println("No se puede correr, la distancia o la velocidad no son válidas.");
        }
    }

    public void comunicarse() {
        System.out.println(nombre + " está comunicándose con otros jaguares.");
    }

    public void enfrentarDepredador(String depredador) {
        System.out.println(nombre + " está enfrentando al depredador: " + depredador + ".");
    }


}
