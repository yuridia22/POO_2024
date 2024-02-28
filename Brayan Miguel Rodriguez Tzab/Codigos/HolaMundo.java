public class HolaMundo {
    private String mensaje;

        public HolaMundo(String mensaje) {
            this.mensaje = mensaje;
        }
        public String getMensaje() {
            return mensaje;
        }
    
        public void setMensaje(String mensaje) {
            this.mensaje = mensaje;
        }
        public void cambiarColor(String color) {
            switch (color) {
                case "rojo":
                    System.out.println("\u001B[31m" + mensaje + "\u001B[0m");
                    break;
                case "verde":
                    System.out.println("\u001B[32m" + mensaje + "\u001B[0m");
                    break;
                case "amarillo":
                    System.out.println("\u001B[33m" + mensaje + "\u001B[0m");
                    break;
                case "azul":
                    System.out.println("\u001B[34m" + mensaje + "\u001B[0m");
                    break;
                default:
                    System.out.println(mensaje);
            }
        }
    
        public static void main(String[] args) {

            HolaMundo hola = new HolaMundo("HolaMundoBrayan");
    
            hola.cambiarColor("rojo");
        }
    }