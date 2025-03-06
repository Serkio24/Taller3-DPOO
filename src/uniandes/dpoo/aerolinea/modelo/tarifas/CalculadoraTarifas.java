package uniandes.dpoo.aerolinea.modelo.tarifas;

import uniandes.dpoo.aerolinea.modelo.Ruta;
import uniandes.dpoo.aerolinea.modelo.Vuelo;
import uniandes.dpoo.aerolinea.modelo.cliente.Cliente;

public abstract class CalculadoraTarifas {
	
	public static final double IMPUESTO = 0.28;
	protected Cliente cliente;
	protected Vuelo vuelo;
	
	public abstract int calcularTarifa(Vuelo vuelo, Cliente cliente);

	protected abstract int calcularCostoBase(Vuelo vuelo, Cliente cliente);
	protected abstract double calcularPorcentajeDescuento(Cliente cliente);
	
	/** Un  Avion en promedio vuela a 800 a 900 km/h, como en los datos de ruta no tengo forma de saber cuanto es el recorrido 
	 * usaré 800 como referencia
	 * @param ruta
	 * @return
	 */
	protected int DistanciaVuelo(Ruta ruta)
	{

		return (int)((ruta.getDuracion()/60)*800);
	}
	
	protected int calcularValorImpuestos(int costoBase)
	{
		return (int) (costoBase*IMPUESTO);
	}
}
