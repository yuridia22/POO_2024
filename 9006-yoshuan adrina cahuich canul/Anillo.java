public class Anillo {
    private String color;
    private String material;
    private int numero;
    private String forma;
    private String accion;

    public Anillo(String color, String material, int numero, String forma){

    
        setColor(color);
        setMaterial(material);
        setNumero(numero);
        setForma(forma);
        
     }
        //set
         public void setColor(String color) {
             this.color = color;
         }
         public void setForma(String forma) {
             this.forma = forma;
         }
         public void setMaterial(String material) {
             this.material = material;
         }
         public void setNumero(int numero) {
             this.numero = numero;
         }




        //get
         public String getColor() {
             return color;
         }
         public String getForma() {
             return forma;
         }
         public String getMaterial() {
             return material;
         }
         public int getNumero() {
             return numero;
         }



         public String mostrarM(){
            return material;
         }
         public int mostrarN(){
            return numero;
         }
         public String mostrarF(){
            return forma;
        }
        public String mostrarC(){
            return color;
        }
      
        public void setAccion(String accion){
           
            switch (accion) {
                case "quitar" :this.accion = "quitar";
                    
                    break;
            
                default :this.accion = "puesto";
                    break;
            }

        }
        public String getAccion(){
            return accion;
        }
        public String mostrarAc(){
            return accion;
        }
        public static void main(String[] args) {
            Anillo a = new Anillo ("negro", "metal", 19, "circular");
            System.out.println(a.mostrarM ());
            System.out.println(a.mostrarC());
            System.out.println(a.mostrarN());
            System.out.println(a.mostrarF());
            a.setAccion("quitar");
          
            System.err.println(a.mostrarAc());





    }
}
