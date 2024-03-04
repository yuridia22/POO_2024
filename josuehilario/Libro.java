public class Libro {
    private String titulo;
    private String autor;
    private String genero;
    private int paginasLeidas;

    public Libro(String titulo, String autor, String genero) {
        this.titulo = titulo;
        this.autor = autor;
        this.genero = genero;
        this.paginasLeidas = 0;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public void leerPaginas(int cantidad) {
        this.paginasLeidas += cantidad;
        if(paginasLeidas == totalPaginas){
            System.out.println("Felicidades, has terminado de leer el libro: " + this.titulo);
        }
    }

    public void setTotalPaginas(int totalPaginas) {
        this.totalPaginas = totalPaginas;
    }

    public int getPaginasLeidas() {
        return this.paginasLeidas;
    }

    private int totalPaginas;
}