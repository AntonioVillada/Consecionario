package logica;

public class Camion extends Vehiculo {
	
		
		private int cap_carga;
		
		
		public Camion() {
			
		}
		
		public Camion(String placa, String marca, String referencia, String modelo, int num_ruedas,int num_puertas, boolean is_gasolina,int precio) {
			super(placa, marca, referencia, modelo, num_ruedas,precio);
			this.cap_carga = num_puertas;
			
		}
		

		public int getCap_carga() {
			return cap_carga;
		}

		public void setCap_carga(int cap_carga) {
			this.cap_carga = cap_carga;
		}
		

		@Override
		public void queSoy() {
			// TODO Auto-generated method stub
			System.out.println("soy un Camion");
		}

		@Override
		public String toString() {
			// TODO Auto-generated method stub
			return "marca: "+ getMarca() +"\nplaca: "+getPlaca()+"\nreferencia: "+getReferencia()+"\nmodelo: "+getModelo()+"\nnumero de ruedas: "+getNum_ruedas()+
					"\ncapacidad de carga: "+getCap_carga()+"\nPrecio: "+getPrecio();
		
		}

}
