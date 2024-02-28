public class Estudiante {
    // Atributos
     private String nombre;
     private String apellido;
     private String fechanacimiento;
     private String genero;
     private String numerotelefono;
     private String correoelectronico;
     private String facultad;
     private String carrera;
     private int matricula;
     private int edad;
     private double altura;
     private String estadocivil;
     private String situacionacademica;

     //constructor//
    public Estudiante(String nombre){
        this.nombre=nombre.equals(nombre)?"Manuel":nombre;
        this.apellido = "Pech";
        this.fechanacimiento = "08/03/04";
        this.genero = "Masculino";
        this.numerotelefono = "9961046691";
        this.correoelectronico = "8991@itescam.edu.mx";
        this.facultad = "Itescam";
        this.carrera = "Ingeniería En Sistemas";
        this.matricula = 8991;
        this.edad = 19;
        this.altura = 1.69;
        this.estadocivil = "Soltero";
        this.situacionacademica = "Aprobado";
    }

        public String getNombre(){
            return nombre;
        }
        public void setNombre(String nombre){
            this.nombre=nombre.equals("")?"Manuel":nombre;
        }
        public String getApellido(){
            return apellido;
        }
        public void setApellido(String apellido) {
            this.apellido=apellido.equals("")?"Pech":apellido;
        }
        public String getFechanacimiento(){
            return fechanacimiento;
        }
        public void setFechanacimiento(String fechanacimiento){
            this.fechanacimiento=fechanacimiento.equals("")?"08/03/04":fechanacimiento;
        }
        public String getGenero(){
            return genero;
        }
        public void setGenero(String genero){
            this.genero=genero.equals("")?"Masculino":genero;
        }
        public String getNumerotelefono(){
            return numerotelefono;
        }
        public void setNumerotelefono(String numerotelefono) {
            this.numerotelefono=numerotelefono.equals(numerotelefono)?"9961046691":numerotelefono;
        }
        public String getCorreoelectronico(){
            return correoelectronico;
        }
        public void setCorreoelectronico(String correoelectronico) {
            this.correoelectronico=correoelectronico.equals("")?"8991@itescam.edu.mx":correoelectronico;
        }
        public String getFacultad(){
            return facultad;
        }
        public void setFacultad(String facultad) {
            this.facultad = facultad.equals("")?"Itescam":facultad;
        }
        public String getCarrera(){
            return carrera;
        }
        public void setCarrera(String carrera) {
            this.carrera = carrera.equals("")?"Ingeniería En Sistemas":carrera;
        }
        public int getMatricula(){
            return matricula;
        }
        public void setMatricula(int matricula) {
            this.matricula = matricula<=0?8991:matricula;
        }
        public int getEdad(){
            return edad;
        }
        public void setEdad(int edad) {
            this.edad = (edad <= 0) ? 19:edad;
        }
        public double getAltura() {
            return altura;
        }
        public void setAltura(double altura) {
            this.altura = (altura<=0) ? 1.69:altura;
        }
        public String getEstadoCivil(){
            return estadocivil;
        }
        public void setEstadoCivil(String estadocivil) {
            this.estadocivil = estadocivil.equals("")?"Soltero":estadocivil;
        }
        public String getSituacionacademica(){
            return situacionacademica;
        }
        public void setSituacionacademica(String situacionacademica) {
            this.situacionacademica = situacionacademica.equals("")?"Aprobado":situacionacademica;
        }

        //metodos//
        public void asistir_clases(){
            System.out.println("Está asistiendo a clases");
        }
        public void estudiar(){
            System.out.println("esta estudiando");
        }
        public void hacer_examen(){
            System.out.println("esta en examen");
        }
        public void comer(){
            System.out.println("esta comiendo");
        }
        public void ir_al_baño(){
            System.out.println("esta yendo al baño");
        }
        public void hacer_tarea(){
            System.out.println("esta haciendo tarea de calculo");
        }
        public void ir_a_su_casa(){
            System.out.println("se va a su casa");
        }
}