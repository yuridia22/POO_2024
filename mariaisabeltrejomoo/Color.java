public class Color {
    private String color;
    private String colorANSI;

    public Color(String color){
        setColor(color);
    }
    public String getColor(){
        return color;
    }
    public void setColor(String color){
        if(color.equals(" ")){
            this.color=color;
            switch(color) {
                case "negro":
                case "Negro":
                    this.colorANSI="\033[30m";
                    break;
                case "rojo":
                case "Rojo":
                    this.colorANSI="\033[31m";
                    break;
                case "verde":
                case "Verde":
                    this.colorANSI="\033[32m";
                    break;
                case "amarillo":
                case "Amarrillo":
                    this.colorANSI="\033[33m";
                    break;
                case "azul":
                case "Azul":                
                   this.colorANSI="\033[34m";
                    break;
                case "magenta":
                case "Magenta":
                    this.colorANSI="\033[35m";
                    break;
                case "cyan":
                case "Cyan":
                    this.colorANSI="\033[36m";
                    break;
                default:
                    this.color="blanco";
                    this.colorANSI="\033[37m";
                    break;
            }
        }
    }
    public String getColorANSI() {
        return colorANSI;
    }

    public void setColorANSI(String colorANSI){
        this.colorANSI=colorANSI;
    }
}