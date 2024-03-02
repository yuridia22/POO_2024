public class PortaLapiz2{
	private String material;
	private String dibujo;
	private String marca;
	private String forma;
	private int capacidad;

	public PortaLapiz2(){
		material= "Plastico";
		dibujo= "DragonBall Z";
		marca= "Ruz";
		forma= "Rectangular";
		capacidad= 15;
	}

	public String getMaterial(){
		return material;
	}

	public void setMaterial(){
		this.material=material;
	}

	public String getDibujo(){
		return dibujo;
	}

	public void setDibujo(){
		this.dibujo=dibujo;
	}

	public String getMarca(){
		return marca;
	}

	public void setMarca(){
		this.marca=marca;
	}

	public String getForma(){
		return forma;
	}

	public void  setForma(){
		this.forma=forma;
	}

	public void agregarObjeto(){
		if(capacidad<15){
			System.out.println("*Agrega un objeto*");
		}
		if(capacidad==15){
			System.out.println("*Portalapiz lleno*");
		}
	}

	public void sacarObjeto(){
		if(capacidad<=15){
			System.out.println("*Saque un objeto*");
		}
		if(capacidad==0){
			System.out.println("*Portalapiz vacio*");
		}
	}
}