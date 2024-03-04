public class Libro {
    public class Lapicero {
        private String titulo;
        private String formato;
        private int numPgs;
        private boolean estado;
    
        public Lapicero(String titulo, String formato, int numPgs, boolean estado) {
            setTitulo(titulo);
            setFormato(formato);
            setNumPgs(numPgs);
            setEstado(estado);
        }
    
        public void setTitulo(String titulo) {
            this.titulo = titulo;
        }
        public String getTitulo() {
            return titulo;
        }
    
        public void setFormato(String formato) {
            this.formato = formato;
        }
        public String getFormato() {
            return formato;
        }
    
        public void setNumPgs(int numPgs) {
            this.numPgs = numPgs;
        }
        public int getNumPgs() {
            return numPgs;
        }

        public void setEstado(boolean estado) {
            this.estado = estado;
        }
        public boolean getEstado() {
            return estado;
        }
    
        public String abrir(boolean estado) {
            if(!estado) {
                return "libro abierto";
            } else {
                return "el libro ya esta abierto";
            }
        }

        public String cerrar(boolean estado) {
            if(!estado) {
                return "libro cerrado";
            } else {
                return "el libro ya esta cerrado";
            }
        }
    }
    
}
