package br.com.fiap.associacao;

import java.time.LocalDateTime;

public class Pagamento {
	
	//atributos
	private long id;
	
	private String tipo;
	
	private String numero;
	
	private LocalDateTime data;
	
	private double valor;
	
	//Construtores
	public Pagamento() {
	}

	public Pagamento(long id, String tipo, String numero, LocalDateTime data, double valor) {
		super();
		this.id = id;
		this.tipo = tipo;
		this.numero = numero;
		this.data = data;
		this.valor = valor;
	}

	//métodos acessores (get e set)
	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public String getNumero() {
		return numero;
	}

	public void setNumero(String numero) {
		this.numero = numero;
	}

	public LocalDateTime getData() {
		return data;
	}

	public void setData(LocalDateTime data) {
		this.data = data;
	}

	public double getValor() {
		return valor;
	}

	public void setValor(double valor) {
		this.valor = valor;
	}
}
