public class Reloj {
    private int horas;
    private int minutos;
    private int segundos;
    private boolean formato24Horas; // 24-horas formato true, false  12-horas formato
    private boolean alarmaActivada;

    public Reloj(int horas, int minutos, int segundos, boolean formato24Horas) {
        setHoras(horas);
        setMinutos(minutos);
        setSegundos(segundos);
        setFormato24Horas(formato24Horas);
        this.alarmaActivada = false;
    }
    public int getHoras() {
        return horas;
    }

    public void setHoras(int horas) {
        if (formato24Horas) {
            this.horas = (horas >= 0 && horas < 24) ? horas : 0;
        } else {
            this.horas = (horas >= 1 && horas <= 12) ? horas : 1;
        }
    }

    public int getMinutos() {
        return minutos;
    }

    public void setMinutos(int minutos) {
        this.minutos = (minutos >= 0 && minutos < 60) ? minutos : 0;
    }

    public int getSegundos() {
        return segundos;
    }

    public void setSegundos(int segundos) {
        this.segundos = (segundos >= 0 && segundos < 60) ? segundos : 0;
    }

    public boolean isFormato24Horas() {
        return formato24Horas;
    }

    public void setFormato24Horas(boolean formato24Horas) {
        this.formato24Horas = formato24Horas;
    }

    public boolean isAlarmaActivada() {
        return alarmaActivada;
    }
    public void activarAlarma() {
        if (!alarmaActivada) {
            System.out.println("La alarma ha sido activada.");
            alarmaActivada = true;
        } else {
            System.out.println("La alarma ya está activada.");
        }
    }
    public void desactivarAlarma() {
        if (alarmaActivada) {
            System.out.println("La alarma ha sido desactivada.");
            alarmaActivada = false;
        } else {
            System.out.println("La alarma ya está desactivada.");
        }
    }
    public void mostrarHora() {
        System.out.println("Hora actual: " + horas + ":" + minutos + ":" + segundos +
                (formato24Horas ? " (24 horas)" : " (12 horas)"));
    }
}
public class MainReloj {
    public static void main(String[] args) {
        // Crear un reloj en formato de 24 horas
        Reloj reloj24Horas = new Reloj(15, 30, 45, true);

        // Mostrar la hora inicial
        reloj24Horas.mostrarHora();

        // Activar la alarma
        reloj24Horas.activarAlarma();

        // Intentar activar la alarma nuevamente
        reloj24Horas.activarAlarma();

        // Mostrar la hora después de activar la alarma
        reloj24Horas.mostrarHora();

        // Desactivar la alarma
        reloj24Horas.desactivarAlarma();

        // Intentar desactivar la alarma nuevamente
        reloj24Horas.desactivarAlarma();

        // Mostrar la hora final
        reloj24Horas.mostrarHora();

        // Crear un reloj en formato de 12 horas
        Reloj reloj12Horas = new Reloj(8, 45, 0, false);

        // Mostrar la hora inicial en formato de 12 horas
        reloj12Horas.mostrarHora();

        // Cambiar la hora en formato de 12 horas
        reloj12Horas.setHoras(5);
        reloj12Horas.setMinutos(15);
        reloj12Horas.setSegundos(30);

        // Mostrar la hora actualizada en formato de 12 horas
        reloj12Horas.mostrarHora();
    }
}

