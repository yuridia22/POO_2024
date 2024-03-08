public class BlocNota{
    private Nota nota1;
    private Nota nota2; 
    private Color c;

    public BlocNota() {
        nota1= new Nota("29/02/2024", "Terminar la practica 3", "01/03/2024");
        nota2= new Nota("04/03/2024", "Empezar la practica 4", "08/03/2024");
        c = new Color("magenta");
    }

    public Color getColor() {
        return c;
    }

    public void setColor(String color) {
        this.c.setColor(color);
    }

    public void mostrarNotas() {
        System.out.println(c.getColorANSI() + "Bloc de notas:");
        System.out.println(c.getColorANSI());
        System.out.println(nota1);
        System.out.println(nota2);
    }
}