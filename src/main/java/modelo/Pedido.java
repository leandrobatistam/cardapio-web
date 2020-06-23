package modelo;

import java.time.LocalDate;

public class Pedido {
	private int id;
	private LocalDate dataPedido;
	private LocalDate dataEntrega;
	private float total;
	public int getId() {
		return id;
	}
	
	Cliente cliente = new Cliente();
	
	public void setId(int id) {
		this.id = id;
	}
	public LocalDate getDataPedido() {
		return dataPedido;
	}
	public void setDataPedido(LocalDate dataPedido) {
		this.dataPedido = dataPedido;
	}
	public LocalDate getDataEntrega() {
		return dataEntrega;
	}
	public void setDataEntrega(LocalDate dataEntrega) {
		this.dataEntrega = dataEntrega;
	}
	public float getTotal() {
		return total;
	}
	public void setTotal(float total) {
		this.total = total;
	}
	
	
}
