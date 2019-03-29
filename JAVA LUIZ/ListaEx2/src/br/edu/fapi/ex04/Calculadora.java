package br.edu.fapi.ex04;

import java.util.Scanner;

public class Calculadora {
	float num1;
	float num2;

	
	public void  calcular(int op, float num1, float num2) {
		
		switch(op) {
		case 1:
			Soma soma = new Soma();
			float resultado = soma.calcularSoma(num1, num2);
			System.out.println(resultado);
			break;
		
		
		
		}
		
		
		
		
	}

	
	
}
