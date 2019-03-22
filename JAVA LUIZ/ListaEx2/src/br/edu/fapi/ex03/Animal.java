package br.edu.fapi.ex03;

import java.util.Scanner;

public class Animal {
	String nome;
	String raca;
	float peso;
	int idade;
	String nacionalidade;
	float altura;

	public Animal inserirAnimal(Animal animal) {

		Scanner leitor = new Scanner(System.in);
		System.out.println("Nome animal: ");
		animal.nome = leitor.next();
		System.out.println("Raca animal: ");
		animal.raca = leitor.next();
		System.out.println("Idade animal: ");
		animal.idade = leitor.nextInt();
		System.out.println("Altura animal: ");
		animal.altura = leitor.nextFloat();
		System.out.println("Peso animal: ");
		animal.peso = leitor.nextFloat();
		System.out.println("Nacionalidade animal: ");
		animal.nacionalidade = leitor.next();

		return animal;

	}

		public void  mostrarAnimal(Animal animal) {

		System.out.println("Nome do animal: " + animal.nome);
		System.out.println("Raça do animal: " + animal.raca);
		System.out.println("Idade do animal: " + animal.idade);
		System.out.println("Peso do animal: " + animal.peso);
		System.out.println("Altura do animal: " + animal.altura);
		System.out.println("Nacionalidade do animal: " + animal.nacionalidade);

		

	}

}