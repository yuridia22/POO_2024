public class Main {
    public static void main(String[] args) {
        BlocDeNotas bcn = new BlocDeNotas(6);
        Nota n = new Nota("Para dentro de un mes", "12/05/2024", "12/06/2024", "Terminar mi proyecto de POO");
        bcn.mostrarNotas();
        bcn.agregarNota(n);
        bcn.mostrarNotas();
    } 
}
