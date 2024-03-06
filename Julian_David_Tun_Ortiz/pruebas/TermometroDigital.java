package pruebas;

public class TermometroDigital {
    private String marca;
    private String color;
    private boolean estado;
    private Temperatura temperatura;
    private Temperatura promedio;
    private Temperatura minimo;
    private Temperatura maximo;
    private double suma;
    private int cont;

    public TermometroDigital() {
        setMarca("Samsung");
        setColor("Blanco");
        temperatura = new Temperatura(0.0, 'C');
        promedio = new Temperatura(0.0, 'C');
        minimo = new Temperatura(0.0, 'C');
        maximo = new Temperatura(0.0, 'C');
        temperatura = new Temperatura(0.0, 'C');
        this.estado = false;
        suma = 0.0;
        cont = 0;
    }

    public TermometroDigital(String marca, String color, double valor, char unidad) {
        setMarca(marca);
        setColor(color);
        temperatura = new Temperatura(valor, unidad);
        promedio = new Temperatura(0.0, 'C');
        minimo = new Temperatura(0.0, 'C');
        maximo = new Temperatura(0.0, 'C');
        temperatura = new Temperatura(0.0, 'C');
        this.estado = false;
        suma = 0.0;
        cont = 0;
    }

    public String getMarca() {
        return marca;
    }

    public String getColor() {
        return color;
    }

    public Temperatura getTemperatura() {
        return temperatura;
    }

    public Temperatura getPromedio() {
        return promedio;
    }

    public Temperatura getMinimo() {
        return minimo;
    }

    private void setMinimo() {
        if (cont == 0) {
            minimo.setValor(temperatura.getValor());
        } else if (temperatura.getValor() < minimo.getValor()) {
            minimo.setValor(temperatura.getValor());
        }
    }

    private void setMaximo() {
        if (temperatura.getValor() > maximo.getValor()) {
            maximo.setValor(temperatura.getValor());
        }
    }

    private void setPromedio() {
        cont++;
        suma = suma + temperatura.getValor();
        promedio.setValor(suma / cont);
    }

    public Temperatura getMaximo() {
        return maximo;
    }

    public String getEstado() {
        if (estado) {
            return "Encendido";
        } else {
            return "Apagado";
        }
    }

    public void setMarca(String marca) {
        this.marca = (marca.equals("")) ? "Samsung" : marca;
    }

    public void setColor(String color) {
        this.color = (color.equals("")) ? "Blanco" : color;
    }

    public void setTemperatura(double valor, char unidad) {
        if (unidad == temperatura.getUnidad()) {
            temperatura.setValor(valor);
            temperatura.setUnidad(unidad);
            setMinimo();
            setMaximo();
            setPromedio();
        } else {
            cambiarTemperatura(unidad);
            temperatura.setValor(valor);
            temperatura.setUnidad(unidad);
            setMinimo();
            setMaximo();
            setPromedio();
        }
    }

    public void setTemperatura(Temperatura temperatura) {
        if (temperatura.getUnidad() == this.temperatura.getUnidad()) {
            this.temperatura = temperatura;
            setMinimo();
            setMaximo();
            setPromedio();
        } else {
            cambiarTemperatura(temperatura.getUnidad());
            this.temperatura = temperatura;
            setMinimo();
            setMaximo();
            setPromedio();
        }
    }

    public void encenderApagar() {
        if (estado) {
            System.out.println(getEstado());
            this.estado = false;
        } else {
            System.out.println(getEstado());
            this.estado = true;
        }
    }

    public void medirTemperatura() {
        if (estado) {
            temperatura.setValor(Math.random() * 51);
        } else {
            System.out.println("El termometro esta apagado");
        }
    }

    private void convertirF() {
        if (temperatura.getUnidad() != 'F') {
            if (temperatura.getUnidad() == 'C') {
                temperatura.setValor((temperatura.getValor() * 1.8) + 32);
                temperatura.setUnidad('F');
                promedio.setValor((promedio.getValor() * 1.8) + 32);
                promedio.setUnidad('F');
                minimo.setValor((minimo.getValor() * 1.8) + 32);
                minimo.setUnidad('F');
                maximo.setValor((maximo.getValor() * 1.8) + 32);
                maximo.setUnidad('F');
            } else {
                convertirC();
                convertirF();
            }
        }
    }

    private void convertirC() {
        if (temperatura.getUnidad() != 'C') {
            if (temperatura.getUnidad() == 'F') {
                temperatura.setValor((temperatura.getValor() - 32) / 1.8);
                temperatura.setUnidad('C');
                promedio.setValor((promedio.getValor() - 32) / 1.8);
                promedio.setUnidad('C');
                minimo.setValor((minimo.getValor() - 32) / 1.8);
                minimo.setUnidad('C');
                maximo.setValor((maximo.getValor() - 32) / 1.8);
                maximo.setUnidad('C');
            } else {
                temperatura.setValor(temperatura.getValor() - 273.15);
                temperatura.setUnidad('C');
                promedio.setValor(promedio.getValor() - 273.15);
                promedio.setUnidad('C');
                minimo.setValor(minimo.getValor() - 273.15);
                minimo.setUnidad('C');
                maximo.setValor(maximo.getValor() - 273.15);
                maximo.setUnidad('C');
            }
        }
    }

    private void convertirK() {
        if (temperatura.getUnidad() != 'K') {
            if (temperatura.getUnidad() == 'C') {
                temperatura.setValor(temperatura.getValor() + 273.15);
                temperatura.setUnidad('K');
                promedio.setValor(promedio.getValor() + 273.15);
                promedio.setUnidad('K');
                minimo.setValor(minimo.getValor() + 273.15);
                minimo.setUnidad('K');
                maximo.setValor(maximo.getValor() + 273.15);
                maximo.setUnidad('K');
            } else {
                convertirC();
                convertirK();
            }
        }
    }

    public void cambiarTemperatura(char unidad) {
        if (estado) {
            if (unidad == 'C') {
                convertirC();
            } else if (unidad == 'F') {
                convertirF();
            } else {
                convertirK();
            }
        } else {
            System.out.println("El termometro esta apagado");
        }

    }

    public String toString() {
        return "Temperatura: " + getTemperatura() + " Mínimo: " + getMinimo() + " Máximo: " + getMaximo()
                + " Promedio: " + getPromedio();
    }
}