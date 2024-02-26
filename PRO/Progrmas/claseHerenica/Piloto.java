package DanaChin.Progrmas.claseHerenica;

public class Piloto {
    // Atributos
    private String nombreDelPiloto;
    private String pais;
    private String altura;
    private int edad;
    private String sexo;
    private String estado;

    // Constructor
    public Piloto(String nombreDelPiloto, String pais, String altura, int edad, String sexo, String estado) {
        this.nombreDelPiloto = nombreDelPiloto;
        this.pais = pais;
        this.altura = altura;
        this.edad = edad;
        this.sexo = sexo;
        this.estado = estado;
    }

    // Métodos Get y Set con switch
    public String getNombreDelPiloto() {
        switch (nombreDelPiloto.toLowerCase()) {
            case "rey ayanami":
                return "Rey Ayanami";
            case "shinji":
                return "Shinji";
            case "asuka":
                return "Asuka";
            default:
                return "Desconocido";
        }
    }

    public void setNombreDelPiloto(String nombreDelPiloto) {
        this.nombreDelPiloto = nombreDelPiloto;
    }

    public String getPais() {
        switch (pais.toLowerCase()) {
            case "japon":
                return "Japón";
            case "alemania":
                return "Alemania";
            default:
                return "Desconocido";
        }
    }

    public void setPais(String pais) {
        this.pais = pais;
    }

    public String getAltura() {
        switch (altura.toLowerCase()) {
            case "154 cm":
                return "154 cm";
            case "155cm":
                return "155 cm";
            case "157cm":
                return "157 cm";
            default:
                return "Desconocido";
        }
    }

    public void setAltura(String altura) {
        this.altura = altura;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getSexo() {
        switch (sexo.toLowerCase()) {
            case "mujer":
                return "Mujer";
            case "hombre":
                return "Hombre";
            default:
                return "Desconocido";
        }
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public String getEstado() {
        switch (estado.toLowerCase()) {
            case "combatiendo dentro del eva":
                return "Combatiendo dentro del EVA";
            case "gano":
                return "Ganó";
            case "perdio alguna extremidad":
                return "Perdió alguna extremidad";
            case "murio":
                return "Murió";
            default:
                return "Desconocido";
        }
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    // Método para mostrar información del piloto y su EVA
    public void mostrarInformacionEva(Eva eva) {
        System.out.println("Nombre del Piloto: " + getNombreDelPiloto());
        System.out.println("País: " + getPais());
        System.out.println("Altura: " + getAltura());
        System.out.println("Edad: " + getEdad());
        System.out.println("Sexo: " + getSexo());
        System.out.println("Estado: " + getEstado());

        System.out.println("Información del EVA:");
        System.out.println("País del EVA: " + eva.getPaisDelEva());
        System.out.println("Modelo: " + eva.getModelo());
        System.out.println("Color: " + eva.getColor());
        System.out.println("Altura: " + eva.getAltura() + " metros");
        System.out.println("Estado: " + eva.getEstado());
    }

    public static void main(String[] args) {
        // Crear instancia de Piloto y EVA
        Piloto piloto = new Piloto("Rey Ayanami", "Japón", "154 cm", 14, "Mujer", "Combatiendo dentro del EVA");
        Eva eva = new Eva("japon", "Eva 00", "azuel con blanco", 200, 4);

        // Mostrar información del piloto y su EVA
        piloto.mostrarInformacionEva(eva);
    }
}
