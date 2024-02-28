public class NaveEspacial {
    private String modelo;
    private String tipo;
    private double velocidadMaxima;
    private double altura;
    private double peso;
    private int estado;  // 1 significa activa, 0 significa desactivada
    public NaveEspacial(String modelo, String tipo, double velocidadMaxima, double altura, double peso) {
        setModelo(modelo);
        setTipo(tipo);
        setVelocidadMaxima(velocidadMaxima);
        setAltura(altura);
        setPeso(peso);
        this.estado = 1;  // Estado inicial: 1 significa activa, 0 significa desactivada
    }
    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = (modelo != null && !modelo.isEmpty()) ? modelo : "Desconocido";
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = (tipo != null && !tipo.isEmpty()) ? tipo : "Desconocido";
    }

    public double getVelocidadMaxima() {
        return velocidadMaxima;
    }

    public void setVelocidadMaxima(double velocidadMaxima) {
        this.velocidadMaxima = velocidadMaxima;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public int getEstado() {
        return estado;
    }

    private void cambiarEstado(int valor) {
        // Cambia el estado solo si la nave está activa (estado > 0)
        this.estado = (this.estado > 0) ? valor : 0;
    }

    public void desactivarNave() {
        System.out.println("Nave desactivada. Fin de la misión.");
        cambiarEstado(0);  // Cambia el estado a 0 (desactivada)
    }

    public void viajar() {
        if (getEstado() > 0) {
            System.out.println("Viajando a velocidad warp");
        } else {
            System.out.println("La nave está desactivada. No se puede viajar.");
        }
    }

    public void reparar() {
        System.out.println("Reparando la nave espacial.");
        cambiarEstado(1);  // Cambia el estado a 1 (activa) al realizar reparaciones
    }

    public static void main(String[] args) {
        NaveEspacial miNave = new NaveEspacial("Estelar-X", "Exploradora", 9.8, 20.5, 1500.0);
        System.out.println(miNave.getModelo());
        System.out.println(miNave.getTipo());
        System.out.println(miNave.getVelocidadMaxima() + " unidades de velocidad");
        System.out.println(miNave.getAltura() + " metros");
        System.out.println(miNave.getPeso() + " toneladas");

        miNave.viajar();
        miNave.desactivarNave();
        miNave.viajar();  // Intentar viajar después de desactivar la nave
        miNave.reparar();
        miNave.viajar();  // Intentar viajar después de reparar la nave
    }
}
