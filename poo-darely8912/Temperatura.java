public class Temperatura {
    private double ftemp; 

    
    public Temperatura(double fahrenheit) {
        this.ftemp = fahrenheit;
    }

    
    public void setFahrenheit(double fahrenheit) {
        this.ftemp = fahrenheit;
    }

    
    public double getFahrenheit() {
        return this.ftemp;
    }

}Q 
    public double getCelsius() {
        return (5.0 / 9.0) * (this.ftemp - 32);
    }

    
    public double getKelvin() {
        return ((5.0 / 9.0) * (this.ftemp - 32)) + 273;
    }
}
