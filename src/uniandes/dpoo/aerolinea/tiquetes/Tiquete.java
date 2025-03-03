package uniandes.dpoo.aerolinea.tiquetes;

import uniandes.dpoo.aerolinea.modelo.Vuelo;
import uniandes.dpoo.aerolinea.modelo.cliente.Cliente;

public class Tiquete {
	private Vuelo vuelo;
	private Cliente cliente;
	private String codigo;
	private int tarifa;
	private boolean usado;
	
	public Tiquete(String codigo, Vuelo vuelo, Cliente clienteComprador, int tarifa)
	{
		this.cliente = clienteComprador;
		this.codigo = codigo;
		this.tarifa = tarifa;
		this.vuelo = vuelo;
		usado = false;
		
	}

	public Vuelo getVuelo() {
		return vuelo;
	}

	public Cliente getCliente() {
		return cliente;
	}

	public String getCodigo() {
		return codigo;
	}

	public int getTarifa() {
		return tarifa;
	}
	
	public void marcarComoUsado()
	{
		usado = true;
	}
	
	public boolean esUsado()
	{
		marcarComoUsado();
		return usado;
	}
}
