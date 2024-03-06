public class Maestro {
	private String nombre;
	private String materia;
	private int edad;
	private int matricula;
	private boolean genero;

	public Maestro() {
		setNombre("Juan");
		setMateria("Matematicas");
		setEdad(25);
		setGenero(true);
	}
	public String getNombre(){
		return nombre;
	}
	public void setNombre(String nombre){
		this.nombre = nombre;
	}
	public String getMateria(){
		return materia;
	}
	public void setMateria(String materia){
		this.materia = materia;
	}
	public boolean getGenero(){
		return genero;
	}
	public void setGenero(boolean genero){
		this.genero = genero;
	}
	public int getEdad(){
		return edad;
	}
	public void setEdad(int edad){
		this.edad = edad;
	}
	
	public void presentarse(){
		System.out.print("Buenos dias jovenes mi nombre es "+ getNombre()+", tengo "+getEdad()+" años de edad y sere su maestro de "+ getMateria());
	}
	
}