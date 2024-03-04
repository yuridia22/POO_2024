public class Celular {
    private String marca;
    private String modelo;
    private double precio;
    private boolean encendido;

    
    public Celular(String marca, String modelo, double precio) {
        this.marca = marca;
        this.modelo = modelo;
        this.precio = precio;
        this.encendido = false; 
    }

    
    public String getMarca() {
        return marca;
    }

    public String getModelo() {
        return modelo;
    }

    public double getPrecio() {
        return precio;
    }

    public boolean isEncendido() {
        return encendido;
    }

    public void setEncendido(boolean encendido) {
        this.encendido = encendido;
    }

    
    public void realizarLlamada(String numero) {
        if (encendido) {
            System.out.println("Llamando al numero: " + numero);
        } else {
            System.out.println("El celular esta apagado. Enciendelo para realizar llamadas.");
        }
    }

    public void enviarMensaje(String destinatario, String mensaje) {
        if (encendido) {
            System.out.println("Enviando mensaje a " + destinatario + ": " + mensaje);
        } else {
            System.out.println("El celular esta apagado. Enciendelo para enviar mensajes.");
        }
    }

    public void mostrarInformacion() {
        System.out.println("Marca: " + marca);
        System.out.println("Modelo: " + modelo);
        System.out.println("Precio: $" + precio);
        System.out.println("Estado: " + (encendido ? "Encendido" : "Apagado"));
    }
}
