package uniandes.dpoo.aerolinea.modelo.tarifas;

import uniandes.dpoo.aerolinea.modelo.Vuelo;
import uniandes.dpoo.aerolinea.modelo.cliente.Cliente;

public abstract class CalculadoraTarifas {
	
	public double impuesto = 0.28;
	
	public int calcularTarifa(Vuelo vuelo, Cliente cliente)
	{
		return -1;
	}

}
