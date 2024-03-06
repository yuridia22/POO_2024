package Trabjaos;

public class Main {
    public static void main(String args[]) {
        HolaMundoColor hmc = new HolaMundoColor("", "negro");
        System.out.println(hmc.getColor());
        Perro p = new Perro("fifi", "pastor", "cafe", "hembra", 1, 10, 12);
        System.out.println(p.getNombre());
        hmc.show();
        hmc.setColor("azul");
        hmc.show();
        hmc.reset();
        hmc.show();

        Avatar arquero = new Avatar("Julio", 19, 64.5, "disparar", 10);
        arquero.setNombre("tulio");
        arquero.setComida("Hamburgesa");
        arquero.comer();
        arquero.setArco(true);
        arquero.setFlechas(5);
        arquero.disparar();
        // arquero.disparar();
        arquero.acribillar();
        System.out.println(arquero.getPeso());

        Nota n = new Nota("juli");
        n.setColor("azul");
        n.setFecha("29/02/2024");
        n.setNivel("Normal");
        n.setTexto("Realizar las tareas de la clase");
        n.setFechaLimite("8/02/2024");
        n.show();
        n.guardar();

        TermometroDigital t = new TermometroDigital("amarillo");
        t.setMax(10.0, 'C');
        t.setMin(0.00, 'C');
        t.encender();
        t.medirTemperatura();
        t.show();
        // System.out.println(t.getTemperatura());

    }

}
