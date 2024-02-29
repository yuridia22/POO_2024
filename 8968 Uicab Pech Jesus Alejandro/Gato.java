public class Gato{
	private String nombre;
	private String raza;
	private String color;
	private boolean genero;
	private int edad;
	private int estado;


	public Gato (String nombre,String raza, boolean genero){
		setNombre(nombre);
		setRaza(raza);
		setColor("Negro");
		setGenero(genero);
		setEdad(3);
		setEstado(1);
	}

	public void setNombre(String nombre){
		this.nombre = (nombre.equals(" "))?"Oscuro":nombre;
	}

	public void setRaza(String raza){
		this.raza = (raza.equals(" "))?"Común europeo":nombre;
	}

	public void setColor(String color){
		this.color = (color.equals(" "))?"Negro":color;
	}

	public void setGenero(boolean genero){
		this.genero = (genero)?true:genero;
	}

	public void setEdad(int edad){
		this.edad = (edad <= 0 || edad >= 19)?2:edad;
	}

	public void setEstado(int estado) {
		this.estado = (estado <= 0 || estado >= 6)?5:estado;
		
	}

	public String getNombre(){
		return nombre;
	}

	public String getRaza(){
		return raza;
	}

	public String getColor(){
		return color;
	}	

	public boolean getGenero(){
		return genero;
	}

	public int getEdad(){
		return edad;
	}

	public int getEstado(){
		return estado;
	}

	//1=vivo	2=muerto	3=comiendo		4=durmiendo		5=sentado
	public void dormir(){
		if (estado == 4 ) {
			System.out.println("El gato ya se encontraba durmiendo");
		}
		else if (estado == 5 || estado ==1) {
			System.out.println("El gato se duerme");			
		}
		else if (estado == 3) {
			System.out.println("No se puede realizar esta acción por el momento, espera que termine de alimentarse");	
		}
		else if (estado ==2) {
			System.out.println("El gato no puede realizar esta acción ya que está muerto");
		}
	}

	public void despertar(){
		if (estado == 5) {
			System.out.println("El gato ya se encontraba despierto");
		}
		else if (estado == 1 ||estado ==5) {
			System.out.println("El gato se despierta");
		}
		else if (estado==1 || estado ==3) {
			System.out.println("El gato estaba comiendo por lo tanto ya se encontraba despierto");
		}
		else if (estado ==2) {
			System.out.println("El gato no puede realizar esta acción ya que está muerto");
		}
	}

	public void comer(String comida){
		if (estado == 3) {
			System.out.println("El gato ya se encontraba comiendo");
		}
		else if (estado == 1 ||estado ==5) {
			System.out.println("El gato come" + comida);
		}
		else if (estado==1 || estado ==3) {
			System.out.println("El gato no puede comer ahora mismo, está durmiendo");
		}
		else if (estado ==2) {
			System.out.println("El gato no puede realizar esta acción ya que está muerto");
		}
	}

	public void cazar(String objeto){
		if (estado == 5 || estado == 1) {
			System.out.println("El gato se va a casar" + objeto);
		}
		else if (estado == 3) {
			System.out.println("El gato no puede ir a cazar por que está comiendo");
		}
		else if (estado==1 || estado ==3) {
			System.out.println("El gato no puede cazar ahora mismo, está durmiendo");
		}
		else if (estado ==2) {
			System.out.println("El gato no puede realizar esta acción ya que está muerto");
		}
	}

	public void correr(){
		if (estado == 5 || estado ==1) {
			System.out.println("El gato se va corriendo");
		}
		else if (estado == 3) {
			System.out.println("El gato se encuentra comiendo, no puede realizar la acción");
		}
		else if (estado==4) {
			System.out.println("El gato no puede correr ahora mismo, está durmiendo");
		}
		else if (estado ==2) {
			System.out.println("El gato no puede realizar esta acción ya que está muerto");
		}
	}

	public void caminar(){
		if (estado == 5 || estado ==1) {
			System.out.println("El gato se va caminando");
		}
		else if (estado == 3) {
				System.out.println("El gato se encuentra comiendo, no puede realizar la acción");
		}
		else if (estado==4) {
			System.out.println("El gato no puede caminar ahora mismo, está durmiendo");
		}
		else if (estado ==2) {
			System.out.println("El gato no puede realizar esta acción ya que está muerto");
		}
	}

	public void pelear(){
		if (estado == 5 || estado ==1) {
			System.out.println("El gato se va a pelear");
		}
		else if (estado == 3) {
			System.out.println("El gato se encuentra comiendo, no puede realizar la acción");
		}
		else if (estado ==4) {
			System.out.println("El gato no puede pelear ahora mismo, está durmiendo");
		}
		else if (estado ==2) {
			System.out.println("El gato no puede realizar esta acción ya que está muerto");
		}
	}
	
	public void sentar(){
		if (estado == 5) {
			System.out.println("El gato ya se encontraba sentado");
		}
		else if (estado == 1 ||estado ==3) {
			System.out.println("El gato se sienta");
		}
		else if (estado ==4) {
			System.out.println("El gato no puede sentarse ahora mismo, está durmiendo");
		}
		else if (estado ==2) {
			System.out.println("El gato no puede realizar esta acción ya que está muerto");
		}
	}

	public void maullar(){
		if (estado == 5 || estado==1) {
			System.out.println("Miau, miau, miau");
		}
		else if (estado == 3) {
			System.out.println("El gato está comiendo ahora mismo, no puede maullar");
		}
		else if (estado==4) {
			System.out.println("El gato no puede maullar ahora mismo, está durmiendo");
		}
		else if (estado ==2) {
			System.out.println("El gato no puede realizar esta acción ya que está muerto");
		}
	}

	public String mostrarNombre(){
		return getNombre();
	}

	public String mostrarRaza(){
		return getRaza();
	}

	public String mostrarColor(){
		return getColor();
	}

	public int mostrarEstado(){
		return getEstado();
	}

	public int mostrarEdad(){
		return getEdad();
	}

	public boolean mostrarGenero(){
		return getGenero();
	}
			
	
}