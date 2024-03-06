public class Botella {
	private String color;
	private String material;
	private int estado;
	private int capacidad;

	public Botella(){
		setColor("Azul");
		setMaterial("Plastico");
		setEstado(1);
		capacidad=1;
	}
	public String getColor(){
		return color;
	}
	public void setColor(String color){
		this.color=color;
	}
	public String getMaterial(){
		return material;
	}
	public void setMaterial(String material){
		this.material= material;
	}
	public int getEstado(){
		return estado;
	}
	public void setEstado(int estado){
		this.estado= estado;
	}

	public int getCapacidad(){
		return capacidad;
	}
	public void setCapacidad(int capacidad){
		this.capacidad= capacidad;
	}
	public void mostrarDatos(){
		System.out.println("Datos de la botella:");
		System.out.println("");
		System.out.println("Color: "+getColor());
		System.out.println("Material: "+getMaterial());
		System.out.println("Estado: "+getEstado());
		System.out.println("Capacidad en Litros: "+getCapacidad());

		
	}

}