package br.com.fiap.associacao;

import java.time.LocalDate;

public class Ex3 {
	
	public static void main(String[] args) {
		
		//instancia a data atual
		LocalDate hoje = LocalDate.now();
		System.out.println(hoje);
		
		//instancia a data do meu aniversario
		LocalDate nascimento = LocalDate.of(1980, 10, 29);
		System.out.println(nascimento);
		
		int anoAtual = hoje.getYear();
		int anoNascimento = nascimento.getYear();
		
		int mesAtual = hoje.getMonthValue();
		int mesNascimento = nascimento.getMonthValue();
		
		int anos = anoAtual - anoNascimento;
		int meses = mesAtual - mesNascimento;
		
		if (meses >= 0)
			System.out.println(anos + "-" + meses);
		else {
			anos--; //anos = anos - 1
			meses = meses + 12;
			System.out.println(anos + "-" + meses);
		}
	}
}
