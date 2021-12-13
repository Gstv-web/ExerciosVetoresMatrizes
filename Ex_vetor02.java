package br.com.generation.vetor;

import java.util.Scanner;

/*Um dado � lan�ado 10 vezes e o valor correspondente � anotado. Fa�a um programa
que gere um vetor com os lan�amentos, escreva esse vetor. A seguir determine e
imprima a m�dia aritm�tica dos lan�amentos, contabilize e apresente tamb�m
quantas foram as ocorr�ncias da maior pontua��o.*/

public class Ex_vetor02 {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		int[] dado = new int[10];
		int soma = 0, maior = 0, media = 0, cont = 0;
		
		for(int i = 0; i < 10; i++) {
			System.out.println("Digite o " + (i+1) + "� valor: ");
			dado[i] = input.nextInt();
			soma = soma + dado[i];
			media = soma / 10;
			if(dado[i] > maior) {
				maior = dado[i];
			}
		}
		
		for(int i = 0; i < dado.length; i++) {
			if(dado[i] == maior) {
				cont++;
			}
		}
		
		System.out.print("Os valores lidos foram ");
		for(int i = 0; i < 10; i++) {
			if(i == 9) {
				System.out.print(dado[i] + ".");
			}
			else {
				System.out.print(dado[i] + ", ");
			}
		}
		
		
		System.out.println("\nA m�dia dos valores lidos � " + media);
		if(cont == 1) {
			System.out.println(maior + " foi o maior n�mero lido e apareceu " + cont + " vez.");
		}
		else {
			System.out.println(maior + " foi o maior n�mero lido e apareceu " + cont + " vezes.");			
		}
		
		input.close();
	}

}
