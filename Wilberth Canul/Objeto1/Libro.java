package Objeto1;

public class Libro {
    private String titulo;
    private String autor;
    private int añoPublicacion;
    private String idioma;
    private boolean disponibilidad;

    public Libro(String titulo, String autor, int añoPublicacion, String idioma, boolean disponibilidad){
        this.titulo = titulo;
        setAutor(autor);
        setAñoPublicacion(añoPublicacion);
        setIdioma(idioma);
        setDisponibilidad(true);

    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        // Verifica que el título no sea nulo ni esté vacío
        if (titulo != null && !titulo.isEmpty()) {
            this.titulo = titulo;
        } else {
            System.out.println("Error: El título no puede ser nulo ni vacío.");
        }
    }

    // Getter y Setter para 'autor'
    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        if (autor != null && !autor.isEmpty()) {
            this.autor = autor;
        } else {
            System.out.println("Error: El autor no puede ser nulo ni vacío.");
        }
    }

    public int getAñoPublicacion() {
        return añoPublicacion;
    }

    public void setAñoPublicacion(int añoPublicacion) {
        if (añoPublicacion > 0) {
            this.añoPublicacion = añoPublicacion;
        } else {
            System.out.println("Error: El año de publicación debe ser mayor que 0.");
        }
    }

    public String getIdioma() {
        return idioma;
    }

    public void setIdioma(String idioma) {
        if (idioma != null && !idioma.isEmpty()) {
            this.idioma = idioma;
        } else {
            System.out.println("Error: El idioma no puede ser nulo ni vacío.");
        }
    }

    public boolean getDisponibilidad() {
        return disponibilidad;
    }

    public void setDisponibilidad(boolean disponibilidad) {
        this.disponibilidad = disponibilidad;
    }

    // metodos
    public void prestarLibro() {
        if (disponibilidad) {
            disponibilidad = false;
            System.out.println("El libro '" + titulo + "' ha sido prestado.");
        } else {
            System.out.println("El libro '" + titulo + "' no está disponible para préstamo.");
        }
    }

    public void devolverLibro() {
        if (!disponibilidad) {
            disponibilidad = true;
            System.out.println("El libro '" + titulo + "' ha sido devuelto.");
        } else {
            System.out.println("El libro '" + titulo + "' ya está disponible.");
        }
    }

    public void mostrarInformacion() {
        System.out.println("Título: " + titulo);
        System.out.println("Autor: " + autor);
        System.out.println("Año de Publicación: " + añoPublicacion);
        System.out.println("Idioma: " + idioma);
        System.out.println("Disponibilidad: " + (disponibilidad ? "Disponible" : "No disponible"));
    }


    
}
