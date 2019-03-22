package br.edu.fapi.ex01;

public class Pessoa {

	String nome = "Luiz";
	String sobrenome = "Souza";
	int idade = 18;
	float peso = 90;

	String pegaNome() {
		System.out.println("Nome: "+nome);
		return nome;

	}
	
	String pegasobrenome() {
		System.out.println("Sobrenome: "+sobrenome);
		return sobrenome;

	}
	
	int idade() {
		System.out.println("Idade: "+idade);
		return idade;

	}
	
	float peso() {
		System.out.println("Peso: " +peso);
		return idade;

	}

}




