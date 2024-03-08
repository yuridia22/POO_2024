import java.util.List;

public class Avatar {
    private String nombre;
    private int nivel;
    private double salud;
    private double energia;
    private List<String> habilidadesEspeciales;
    private List<String> equipo;
    private int experiencia;
    private String apariencia;
    private List<String> armas;

    
    public Avatar(String nombre, int nivel, double salud, double energia, List<String> habilidadesEspeciales, List<String> equipo, int experiencia, String apariencia, List<String> armas) {
        this.nombre = nombre;
        this.nivel = nivel;
        this.salud = salud;
        this.energia = energia;
        this.habilidadesEspeciales = habilidadesEspeciales;
        this.equipo = equipo;
        this.experiencia = experiencia;
        this.apariencia = apariencia;
        this.armas = armas;
    }

    
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getNivel() {
        return nivel;
    }

    public void setNivel(int nivel) {
        this.nivel = nivel;
    }

    public double getSalud() {
        return salud;
    }

    public void setSalud(double salud) {
        this.salud = salud;
    }

    public double getEnergia() {
        return energia;
    }

    public void setEnergia(double energia) {
        this.energia = energia;
    }

    public List<String> getHabilidadesEspeciales() {
        return habilidadesEspeciales;
    }

    public void setHabilidadesEspeciales(List<String> habilidadesEspeciales) {
        this.habilidadesEspeciales = habilidadesEspeciales;
    }

    public List<String> getEquipo() {
        return equipo;
    }

    public void setEquipo(List<String> equipo) {
        this.equipo = equipo;
    }

    public int getExperiencia() {
        return experiencia;
    }

    public void setExperiencia(int experiencia) {
        this.experiencia = experiencia;
    }

    public String getApariencia() {
        return apariencia;
    }

    public void setApariencia(String apariencia) {
        this.apariencia = apariencia;
    }

    public List<String> getArmas() {
        return armas;
    }

    public void setArmas(List<String> armas) {
        this.armas = armas;
    }

    
    public void atacar() {
        System.out.println("El avatar femenino está atacando.");
    }

    public void defender() {
        System.out.println("El avatar femenino está defendiendo.");
    }

    public void usarHabilidadEspecial(String habilidad) {
        System.out.println("El avatar femenino está usando la habilidad especial: " + habilidad);
    }

    public void equiparObjeto(String objeto) {
        System.out.println("El avatar femenino está equipando el objeto: " + objeto);
    }

    public void ganarExperiencia(int puntos) {
        this.experiencia += puntos;
        System.out.println("El avatar femenino ha ganado " + puntos + " puntos de experiencia.");
    }

    public void cambiarApariencia(String nuevaApariencia) {
        this.apariencia = nuevaApariencia;
        System.out.println("El avatar femenino ha cambiado su apariencia a: " + nuevaApariencia);
    }

    public void añadirArma(String arma) {
        this.armas.add(arma);
        System.out.println("El avatar femenino ha añadido la arma: " + arma);
    }
}
