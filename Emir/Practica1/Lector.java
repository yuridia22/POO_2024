package Practica1;

public class Lector {
	private String nombre;
	private int id;

	public Lector(String nombre, int id){
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
		System.out.println("Lector:\nNombre: " + nombre + "\nId: " + id);
	}

	public void solicitar(){
		System.out.println("Necesito este libro");
	}

	public void regresar(){
		System.out.println("Vengo a regresar este libro");
	}
}