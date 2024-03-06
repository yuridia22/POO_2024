package Jimmy.clases;

public class Color {
  private String color;
  private String coloranci;

  public Color(String color) {
    setColor(color);
  }

  public String getColor() {
    return color;
  }

  public void setColor(String color) {
    switch (color) {
      case "blue":
        this.color = color;
        this.coloranci = "\033[34m";
        break;
      case "red":
        this.color = color;
        this.coloranci = "\033[31m";
        break;
      case "black":
        this.color = color;
        this.coloranci = "\033[30m";
        break;
      case "yellow":
        this.color = color;
        this.coloranci = "\033[33m";
        break;
      case "purple":
        this.color = color;
        this.coloranci = "\033[35m";
        break;
      case "cyan":
        this.color = color;
        this.coloranci = "\033[36m";
        break;
      case "blank":
        this.color = color;
        this.coloranci = "\033[37m";
        break;
      case "reset":
        this.color = color;
        this.coloranci = "\u001B[0m";
        break;

      default:
        System.out.println("No has ingresado un color disponible");
        break;
    }
  }

  public String getColorAnci() {
    return coloranci;
  }
}
