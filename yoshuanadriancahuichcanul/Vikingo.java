public class Vikingo {
    private boolean sexo;
    private String nombre;
    private int altura;
    private int años;

    public Vikingo(boolean sexo, String nombre,int altura, int años ){
        setNombre(nombre);
        //sexo = genero
        setSexo(sexo);
        setAltura(altura);
        //años = edad
        setAños(años);
    }

    public void setNombre(String nombre) {
        this.nombre = nombre.equals(" ")?"Ragnar":nombre;
    }

    public void setSexo(boolean sexo) {
       //true = hombre  y false = mujer
        this.sexo = sexo;
    }

    public void setAltura(int altura) {
        this.altura = (altura <0 || altura >200)?189:altura;
    }

    public void setAños(int años) {
        this.años = (años < 0 || años >100)? 35:años;
    }
    public String getNombre() {
        return nombre;
    }

    public boolean getSexo() {
        return sexo;
    }

    public int getAltura() {
        return altura;
    }

    public int getAños() {
        return años;
    }
    public boolean mostrarSe(){
        return sexo;
     
    }
    public String mostrarNombre(){
        return nombre;
          
    }
    public int mostrarAlt(){
        return altura;
    }
    public int mostrarAño(){
        return años;
    }
     
    String acciones;
    public void setAcciones(String aciones){
        switch (aciones) {
            case "comer":this.acciones=("comer"); 
                
                break;
            case "atacar":this.acciones=("atacar");
             break;

            case "caminar":this.acciones=("caminando");
              break;
            case" corre": this.acciones=("corre");

             break;
            
            case "defender":this.acciones=("defenderse");

        
            default:this.acciones=("muerto");
                 break;
         }         
        }
        public String getAcciones(){
            return acciones;
        }
        public String mostrarAccion(){
            return acciones;
        }

     
}
