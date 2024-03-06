public class Pokemon {
    private int numero;
    private String nombre;
    private int gen;
    private String[] tipo;
    private double alt;
    private double peso;
    private boolean evo;
    private int etapa;

    public Pokemon(int numero, String nombre, int gen, double alt, double peso, boolean evo, int etapa) {
        setNum(numero);
        setNombre(nombre);
        setGen(gen);
        setAlt(alt);
        setPeso(peso);
        setEvo(evo);
        setEtapa(etapa);
    }

    public int getNum() {
        return numero;
    }

    public void setNum(int numero) {
        this.numero = numero;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getGen() {
        return gen;
    }

    public void setGen(int gen) {
        this.gen = gen;
    }

    public String[] getTipo() {
        return tipo;
    }

    public void setTipo(int i) {
        this.tipo = new String[19];
    }

    public double getAlt() {
        return alt;
    }

    public void setAlt(double alt) {
        this.alt = alt;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public boolean getEvo() {
        return evo;
    }

    public void setEvo(boolean evo) {
        this.evo = evo;
    }

    public int getEtapa() {
        return etapa;
    }

    public void setEtapa(int etapa) {
        this.etapa = etapa;
    }

    public void atacar(String mov){
        System.out.println(nombre + " usa " + mov);
    }

    public void comer(String baya) {
        System.out.println("Que rica baya " + baya);
    }

    public void dormir() {
        System.out.println("Zzzzzzzzz");
    }

    public void acariciar() {
        System.out.println("Que relajante <3");
    }

    public void correr() {
        System.out.println("Esto es muy divertido");
    }

    public void debilitar() {
        System.out.println(nombre + " se ha quedado sin ps :(");
    }

    public void oir(String instruccion) {
        switch (instruccion) {
            case "atacar":
                atacar("rapidez");
            case "comer":
                comer("aranaja");
            case "dormir":
                dormir();
            case "correr":
                correr();
        }
    }

    public static void main(String args[]) {
        String[] tipo = new String[19];
        tipo[0] = "Ninguno";
        tipo[1] = "Acero";
        tipo[2] = "Agua";
        tipo[3] = "Bicho";
        tipo[4] = "Dragón";
        tipo[5] = "Eléctrico";
        tipo[6] = "Fantasma";
        tipo[7] = "Fuego";
        tipo[8] = "Hada";
        tipo[9] = "Hielo";
        tipo[10] = "Lucha";
        tipo[11] = "Normal";
        tipo[12] = "Planta";
        tipo[13] = "Psíquico";
        tipo[14] = "Roca";
        tipo[15] = "Siniestro";
        tipo[16] = "Tierra";
        tipo[17] = "Veneno";
        tipo[18] = "Volador";
        Pokemon miPokemon = new Pokemon(133, "Eevee", 1, 0.3, 6.5, true, 1);
        System.out.println("Número " + miPokemon.getNum());
        System.out.println(miPokemon.getNombre());
        System.out.println("Tipo: " + tipo[11]);
        System.out.println(miPokemon.getGen() + " generación");
        System.out.println(miPokemon.getAlt() + " m");
        System.out.println(miPokemon.getPeso() + " kg");
        System.out.println("Evoluciona: " + miPokemon.getEvo());
        System.out.println("Etapa: " + miPokemon.getEtapa());
        miPokemon.acariciar();
        miPokemon.oir("comer");
    }
}