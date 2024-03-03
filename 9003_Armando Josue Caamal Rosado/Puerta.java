public class Puerta { 

    private double ancho; 

    private int alto; 

    private String color; 

    private String material; 

    private int ventanas; 

    public boolean estado; 


    public Puerta(double ancho) { 

        this.ancho = ancho; 

        this.alto = 0; 

        this.color = ""; 

        this.material = ""; 

        this.ventanas = 0; 

        this.estado = false; 

    } 



    public void setAncho(double ancho) { 

        this.ancho = ancho; 

    } 

  

    public double getAncho() { 

        return this.ancho; 

    } 

  

    public void setAlto(int alto) { 

        this.alto = alto; 

    } 

  

    public int getAlto() { 

        return this.alto; 

    } 

  

    public void setColor(String color) { 

        this.color = color; 

    } 

  

    public String getColor() { 

        return this.color; 

    } 

  

    public void setMaterial(String material) { 

        this.material = material; 

    } 

  

    public String getMaterial() { 

        return this.material; 

    } 

  

    public void setVentanas(int ventanas) { 

        this.ventanas = ventanas; 

    } 

  

    public int getVentanas() { 

        return this.ventanas; 

    } 

  

    public void setEstado(boolean estado) { 

        this.estado = estado; 

    } 

  

    public boolean getEstado() { 

        return this.estado; 

    } 

} 