public class Marciano {
    private String nombre;
    private String planeta;
    private int edad;
    private double altura;
    private double peso;
    private int estado;

    public static final int VIVO = 1;
    public static final int DURMIENDO = 2;
    public static final int MUERTO = 3;

    public Marciano() {
        setNombre("Zog");
        setPlaneta("Marte");
        setEdad(0);
        setEstado(1);
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nom) {
        this.nombre = nom.equals("") ? "Zog" : nom;
    }

    public String getPlaneta() {
        return planeta;
    }

    public void setPlaneta(String plan) {
        this.planeta = plan.equals("") ? "Marte" : plan;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int age) {
        this.edad = age;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double height) {
        this.altura = height;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double weight) {
        this.peso = weight;
    }

    public int getEstado() {
        return estado;
    }

    public void setEstado(int status) {
        this.estado = status;
    }

    public void hablar() {
        System.out.println("Hola, soy " + nombre + " y vengo de " + planeta);
    }

    public void caminar() {
        System.out.println(nombre + " está caminando.");
    }

    public void correr() {
        System.out.println(nombre + " está corriendo.");
    }

    public void flotar() {
        System.out.println(nombre + " está flotando en gravedad cero.");
    }

    public void respirar() {
        System.out.println(nombre + " está respirando.");
    }
    public void dormir() {
        if (getEstado() == VIVO) {
            setEstado(DURMIENDO);
            System.out.println(nombre + " está durmiendo.");
        } else {
            System.out.println(nombre + " no puede dormir si está muerto.");
        }
    }
    public void despertar() {
        if (getEstado() == DURMIENDO) {
            setEstado(VIVO);
            System.out.println(nombre + " ha despertado.");
        } else {
            System.out.println(nombre + " no puede despertar si no está durmiendo.");
        }
    }
    public void morir() {
        if (getEstado() != MUERTO) {
            setEstado(MUERTO);
            System.out.println(nombre + " ha muerto.");
        } else {
            System.out.println(nombre + " ya está muerto.");
        }
    }
}
