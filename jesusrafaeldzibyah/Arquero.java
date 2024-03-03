public class Arquero {
    private String raza;
    private String nombre;
    private int vida;
    private int almacen;

    public Arquero(String raza, String nombre,int vida, int almacen ){
        setNombre(nombre);
        setRaza(raza);
        setAlamacen(6);
        setVida(10);
    }

    public void setNombre(String nombre) {
        this.nombre = nombre.equals("")?"User_1":nombre;
    }

    public void setRaza(String raza) {
        this.raza = raza.equals("")?"Elfo":raza;
    }

    public void setAlamacen(int almacen) {
        this.almacen = (almacen <0 || almacen >6)?6:almacen;
    }

    public void setVida(int vida) {
        this.vida = (vida <= 0 || vida >10)? 35:vida;
    }
    public String getNombre() {
        return nombre;
    }

    public String getRaza() {
        return raza;
    }

    public int getAlmacen() {
        return almacen;
    }

    public int getVida() {
        return vida;
    }

        public String disparar(Arco ar, Flecha f){
            String d;
            if (this.almacen==0){
                d="no hay flechas";
            }
            else{
                d=ar.disparar(f);
                this.almacen--;
            }
            return d;
        }

        public String recargar(Flecha f){
            String r;
            if(this.almacen==6){
                r="no hay mas espacio";
            }
            else{
                this.almacen++;
                r="recargo una flecha";
            }
            return r;
        }
  
}
