package uniandes.dpoo.aerolinea.modelo.cliente;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

import uniandes.dpoo.aerolinea.modelo.Vuelo;
import uniandes.dpoo.aerolinea.tiquetes.Tiquete;

public abstract class Cliente {

	private ArrayList<Tiquete> tiquetesSinUsar;
	private ArrayList<Tiquete> tiquetesUsados;
	
	public Cliente() {
		tiquetesSinUsar = new ArrayList<Tiquete>();
		tiquetesUsados = new ArrayList<Tiquete>();
	}
	
	
	public abstract String getTipoCliente();
	
	public abstract String getIdentificador();
	
	public void agregarTiquete(Tiquete tiquete)
	{

			tiquetesSinUsar.add(tiquete);
	}
	
	public void usarTiquetes(Vuelo vuelo)
	{
		for (int i = 0; i < tiquetesSinUsar.size(); i++) {
			if(vuelo.tiquetes.containsValue(tiquetesSinUsar.get(i)))
			{
				tiquetesUsados.add(tiquetesSinUsar.get(i));
				tiquetesSinUsar.remove(i);
			}
		}
	}
}
