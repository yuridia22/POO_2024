public class Main {
    public static void main(String[] args) {
        TermometroDigital t = new TermometroDigital("kelvin", 1, "Braun", 100, 0);
        t.datos();
        t.medirTemp();
        TermometroDigital t1 =  new TermometroDigital("celsius", 100, 0);
        t1.datos();
        t1.medirTemp();
    }
}
