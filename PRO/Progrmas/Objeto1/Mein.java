package DanaChin.Progrmas;

import DanaChin.Progrmas.Objeto1.Lapiz;

public class Mein {
    public static void main(String[] args) {
        // Crear un lápiz
        Lapiz miLapiz = new Lapiz("azul", "Faber-Castell", 15.0, true);

        // Usar métodos getter para acceder a los atributos
        System.out.println("Color del lápiz: " + miLapiz.getColor());
        System.out.println("Marca del lápiz: " + miLapiz.getMarca());
        System.out.println("Longitud del lápiz: " + miLapiz.getLongitud());
        System.out.println("¿El lápiz tiene goma? " + miLapiz.isTieneGoma());

        // Usar métodos setter para modificar atributos
        miLapiz.setColor("rojo");
        miLapiz.setLongitud(14.5);

        // Llamar a métodos de comportamiento
        miLapiz.afilar();
        miLapiz.usarGoma();
        miLapiz.describir();
    }
}