public class Alumno{
	private String nombre;
	private int matricula;
	private int edad;
	private int semestre;

	public Alumno(){
		setNombre("jose");
		setMatricula(8960);
		setEdad(19);
		setSemestre(2);
	}
	public String getNombre(){
		return nombre;
	}
	public void setNombre(String nombre){
		this.nombre= nombre;
	}
	public int getMatricula(){
		return matricula;
	}
	public void setMatricula(int matricula){
		this.matricula= matricula;
	}
	public int getSemestre(){
		return semestre;
	}
	public void setSemestre(int semestre){
		this.semestre= semestre;
	}
	public int getEdad(){
		return edad;
	}
	public void setEdad(int edad){
		this.edad= edad;
	}

}