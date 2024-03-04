public class CuentaBancaria {
    private int numCuenta;
    private String nombreTitular;
    private double saldo;
    private String tipo;

    public CuentaBancaria(int numCuenta, String nombreTitular, double saldo, String tipo) {
        setNumCuenta(numCuenta);
        setNombreTitular(nombreTitular);
        setSaldo(saldo);
        setTipo(tipo);
    }

    public int getNumCuenta() {
        return numCuenta;
    }

    public void setNumCuenta(int numCuenta) {
        this.numCuenta = numCuenta;
    }

    public String getNombreTitular() {
        return nombreTitular;
    }

    public void setNombreTitular(String nombreTitular) {
        this.nombreTitular = nombreTitular;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public void depositar(double cantidad) {
        if (cantidad > 0) {
            saldo += cantidad;
            System.out.println("Se han depositado " + cantidad + " unidades en la cuenta " + numCuenta + ". Nuevo saldo: " + saldo);
        } else {
            System.out.println("La cantidad a depositar debe ser mayor que cero.");
        }
    }

    public void retirar(double cantidad) {
        if (cantidad > 0) {
            if (saldo >= cantidad) {
                saldo -= cantidad;
                System.out.println("Se han retirado " + cantidad + " unidades de la cuenta " + numCuenta + ". Nuevo saldo: " + saldo);
            } else {
                System.out.println("Saldo insuficiente para realizar la operación.");
            }
        } else {
            System.out.println("La cantidad a retirar debe ser mayor que cero.");
        }
    }
}
