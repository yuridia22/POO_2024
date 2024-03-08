public class BlocDeNota{
    public Nota nota;

    public BlocDeNota(Nota nota){
        nota = new Nota("08 de marzo de 2024", "aviso", "entregar la practica 04", "09 de marzo de 2024", "Armando", "azul");
    }
    public boolean addNota(Nota n){
        return true;
    }
    public boolean saveNotas(){
        return false;
    }
    public boolean updateNota(Nota n){
        return true;
    }
    public boolean updateNota(String txt, String c){
        return false;
    }
    public boolean deleteNote(){
        return true;
    }
}