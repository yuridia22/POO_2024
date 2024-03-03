public class Gato {
    private String nombre;
    private String raza;
    private String color;
    private int edad;// medidido en meses
    private int estado;// 0 muerto, 1 maullar, 2 atacar, 3 dormir, 4 despertar

    public Gato(String nombre, String raza, String color, int edad, int estado){
        setNombre(nombre);
        setRaza(raza);
        setColor(color);
        setEdad(edad);
        setEstado(estado);

    }
    
    public void setNombre(String nombre){
        this.nombre=nombre.equals("")?"maluma":nombre;
    }
    public String getNombre(){
        return nombre;
    }
    public void setRaza(String raza){
        this.raza=raza.equals("")?"britanico":raza;
    }
    public String getRaza(){
        return raza;
    }
    public void setColor(String color){
        this.color=color.equals("")?"Naranja":color;
    }
    public String getColor(){
        return color;
    }
    public void setEdad(int edad){
        this.edad=(this.edad<=0||this.edad>20)?3:edad;
    }
    public int getEdad(){
        return edad;
    }
    public void setEstado(int estado){
        switch (estado) {
            case 1:this.estado=1;break;
            case 2:this.estado=2;break;
            case 3:this.estado=3;break;
            case 4:this.estado=4;break;
            default:this.estado=0;break;
        }
    }
    public int getEstado(){
        return estado;
    }

    public String maullar(){
        String m=(this.estado==1)?"miau miau miau":"el gato no puede maullar";
        return m;
    }
    public String atacar(){
        String a=(this.estado==2)?getNombre()+" uso scratch":"el gato no puede atacar";
        return a;
    }
    public String despertar(){
        String d;
        switch (this.estado) {
            case 3:d="el gato se desperto";break;
            case 0:d="el gato ¡ESTA MUERTO! no se puede despertar";break;
            default:d="el gato ya esta despierto";break;
        }
        return d;
    }
    public String dormir(){
        String dr;
        switch (this.estado) {
            case 3:dr="el gato ya esta dormido";break;
            case 4:dr="el gato se durmio";break;
            case 0:dr="el gato no esta dormido ¡ESTA MUERTO!";break;
            default:dr="el gato no puede dormir";break;
        }
        return dr;
    }
}
