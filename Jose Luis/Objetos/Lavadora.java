public class Lavadora {
	private String marca;
	private String color;
	private String modelo;
	private int precio;
	private int capacidadMax;
	private int estado;

	public Lavadora(){
	setMarca("Mabe");
	modelo="DIMCHNK";
	setPrecio(5550);
	setEstado(1);
	capacidadMax=45;
	}
	public String getMarca(){
	return marca;
	}
	public void setMarca(String marca){
		this.marca= marca;
	}
	public String getModelo(){
	return modelo;
	}
	public void setModelo(){
		this.modelo=modelo;
	}
	public String getColor(){
	return color;
	}
	public void setColor(String color){
		this.color=color;
	}
	public int getEstado(){
	return estado;
	}
	public void setEstado(int estado){
		this.estado=estado;
	}
	public int getPrecio(){
	return precio;
	}
	public void setPrecio(int precio){
		this.precio=precio;
	}
	public int getCapacidadMax(){
	return capacidadMax;
	}
	public void setCapacidadMax(int capacidadMax){
		this.capacidadMax=capacidadMax;
	}
	public void desaguar(){
		System.out.println("Se desagua");
	}
	public void girar(){
		System.out.println("Empieza a girar");
	}
	public void parar(){
		System.out.println("Se detiene");
	}
}