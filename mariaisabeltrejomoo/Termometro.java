public class Termometro{
	private int estado;
	private Temperatura temperatura;

	public Termometro(){
		setEstado(0);
	}
	public Termometro(in estado, String uniMedida){
		setEstado(estado);
		temperatura=new Temperatura(uniMedida);
	}
	public int getEstado(){
		return estado;
	}
	public void setEstado(int estado){
		this.estado=estado;
	}
	public Temperatura getTemperatura(){
		return temperatura;
	}
	public void setTemperatura(Temperatura temperatura){
		this.temperatura=temperatura;
	}
	public String convUnidad(){
		double tempAct=temperatura.getTempAct();
		switch (temp.getUnidad()) {
            case "c":
                double tempFc = (temperatura - 32) / 1.8;
                double tempKc = temperatura - 273;
                return "°F: " + tempFc + " - °K: " + tempKc;
				System.out.println("°F: "+ tempFC + "°k: "+tempkc);
            case "f":
                double tempCf = (temperatura * 1.8) + 32;
                double tempKf = (temperatura - 273) * 1.8 + 32;
                return "°C: " + tempCf + " - °K: " + tempKf;
            case "k":
                double tempCk = temperatura + 273;
                double tempFk = (temperatura - 32) / 1.8 + 273;
                return "°C: " + tempCk + " - °F: " + tempFk;
            default:
                return null;
        }
    }

    public void datos(){
        if (estado == 1) {
            System.out.println(temp.medirTemp() + " " + temp.getUnidad() + "|\t|" + temp.getTemMax() + " - " + temp.getTemMin() + convUnidad());
        }
    }
}