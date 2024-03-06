public class Color {

private String color;
private String coloransi;

public Color(String color){
    setColor(color);
}
public String getcolor(){
    return color;
}
public void setColor(String color){
    this.color=color.equals("")?"Red":color;
    this.color=this.color.toLowerCase();
    switch (this.color){
    case "BLACK": coloransi="\u001B[30m";break;
    case "GREEN": coloransi="\\u001B[32m";break;
    case "RED": coloransi="\\u001B[31m";break;
    case "YELLOW": coloransi="\\u001B[33m";break;
    case "BLUE": coloransi="\\u001B[34m";break;
    case "PURPLE": coloransi="\\u001B[35m";break;
    case "CYAN": coloransi="\\u001B[36m";break;
    default: color="white"; coloransi="\\u001B[37m";
    }
}
 
    
}