public class MarcianoEnNave {
    public static void main(String[] args) {
        Marciano marciano = new Marciano();
        marciano.hablar();
        marciano.caminar();
        NaveEspacial nave = new NaveEspacial("Estelar-X", "Exploradora", 9.8, 20.5, 1500.0);
        System.out.println(nave.getModelo());
        System.out.println(nave.getTipo());
        System.out.println(nave.getVelocidadMaxima() + " unidades de velocidad");
        System.out.println(nave.getAltura() + " metros");
        System.out.println(nave.getPeso() + " toneladas");
        nave.viajar();
        marciano.dormir();
        nave.desactivarNave();
        marciano.dormir();
        nave.reparar();
        marciano.despertar();
        nave.viajar();
    }
}
