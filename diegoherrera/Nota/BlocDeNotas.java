import java.util.Vector;
public class BlogDeNotas{
    
    private Vector<Nota> notas;
    private Color color;

    public BlogDeNotasN(Color c){
        notas = new Vector<Nota>
        this.color = c;
    }
    public BlogDeNotasN(){
        notas = new Vector<Nota>
        this.color = c;
    }
    public void addNota(Nota N){
        this.nota.add(notas);
    }
    public getNota(){
        return this.notas.get(n);
    }
    public deleteNota(int n){
        if (!notas.isEmpty() && notas.size()<n){
            notas.set(n,nota);
            return true        
        }
        return false;
    }
    public boolean UpdateNota(int n,Color color, String fecha, String importancia, String mensaje, String autor, string fecha caducidad){
        if(existNota(n)){
            getNota(n).setColor(color.getColor());
            getNota(n).setFecha(Fecha);
            if(!importancia.equals())
            getNota(n).setIMportancia(Importancia);
            if(!Mensaje.equals())
            getNota(n).setMensaje(Mensaje);
            getNota(n).setAutor(Autor);
            getNota(n).setFechaCaducidad(FechaCaducidad);

        }


    }
    public void SaveNota(){

    }



}