package br.edu.fapi.ex02;

public class Produto {
	String nome = "Ventilador";
	String cor = "Branco";
	float largura = 3.4f;
	float altura = 5.3f;
	String fornecedor = "Alitralis";
	float preco = 84.20f;

	String mostrarNome() {
		System.out.println("Nome Pessoa: "+nome);
		return nome;

	}

	String mostrarCor() {
		System.out.println("Nome Pessoa: "+cor);
		return cor;

	}

	float mostrarLargura() {
		System.out.println("Nome Pessoa: "+largura);
		return largura;

	}

	float mostrarAltura() {
		System.out.println("Nome Pessoa: "+altura);
		return altura;

	}

	String mostrarFornecedor() {
		System.out.println("Nome Pessoa: "+fornecedor);
		return fornecedor;

	}

	float mostrarPreco() {
		System.out.println("Nome Pessoa: "+preco);
		return preco;

	}

}
