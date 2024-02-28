package PRO.Progrmas.claseHerenica;

import java.util.Random;

public class Eva {
    // Atributos
    private String paisDelEva;
    private String modelo;
    private String color;
    private int altura;
    private int estado; // 1. activo 2.peleando 3. Apagado

    // Constructor
    public Eva(String paisDelEva, String modelo, String color, int altura) {
        setPaisDelEva(paisDelEva);
        setModelo(modelo);
        setColor(color);
        setAltura(altura);
        setEstado(3);
    }

    // Métodos Get y Set con switch
    public String getPaisDelEva() {
        return paisDelEva.toUpperCase();
    }

    public void setPaisDelEva(String paisDelEva) {
        this.paisDelEva = paisDelEva;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getColor() {
        switch (color) {
            case "blanco con azul":
                return "Blanco con Azul";
            case "morado con verde":
                return "Morado con Verde";
            case "rojo":
                return "Rojo";
            default:
                return "Desconocido";
        }
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getAltura() {
        return altura;
    }

    public void setAltura(int altura) {
        this.altura = altura;
    }

    public int getEstado() {
        switch (estado) {
            case 0:
                return 0;
            case 1:
                return 1;
            case 2:
                return 2;
            case 3:
                return 3;
            case 4:
                ;
                return 4;
            default:
                return -1; // Estado desconocido
        }
    }

    public void setEstado(int estado) {
        this.estado = estado;
    }

    // Acciones
    public void correr() {
        int accion = (int) (Math.random() * 4 + 1);
        switch (accion) {
            case 1:
                System.out.println("Corriendo para llegar al destino.");
                break;
            case 2:
                System.out.println("Corriendo para salvar a otro EVA en peligro.");
                break;
            case 3:
                System.out.println("Corriendo para alcanzar el objetivo.");
                break;
            default:
                System.out.println("Acción de correr no reconocida.");
        }
    }

    public void pelea(int accion) {
        switch (accion) {
            case 1:
                System.out.println("Peleando para derrotar al Ángel.");
                break;
            case 2:
                System.out.println("Peleando contra otro piloto de EVA.");
                break;
            case 3:
                System.out.println("La alma dentro del EVA ha reaccionado en la pelea.");
                break;
            default:
                System.out.println("Acción de pelea no reconocida.");
        }
    }

    public void camina(int accion) {
        switch (accion) {
            case 1:
                System.out.println("Caminando de regreso a la base.");
                break;
            case 2:
                System.out.println("Caminando según deseo del piloto.");
                break;
            default:
                System.out.println("Acción de caminar no reconocida.");
        }
    }
}
