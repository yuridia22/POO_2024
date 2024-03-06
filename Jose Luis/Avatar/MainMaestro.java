public class MainMaestro {

	public static void main(String arg[]){
	Maestro r = new Maestro();
	Curso c = new Curso();
	r.presentarse();
	System.out.println("");
	System.out.println();
	System.out.println("Datos Generales del curso:");
	c.mostrarDatos();
	}
	

}