package br.edu.fapi.ex04;

import java.util.Scanner;

public class Ex04 {

	public static void main(String[] args) {
		float resultado;
		Calculadora calculadora = new Calculadora();
		Scanner leitor = new Scanner(System.in);	
		System.out.println("Digite o primeiro n�mero");
		float num1 = leitor.nextInt();
		System.out.println("Digite o segundo n�mero");
		float num2 = leitor.nextInt();
		System.out.println("Digite a opera��o");
		int op = leitor.nextInt();
		
		Calculadora calc = new Calculadora();
		calc.calcular(op, num1, num2);

	}

}
