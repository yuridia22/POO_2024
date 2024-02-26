package Practica1;

public class Bibliotecario {
    private String nombre;
	private int id;

	public Bibliotecario(String nombre, int id){
		setNombre(nombre);
		setId(id);
	}

	public String getNombre(){
		return nombre;
	}

	public void setNombre(String n){
		this.nombre = n;
	}

	public int getId(){
		return id;
	}

	public void setId(int i){
		this.id = i;
	}

	public void datos(){
		System.out.println("Bibliotecario:\nNombre: " + nombre + "\nId: " + id);
	}

    public void validarSolicitud(){
        System.out.println("Cumple con las condiciones para prestar un libro");
    }

    public void negarSolicitud(){
        System.out.println("Usted no cuenta con los requisitos de entrega");
    }

    public void validarEntrega(){
        System.out.println("El libro ha sido devuelto en condiciones ideales");
    }

    public void negarEntrega(){
        System.out.println("El libro está dañado, no puede ser regresado");
    }
}
