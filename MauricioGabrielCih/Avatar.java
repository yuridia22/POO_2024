public class Avatar{
	private int arma;
	private String nombre;
	private int vida;
	private String color;
	private int velocidad;
	private int ataque;

	public Avatar(int arma , String nombre, int vida , String color , int velocidad){
		this.setArma(arma);
		this.setNombre(nombre);
		this.setVida(vida);
		this.setColor(color);
		this.setVelocidad(velocidad);
		this.setAtaque(ataque);
	}
	public void setArma(int arma){
		this.arma = arma;
	}
	public void setNombre(String nombre){
		this.nombre = nombre;
	}
	public void setVida(int vida){
		this.vida = vida;
	}
	public void setColor(String color){
		this.color = color;
	}
	public void setVelocidad(int velocidad){
		this.velocidad = velocidad;
	}
	public void setAtaque(int ataque){
		this.ataque = ataque;
	}
	public int getArma(){
		return arma;
	}
	public String getNombre(){
		return nombre;
	}
	public int getVida(){
		return vida;
	}
	public String getColor(){
		return color;
	}
	public int getVelocidad(){
		return velocidad;
	}
	public int getAtaque(){
		return ataque;
	}
	public void atacar(){
		System.out.println("el "+ nombre +   " es de color "+ color  + " tiene HP de " + vida + " y las armas que porta son " + arma);
	}
}