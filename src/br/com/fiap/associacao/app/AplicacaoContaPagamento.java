package br.com.fiap.associacao.app;

import java.time.LocalDate;
import java.time.LocalDateTime;

import javax.swing.JOptionPane;

import br.com.fiap.associacao.Conta;
import br.com.fiap.associacao.Pagamento;

public class AplicacaoContaPagamento {
	
	public static void main(String[] args) {
		
		Pagamento pag = new Pagamento(2, "débito", "1344-4", 
										LocalDateTime.of(2024, 4, 5, 11, 10), 287.90);
		
		Conta luz = new Conta(1, "623443", "Enel", 287.90, "Enel", 
				             LocalDate.of(2024, 4, 7), 0, pag);
		
		Pagamento pagCartao = new Pagamento();
		pagCartao.setData(LocalDateTime.of(2024, 5, 8, 12, 0));
		pagCartao.setValor(1200);
		pagCartao.setId(4);
		pagCartao.setTipo("pix");
		pagCartao.setNumero("3432432");
		
		Conta cartao = new Conta();
		cartao.setId(3);
		cartao.setNumero("83423432");
		cartao.setEmissor("Banco do Brasil");
		cartao.setBeneficiado("Visa");
		cartao.setJurosDiarios(0.05);
		cartao.setValor(1340.55);
		cartao.setVencimento(LocalDate.of(2024, 5, 15));
		cartao.setPagamento(pagCartao);
		
		
		String tipo = JOptionPane.showInputDialog("Tipo: ");
		String numero = JOptionPane.showInputDialog("Numero: ");
		
		String aux = JOptionPane.showInputDialog("Valor: ");
		double valor = Double.parseDouble(aux);
		
		//double valor = Double.parseDouble(JOptionPane.showInputDialog("Valor: "));
		aux = JOptionPane.showInputDialog("Data pagamento (aaaa-mm-dd):");
		LocalDateTime dataPagamento = LocalDateTime.parse(aux + "T00:00:00");
		
		Pagamento p = new Pagamento(5, tipo, numero, dataPagamento, valor);	
		JOptionPane.showMessageDialog(null, p);
		
		
	}

}
