package logica;

import java.util.ArrayList;

import javax.swing.JOptionPane;


public class Concesionario {
	
	private Auto auto=new Auto();
	private Moto moto=new Moto();
	private Camion camion=new Camion();
	public static ArrayList<Vehiculo> vehiculos_disponibles=new ArrayList<Vehiculo>();
	public static ArrayList<Vehiculo> vehiculos_vendidos=new ArrayList<Vehiculo>();
	
	public void auto() {
		String placa=JOptionPane.showInputDialog("digite la placa");
		String referencia=JOptionPane.showInputDialog("digite la referencia");
		String marca=JOptionPane.showInputDialog("digite la marca");
		String modelo=JOptionPane.showInputDialog("digite el modelo");
		int numPuertas=Integer.parseInt(JOptionPane.showInputDialog("digite el numero de puertas"));
		int numRuedas=Integer.parseInt(JOptionPane.showInputDialog("digite el numero de Ruedas"));
		boolean gasolina=Boolean.valueOf(JOptionPane.showInputDialog("es a gasolina?"));
		int precio=Integer.parseInt(JOptionPane.showInputDialog("digite el valor del vehiculo"));	
			auto.setMarca(marca);  
			auto.setPlaca(placa);  
			auto.setReferencia(referencia);
			auto.setModelo(modelo); 
			auto.setNum_puertas(numPuertas); 
			auto.setNum_ruedas(numRuedas);		
			auto.setIs_gasolina(gasolina);
			auto.setPrecio(precio);
			vehiculos_disponibles.add(auto);
	}
	public void moto() {
		String placa=JOptionPane.showInputDialog("digite la placa");
		String referencia=JOptionPane.showInputDialog("digite la referencia");
		String marca=JOptionPane.showInputDialog("digite la marca");
		String modelo=JOptionPane.showInputDialog("digite el modelo");
		int numRuedas=Integer.parseInt(JOptionPane.showInputDialog("digite el numero de Ruedas"));
		int cilindraje=Integer.parseInt(JOptionPane.showInputDialog("digite el cilindraje de la moto"));
		double tamTanque=Double.parseDouble(JOptionPane.showInputDialog("digite el cilindraje de la moto"));
		int precio=Integer.parseInt(JOptionPane.showInputDialog("digite el valor del vehiculo"));	
			moto.setMarca(marca);
			moto.setPlaca(placa);moto.setReferencia(referencia);
			moto.setModelo(modelo);moto.setNum_ruedas(numRuedas);
			moto.setCilindraje(cilindraje);
			moto.setTam_tanque(tamTanque);
			moto.setPrecio(precio);
			vehiculos_disponibles.add(moto);
		
	}
	public void camion() {
		String placa=JOptionPane.showInputDialog("digite la placa");
		String referencia=JOptionPane.showInputDialog("digite la referencia");
		String marca=JOptionPane.showInputDialog("digite la marca");
		String modelo=JOptionPane.showInputDialog("digite el modelo");
		int numRuedas=Integer.parseInt(JOptionPane.showInputDialog("digite el numero de Ruedas"));
		int cap_carga=Integer.parseInt(JOptionPane.showInputDialog("digite el capacidad de carga"));
		int precio=Integer.parseInt(JOptionPane.showInputDialog("digite el valor del vehiculo"));	
		camion.setPlaca(placa);
		camion.setReferencia(referencia);
		camion.setMarca(marca);
		camion.setModelo(modelo);
		camion.setNum_ruedas(numRuedas);
		camion.setCap_carga(cap_carga);
		camion.setPrecio(precio);
		vehiculos_disponibles.add(camion);
		
	}
	
	public void Informativa ()
	{
	        JOptionPane.showMessageDialog(null, "esta opcion no está entre las indicadas ", 
	        "Alerta Informativa", JOptionPane.INFORMATION_MESSAGE);
	}
	
	
	public void agrega_vehiculo()
	{
		int opcion=Integer.parseInt(JOptionPane.showInputDialog("1:Auto"+"\n2:Moto"+"\n3:Camion "));
			switch (opcion) 
			{
			case 1:
				auto();
				break;
			case 2:
				moto();
				break;
			case 3:  
				camion();
				break;
			default: 
				Informativa ();
				
			}
	}
	
