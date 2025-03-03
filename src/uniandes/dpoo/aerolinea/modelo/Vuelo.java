package uniandes.dpoo.aerolinea.modelo;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

import uniandes.dpoo.aerolinea.modelo.cliente.Cliente;
import uniandes.dpoo.aerolinea.modelo.tarifas.CalculadoraTarifas;
import uniandes.dpoo.aerolinea.tiquetes.Tiquete;

public class Vuelo {
	private String fecha;
	private Ruta ruta;
	public Map<String, Tiquete> tiquetes;
	private Avion avion;
	
	public Vuelo(Ruta ruta, String fecha, Avion avion)
	{
		this.ruta = ruta;
		this.fecha = fecha;
		this.avion = avion;
		tiquetes = new HashMap<String, Tiquete>();
	}

	public String getFecha() {
		return fecha;
	}

	public Ruta getRuta() {
		return ruta;
	}

	public Collection<Tiquete> getTiquetes() {
		return tiquetes.values();
	}

	public Avion getAvion() {
		return avion;
	}
	
	public int venderTiquetes(Cliente cliente, CalculadoraTarifas calculadora,int cantidad)
	{
		return -1;
	}
	
	@Override
	public boolean equals(Object obj)
	{
		boolean retorno = false;
		int i = 0;
		ArrayList<Tiquete> tiquets = (ArrayList<Tiquete>) getTiquetes();
		while(retorno == false && i < tiquets.size())
		{
			if(tiquets.get(i).equals(obj))
			{
				retorno = true;
			}
		}
		
		return retorno;

	}
	
}
