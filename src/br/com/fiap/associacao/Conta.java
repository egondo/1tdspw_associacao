package br.com.fiap.associacao;

import java.time.LocalDate;

public class Conta {
	
	private long id;
	
	private String numero;
	
	private String emissor;
	
	private double valor;
	
	private String beneficiado;
	
	private LocalDate vencimento;
	
	private double jurosDiarios = 0.0005;
	
	private Pagamento pagamento;

	public Conta() {
		super();
	}

	public Conta(long id, String numero, String emissor, double valor, String beneficiado, LocalDate vencimento,
			double jurosDiarios, Pagamento pagamento) {
		super();
		this.id = id;
		this.numero = numero;
		this.emissor = emissor;
		this.valor = valor;
		this.beneficiado = beneficiado;
		this.vencimento = vencimento;
		this.jurosDiarios = jurosDiarios;
		this.pagamento = pagamento;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getNumero() {
		return numero;
	}

	public void setNumero(String numero) {
		this.numero = numero;
	}

	public String getEmissor() {
		return emissor;
	}

	public void setEmissor(String emissor) {
		this.emissor = emissor;
	}

	public double getValor() {
		return valor;
	}

	public void setValor(double valor) {
		this.valor = valor;
	}

	public String getBeneficiado() {
		return beneficiado;
	}

	public void setBeneficiado(String beneficiado) {
		this.beneficiado = beneficiado;
	}

	public LocalDate getVencimento() {
		return vencimento;
	}

	public void setVencimento(LocalDate vencimento) {
		this.vencimento = vencimento;
	}

	public double getJurosDiarios() {
		return jurosDiarios;
	}

	public void setJurosDiarios(double jurosDiarios) {
		this.jurosDiarios = jurosDiarios;
	}

	public Pagamento getPagamento() {
		return pagamento;
	}

	public void setPagamento(Pagamento pagamento) {
		this.pagamento = pagamento;
	}
	
	public void calculaJurosEfetuaPagamento() {
		
	}
			

}
