public class HolaMundo {
    private String saludo;
    private Color c;

    public HolaMundo(String saludo, Color c) {
        setSaludo(saludo);
        c= new Color("Magenta");
    }

    public String getSaludo() {
        return saludo;
    }

    public void setSaludo(String saludo) {
        this.saludo = saludo.equals(" ") ? "Hola Mundo" : saludo;
    }
    public Color getColor(){
        return c;
    }

    public void setColor(Color c){
        this.c=new Color(c);
    }

    public String show() {
        return c.getAnsi() + getSaludo();
    }
}
