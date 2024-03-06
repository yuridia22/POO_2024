import java.util.Vector;

public class BlockNota {
    private Vector<Nota> notas;
    private int nnotas;

    public BlockNota(){
        nnotas = 0;
        notas = new Vector<Nota>();
        
    }
    public boolean addNota(Nota nota){
        notas.add(nota);
        nnotas++;
        return true;
    }
    public Nota getNota(int num){
        if(!notas.isEmpty()&& nnotas>num);
            return notas.get(num);     
    }
    public boolean deleteNota(int num){
        if (!notas.isEmpty()&& nnotas > num){
            notas.remove(num);
            nnotas --;
            return true;
        }
        return false;
    }
public boolean updateNota(int num, Nota n){
    if (!notas.isEmpty()&&nnotas>num){
        notas.set(num, n);
        return true;
    }
    return false;
}

public boolean updateNota(int num, String fecha, String autor, String tipoNota, String fechalimite, String texto){
    if (!notas.isEmpty()&& nnotas>num){
        if (!texto.equals("")) {
            notas.get(num).setTexto(texto);
        }
        
    
        }

    }

}

