package BeecrownEjercicios;

public class Ternometro {
    private double suma;
    private int cont;
    private String marca;
    private Temperatura promedio;
    private Temperatura min;
    private Temperatura max;
    private boolean on;
    private Temperatura temperatura;
    private double guardarMin;
    private double guardarMax;

    /*
     * public void medirTemperatura(){
     * temperatura.setValor((math.random()*41)+10);
     * cont++;
     * 
     * }
     */

    public Ternometro() {
        setMarca("Sharp");
        on = false;
        promedio = new Temperatura();
        min = new Temperatura();
        max = new Temperatura();
        temperatura = new Temperatura();

    }

    public Ternometro(String marca, double valor, char unidad) {
        setMarca(marca);
        temperatura = new Temperatura(valor, unidad);
        promedio = new Temperatura(valor, 'C');
        min = new Temperatura(1, 'C');
        max = new Temperatura(2, 'C');
        on = false;
        cont = 0;
        suma = 0.0;
    }

    public void on() {
        if (on == false) {
            on = true;
        } else {
            System.out.println("el termometro ya esta encendido");
        }

    }

    public void isOn() {
        if (on == true) {
            on = false;
        } else {
            System.out.println("el termometro ya esta encendido");
        }
    }

    private void min() {
        guardarMin = temperatura.getValor();
        if (on == true) {
            if (guardarMax > guardarMin) {
                min.setValor(guardarMin);
            } else {
                min.setValor(guardarMax);

            }

        } else {
            System.out.println("el Ternometro no esta encendido");
        }

    }

    private void max() {
        guardarMax = temperatura.getValor();
        if (on == true) {
            if (guardarMax > guardarMin) {
                max.setValor(guardarMax);
            } else {
                max.setValor(guardarMin);
            }

        } else {
            System.out.println("el ternometro no esta encendido");
        }
    }

    private void setPromedio() {
        if (on == true) {
            suma += temperatura.getValor();
            promedio.setValor(suma / cont);

        } else {
            System.out.println("el ternometro no esta encendido");
        }

    }

    private void medir() {
        temperatura.setValor((Math.random() * 40));
    }

    public void dGFAGC() {
        temperatura.setValor((temperatura.getValor() - 32) * 5 / 9);
        temperatura.setUnidad('C');

    }

    public void dGkAGC() {
        temperatura.setValor(temperatura.getValor() - 273.15);
        temperatura.setUnidad('C');
    }

    public void gK() {
        temperatura.setValor(temperatura.getValor() + 273.15);
        temperatura.setUnidad('K');
    }

    public void gF() {
        temperatura.setValor((temperatura.getValor() * 9 / 5) + 32);
        temperatura.setUnidad('F');
    }

    private void sacar() {
        max();
        min();
        setPromedio();
    }

    public void convertir(char unidad) {
        cont++;
        medir();

        if (on == true) {
            switch (unidad) {
                case 'k':
                case 'K':
                    gK();
                    break;

                case 'f':
                case 'F':
                    gF();
                    break;

                case 'C':
                case 'c':
                    temperatura.setUnidad('c');
                    if (unidad != temperatura.getUnidad()) {

                        temperatura.setUnidad('C');
                        if (unidad == temperatura.getUnidad()) {
                            System.out.println("ya esta esta en grados Celsuis");
                        } else {
                            if (unidad == 'f' || unidad == 'F') {
                                dGFAGC();
                                temperatura.setUnidad('C');

                            } else {
                                dGkAGC();
                                temperatura.setUnidad('c');

                            }

                        }

                    } // if
                    break;
                default:
                    System.out.println("Error :[ ");
                    break;
            }// stich
        } else {
            System.out.println("el ternometro no esta encendido");
        }
        sacar();

    }

    public Temperatura getPromedio() {
        return promedio;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getMarca() {
        return marca;
    }

    public Temperatura getMax() {
        return max;
    }

    public Temperatura getMin() {
        return min;
    }

    public Temperatura getTemperatura() {
        return temperatura;
    }

    @Override
    public String toString() {

        return temperatura + "\nmax: " + max + "\nmin: " + min + "\npromedio: " + promedio;
    }

}
