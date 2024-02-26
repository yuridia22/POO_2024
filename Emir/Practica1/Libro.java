package Practica1;

public class Libro {
    private String titulo;
    private String autor;
    private int codigo;
    public int estado;
    
    public Libro(String titulo, String autor, int codigo){
        setTitulo(titulo);
        setAutor(autor);
        setCod(codigo);
        setEst(0);
    }

    public String getTitulo(){
        return titulo;
    }

    public void setTitulo(String t){
        this.titulo = t;
    }

    public String getAutor(){
        return autor;
    }

    public void setAutor(String a){
        this.autor = a;
    }

    public int getCod(){
        return codigo;
    }

    public void setCod(int c){
        this.codigo = c;
    }

    public int getEst(){
        return estado;
    }

    public void setEst(int e){
        this.estado = e;
    }

    public void datos(){
		System.out.println("Libro:\nTítulo: " + titulo + "\nAutor: " + autor + "\nCodigo: " + codigo);
	}
}