	public void buscar_vehiculo() 
	{
		int opcion=Integer.parseInt(JOptionPane.showInputDialog("1: Buscar en vehiculos disponibles"
				+ "\n2: Buscar en vehiculos vendidos "));
		String dato=JOptionPane.showInputDialog("ingresa la placa del vehiculo que deseas buscar");
		if(opcion==1) 
		{
			for(int i=0;i<vehiculos_disponibles.size();i++) 
			{
				if(vehiculos_disponibles.get(i).getPlaca().equals(dato)) 
				{
					JOptionPane.showMessageDialog(null,vehiculos_disponibles.get(i).toString());
				}
				else 
				{
					JOptionPane.showMessageDialog(null, "El ehiculo no esta registrado o ya se vendio ", 
					        "Alerta Informativa", JOptionPane.INFORMATION_MESSAGE);
				}
			}
		}
		else 
		{
			for(int i=0;i<vehiculos_vendidos.size();i++)
			{
				if(vehiculos_vendidos.get(i).getPlaca().equals(dato)) 
				{
					JOptionPane.showMessageDialog(null,vehiculos_vendidos.get(i).toString());
				}
				else 
				{
					JOptionPane.showMessageDialog(null, "Vehiculo no encontrado ", 
					        "Alerta Informativa", JOptionPane.INFORMATION_MESSAGE);
				}
			}
		}
	}
	
	
	public void vender_vehiculos() 
	{
		String dato=JOptionPane.showInputDialog("Digita la placa del vehiculo que deseas vender");
		for(int i=0;i<vehiculos_disponibles.size();i++) 
		{
			if(vehiculos_disponibles.get(i).getPlaca().equals(dato)) 
			{
				vehiculos_vendidos.add(vehiculos_disponibles.get(i));
				vehiculos_disponibles.remove(i);
			}
			else 
			{
				JOptionPane.showMessageDialog(null, "Vehiculo no encontrado ", 
				        "Alerta Informativa", JOptionPane.INFORMATION_MESSAGE);
			}
		}
	}
	
	
	public void mostrar_disponibles() 
	{
		
        StringBuilder mensaje = new StringBuilder("Detalles de los vehículos:\n");
        
        for (Vehiculo vehiculo : vehiculos_disponibles) {
            mensaje.append(vehiculo).append("\n");
            JOptionPane.showMessageDialog(null, mensaje.toString(), "Detalles de los Vehículos", JOptionPane.INFORMATION_MESSAGE);
            
        }}
	
	
		/**
		for(int i=0;i<vehiculos_disponibles.size();i++) 
		{
			System.out.println(i+". "+vehiculos_disponibles.toString());
		}
	}
	**/
	
	public void cantidades() 
	{
		int cantidad_motos=0; 
		int cantidad_autos=0;
		int cantidad_camiones=0;
		int cantidad_vendidos=0; 
		int cantidad_disponibles=0;
		
		for(int i=0;i<vehiculos_disponibles.size();i++) 
		{
			if(vehiculos_disponibles.size()!=0) 
			{
				cantidad_disponibles++;
				if(vehiculos_disponibles.get(i).getClass().equals(auto.getClass())) 
				{
					cantidad_autos++;
				}
				else if(vehiculos_disponibles.get(i).getClass().equals(moto.getClass())) 
				{
					cantidad_motos++;
				}
				else if(vehiculos_disponibles.get(i).getClass().equals(camion.getClass())) 
				{
					cantidad_camiones++;
				}
			}
		}
		for(int j=0;j<vehiculos_vendidos.size();j++)
		{
			if(vehiculos_vendidos.size()!=0)
			{
				cantidad_vendidos++;
			}
		}
		
		JOptionPane.showMessageDialog(null, "cantidad de vehiculos disponibles: "+cantidad_disponibles+"\n"
				+ "cantidad de autos: "+cantidad_autos+"\ncantidad de motos: "+cantidad_motos+
				"\ncantidad de camiones: "+cantidad_camiones+"\ncantidad de vehiculos vendidos: "+cantidad_vendidos);
	}
	
	public void total_ventas() {
		int total=0;
		for(int i=0;i<vehiculos_vendidos.size();i++) {
			if(vehiculos_vendidos.size()==0) {
				JOptionPane.showMessageDialog(null, "No hay vehiculos vendidos");
			}else {
				total+=vehiculos_vendidos.get(i).getPrecio();
				JOptionPane.showMessageDialog(null, "El valor total de ventas a sido de: "+total);
			}
		}
	}
	
	public void eliminar_vehiculo() {
		String dato=JOptionPane.showInputDialog("Digita la placa del vehiculo que deseas eliminar");
		for(int i=0;i<vehiculos_disponibles.size();i++) {
			if(dato.equals(vehiculos_disponibles.get(i).getPlaca())) {
				vehiculos_disponibles.remove(i);
			}else {
				JOptionPane.showMessageDialog(null, "Vehiculo no encontrado", 
				        "Alerta Informativa", JOptionPane.INFORMATION_MESSAGE);
			}
		}
	}
	
	public void menu() {
		int opcion=7;
			while (opcion!=0) {
				opcion=Integer.parseInt(JOptionPane.showInputDialog("1: Agregar Vehiculo"+
						"\n2: Buscar Vehiculo"    +"\n3: Ver vehiculos disponibles" +"\n4: Vender vehiculos"+
						"\n5: Ver cantidades"     +"\n6: Ver ventas totales"        +"\n7: Eliminar vehiculos "));
				switch (opcion) {
				
				case 1:
					agrega_vehiculo();
					break;
				case 2:
					buscar_vehiculo();
					break;
				case 3:
					mostrar_disponibles();
					break;
				case 4:
					vender_vehiculos();
					break;
				case 5:
					cantidades();
					break;
				case 6:
					total_ventas();
					break;
				case 7:
					eliminar_vehiculo();
					break;
				default: 
					Informativa ();		
				}
			}
	}
}
