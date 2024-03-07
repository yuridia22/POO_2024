public class Perro{
	private String nombre;
	private int edad;
	private double peso;
	private String raza;
	private String estado;

	public Perro(String nombre){
		this.nombre=nombre;
	}
	public String getNombre(){
		return nombre;
	}
	public void setNombre(String nombre){
		this.nombre=nombre.equals("")? "Solovino": nombre;
	}
	public int getEdad(){
		return edad;
	}
	public void setEdad(int edad){
		this.edad=edad;
	}
	public double getPeso(){
		return peso;
	}
	public void setPeso(double peso){
		this.peso=peso;
	}
	public String getRaza(){
		return raza;
	}
	public void setRaza(String raza){
		this.raza=raza;
	}
	public String getEstado(){
		return estado;
	}
	public void setEstado(String estado){
		this.estado=estado;
	}
	public void ladrar(){
		if(!getEstado().equals("muerto")){
			System.out.println("Gua, Gua, Gua, Gua, Gua");
		}
		else{
			System.out.println("Estoy muerto");
		}
	}
	public void comer(String comida){
		if(!getEstado().equals("muerto")){
			System.out.println("Estoy comiendo " + comida);
		}
		else{
			System.out.println("Estoy muerto");
		}
	}
	public void jugar(String pelota){
		if(!getEstado().equals("muerto")){
			System.out.println("Estoy jugando con la " + pelota);
		}
		else{
			System.out.println("Estoy muerto");
		}
	}
	public void moverCola(){
		if(!getEstado().equals("muerto")){
			System.out.println("Estoy moviendo la cola");
		}
		else{
			System.out.println("Estoy muerto");
		}
	}
}
