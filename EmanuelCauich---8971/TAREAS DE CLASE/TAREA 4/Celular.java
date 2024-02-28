public class Celular {
    private String marca;
    private String sistemaOperativo;
    private double tamañoPantalla; // en pulgadas
    private int capAlmacenamiento; // en GB
    private int numCamaras;
    private String procesador;
    private double precio; // en dólares

    public Celular(String marca, String sistemaOperativo, double tamañoPantalla, int capAlmacenamiento, int numCamaras, String procesador, double precio) {
        setMarca(marca);
        setSistemaOperativo(sistemaOperativo);
        setTamañoPantalla(tamañoPantalla);
        setCapAlmacenamiento(capAlmacenamiento);
        setNumCamaras(numCamaras);
        setProcesador(procesador);
        setPrecio(precio);
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getSistemaOperativo() {
        return sistemaOperativo;
    }

    public void setSistemaOperativo(String sistemaOperativo) {
        this.sistemaOperativo = sistemaOperativo;
    }

    public double getTamañoPantalla() {
        return tamañoPantalla;
    }

    public void setTamañoPantalla(double tamañoPantalla) {
        this.tamañoPantalla = tamañoPantalla;
    }

    public int getCapAlmacenamiento() {
        return capAlmacenamiento;
    }

    public void setCapAlmacenamiento(int capAlmacenamiento) {
        this.capAlmacenamiento = capAlmacenamiento;
    }

    public int getNumCamaras() {
        return numCamaras;
    }

    public void setNumCamaras(int numCamaras) {
        this.numCamaras = numCamaras;
    }

    public String getProcesador() {
        return procesador;
    }

    public void setProcesador(String procesador) {
        this.procesador = procesador;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public void tomarFoto() {
        System.out.println("Tomando foto...");
    }

    public void iniciarCarga() {
        System.out.println("Iniciando carga...");
    }

    public void hacerLlamada() {
        System.out.println("Realizando llamada...");
    }

    public void reproducirMusica() {
        System.out.println("Reproduciendo música...");
    }

    public double realizarCalculo(double num1, double num2, char operador) {
        double resultado = 0.0;
        switch (operador) {
            case '+':
                resultado = num1 + num2;
                break;
            case '-':
                resultado = num1 - num2;
                break;
            case '*':
                resultado = num1 * num2;
                break;
            case '/':
                if (num2 != 0) {
                    resultado = num1 / num2;
                } else {
                    System.out.println("Error: división por cero");
                }
                break;
            default:
                System.out.println("Operador no válido");
        }
        return resultado;
    }

}
