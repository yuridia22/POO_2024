package Avatar;

public class Main {
    public static void main(String[] args) {
        Caballo c1 = new Caballo("Juan", "Café");
        Arquero a = new Arquero("Yun", 23, 1.67, "Hombre");
        a.datos();
        a.caminar();
        a.correr();
        c1.datos();
        c1.comer("manzana");
        c1.montar();
        a.disparar(3);
    }
    
}
