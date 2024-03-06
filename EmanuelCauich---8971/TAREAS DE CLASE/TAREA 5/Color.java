public class Color {
    private String color;
    private String coloransi;

    public Color (String color){
        setColor(color);
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        switch (color.toLowerCase()) {
            case "azul":
                this.coloransi = "\u001B[34m";
                break;
            case "amarillo":
                this.coloransi = "\u001B[33m";
                break;
            case "rojo":
                this.coloransi = "\u001B[31m";
                break;
            default:
                this.coloransi = "\u001B[30m";
                break;
        }
    }

    public String getColorAnsi(){
        return coloransi;
    }

}