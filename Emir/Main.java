public class Main {
    public static void main(String[] args) {
        BlocDeNotas bc = new BlocDeNotas(10);
        bc.mostrarNotas();
        Nota n = new Nota("06/03/2024", "Terminar mi código de programación", "08/03/2024");
        bc.actualizarNota(2, n);
        bc.mostrarNotas();
    }
}
