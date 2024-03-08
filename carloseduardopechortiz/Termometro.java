 public class Termometro{  

    private boolean encender;
    private String Samsumg ;
    

    
      // Constructor
      public Termometro( double encender, String samsumg) {
        this.encender = false;
        

    }

    // Método para encender el termómetro
    public void encender() {
        this.encender = true;
    }
    public void apagar() {
        this.encender = false;
    } 
         
    }

 