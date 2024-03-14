public class Color {
    private String color;
    private String cANSI;

    public Color(String color) {
        setColor(color);
    }

    public void setColor(String color) {
        switch (color) {
            case "azul" :
            this.color = color;
                cANSI = ("\u001B[34m");
                break;
            case "verde" :
            this.color = color;
                cANSI = ("\u001B[32m");
                break;
            case "rojo" :
                this.color = color;
                cANSI = ("\u001B[31m");
                break;
            case "amarillo" :
                this.color = color;
                cANSI = ("\u001B[33m");
                break;
            case "morado" :
                this.color = color;
                cANSI = ("\u001B[35m");
                break;
            case "cian" :
                this.color = color;
                cANSI = ("\u001B[36m");
                break;
            case "negro" :
                this.color = color;
                cANSI = ("\u001B[30m");
            default: 
                this.color = color;
                cANSI = ("\u001B[37m");
                break;
        }
    }

    public String getColor() {
        return color;
    }

    public String getcANSI() {
        return cANSI;
    }
}