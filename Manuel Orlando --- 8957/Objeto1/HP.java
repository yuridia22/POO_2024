package Objeto1;
public class HP {
    public static void main(String[] args) {
        Laptop l = new Laptop("", "", "", "", 0, 0);
        l.setIo(true);
        l.mostrarInfo();
        l.actualizar();
        l.cambiarSistemaOperativo("Linux");
        l.aumentarRAM(16);
        l.ejecutarPrograma("Word");
        l.sobrecalentarse();
        l.suspender();
    }
}
