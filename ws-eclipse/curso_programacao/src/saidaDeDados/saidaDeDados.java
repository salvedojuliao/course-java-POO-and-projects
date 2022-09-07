package saidaDeDados;

import java.util.Locale;

public class saidaDeDados {

	public static void main(String[] args) {
		double x = 10.35784;
		System.out.println(x);
		System.out.printf("%.2f\n", x); // O f vem de formatação
		/* Para mudar a Vírgula para um Ponto eu tenho que configurar o Java pra isso, 
		para mudar para o formato dos EUA (Ou seja, importrar essa classe) */
		Locale.setDefault(Locale.US);
		System.out.printf("%.4f", x);
		
		
		System.out.println("\nRESULTADO = " + x + "METROS\n");
		System.out.printf("RESULTADO = %.2f metros%n", x); 
		// Deixo marcado onde eu quero que entre
		
		
		String nome = "Maria";
		int idade = 31;
		double renda = 4000.0;
		System.out.printf("%s tem %d anos e ganha R$ %.2f reais\n", nome, idade, renda);
		/*
		 %f = ponto flutuante;
		 %d = inteiro;
		 %s = texto;
		 %n = quebra de linha;
		 */
		
	}

}

