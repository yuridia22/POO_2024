public class MainPrueba {
    public static void main(String[] args) {
        // Probando la clase Celular
        Celular miCelular = new Celular("Samsung", "Android", 6.4, 128, 3, "Snapdragon 888", 999.99);

        System.out.println("Probando la clase Celular:");
        System.out.println("Marca: " + miCelular.getMarca());
        System.out.println("Sistema Operativo: " + miCelular.getSistemaOperativo());
        System.out.println("Tamaño de Pantalla: " + miCelular.getTamañoPantalla() + " pulgadas");
        System.out.println("Capacidad de Almacenamiento: " + miCelular.getCapAlmacenamiento() + " GB");
        System.out.println("Número de Cámaras: " + miCelular.getNumCamaras());
        System.out.println("Procesador: " + miCelular.getProcesador());
        System.out.println("Precio: " + miCelular.getPrecio() + " dólares");

        miCelular.tomarFoto();
        miCelular.iniciarCarga();
        miCelular.hacerLlamada();
        miCelular.reproducirMusica();

        double resultado = miCelular.realizarCalculo(10, 5, '+');
        System.out.println("Resultado del cálculo: " + resultado);

        System.out.println();

        // Probando la clase Ganado
        Ganado miGanado = new Ganado("Holstein", 24, 500, "Blanco y Negro");

        System.out.println("Probando la clase Ganado:");
        System.out.println("Raza: " + miGanado.getRaza());
        System.out.println("Edad: " + miGanado.getEdad() + " meses");
        System.out.println("Peso: " + miGanado.getPeso() + " kilogramos");
        System.out.println("Color: " + miGanado.getColor());

        miGanado.productividad();
        miGanado.aparearse();
        miGanado.temperamento("tranquilo");
        miGanado.jalar();
        miGanado.correr();
    }
}

