import java.util.Random;

public class Termometro{
    private String marca;
    private Color c;
	private Temperatura temperatura;
    private Temperatura max;
    private Temperatura min;
    private String Estado;

	public Termometro(String color){
        setMarca(marca);
        this.c=new Color(color);
        this.temperatura=new Temperatura();
        this.max =temperatura;
        this.min=temperatura;
	}

	public Termometro(){
        setMarca("Checkatek");
		this.temperatura=new Temperatura(36, 'C');
        this.c=new Color("magenta");
        this.max =temperatura;
        this.min=temperatura;
	}
    public String getMarca(){
        return marca;
    }
    public void setMarca(String marca){
        this.marca=marca;
    }
    public void setColor(String c){
        this.c.setColorANSI(c);
    }
    public String getEstado(){
		return setEncendido();
	}
	public void setEstado(boolean encendido){
		setEncendido=encendido;
	}
	public Temperatura getTemperatura(){
		return temperatura;
	}
	public void setTemperatura(int valor, char uniMedida){
		temperatura.setValor();
        temperatura.setUniMedida();
	}
    public void setTemperatura(Temperatura t){
		temperatura=t;
	}
    public String medirTemperatura(){
        Random random=new Random();
		double temp = "0.0";
        if (!getEncendido()) {
            System.out.println();
            
        }else{
            temp=random.nextDouble()*100;
            temperatura.setValor(temp);
            if(max.setValor()<temp){
                max.setValor(temp);
            }
            if(min.setValor()<temp){
                min.setValor(temp);
            }
        }
    }

    public void datos(){
        if (encendido=encendido.equals("true")) {
            System.out.println(temp.medirTemp() + " " + temp.getUnidad() + "|\t|" + temp.getTemMax() + " - " + temp.getTemMin() + convUnidad());
        }
    }
    public void encendido(){
        this.encendido()=true;
    }
    public void apagar(){
        this.encendido()=false;
    }
    public void conv(char uni){
        if (!getEncendido()) {
            
        }
    }
    switch (uni) {
        case "f":
        case "F":
            if(temperatura.getUniMedida=='c' || temperatura.getUniMedida=='C'){
                cAf();
            }else(temperatura.getUniMedida=='k' || temperatura.getUniMedida=='K'){
                kAf();
            break;
        case "k":
        case "K":
            if(temperatura.getUniMedida()==)

        case
        default:
    }
    public void cAf(){
        temperatura.setValor((temperatura.getValor()*1.8)+32);
        temperatura.setUniMedida('f');
    }
    public void fAc(){
        temperatura.setValor((temperatura.getValor()*1.8)+32);
        temperatura.setUniMedida('f');
    }

}