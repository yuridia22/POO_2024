public class Curso {
	private String nombre;
	private boolean turno;
	private String clave;
	private int aula;
	private int estado;
	private int horas;


	public Curso() {
		setClave("XCVBNM");
		setNombre("Matematicas");
		setAula(5);
		setEstado(1);
		setHoras(2);
		setTurno(true);

	}
	public String getClave(){
		return clave;		
	}
	public void setClave(String clave){
		this.clave= clave;
	}
	public String getNombre(){
		return nombre;
	}
	public void setNombre(String nombre){
		this.nombre= nombre;
	}
	
	public boolean getTurno(){
		return turno;
	}
	public void setTurno(boolean turno){
		this.turno= turno;
	}
	public int getAula(){
	return aula;	
	}
	public void setAula(int aula){
		this.aula= aula;
	}
	public int getHoras(){
		return horas;
	}
	public void setHoras(int horas){
		this.horas= horas;
	}
	public int getEstado(){
		return estado;
	}
	public void setEstado(int estado){
		this.estado = estado;
	}
	public void mostrarDatos(){
		System.out.println("Materia: "+getNombre());
		System.out.println("Aula: "+ getAula());
		System.out.println("Clave del curso: "+ getClave());
		System.out.println("Cantidad de horas: "+ getHoras());
		System.out.println("");
	}
}