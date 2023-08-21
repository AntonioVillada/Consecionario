package logica;

public class Auto extends Vehiculo {
	
	private int num_puertas;
	private boolean is_gasolina;
	
	public Auto() {
		
	}
	
	

	public Auto(String placa, String marca, String referencia, String modelo, int num_ruedas,int num_puertas, boolean is_gasolina,int precio) {
		super(placa, marca, referencia, modelo, num_ruedas,precio);
		this.num_puertas = num_puertas;
		this.is_gasolina = is_gasolina;
	}

	

	public int getNum_puertas() {
		return num_puertas;
	}



	public void setNum_puertas(int num_puertas) {
		this.num_puertas = num_puertas;
	}



	public boolean isIs_gasolina() {
		return is_gasolina;
	}



	public void setIs_gasolina(boolean is_gasolina) {
		this.is_gasolina = is_gasolina;
	}



	@Override
	public void queSoy() {
		// TODO Auto-generated method stub
		System.out.println("soy un carro");
	}



	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "marca: "+ getMarca() +"\nplaca: "+getPlaca()+"\nreferencia: "+getReferencia()+"\nmodelo: "+getModelo()+"\nnumero de ruedas: "+getNum_ruedas()+
				"\numero de puertas: "+getNum_puertas()+"\nes a gasolina?: "+is_gasolina+"\nPrecio: "+getPrecio();
	}
	
	

}
