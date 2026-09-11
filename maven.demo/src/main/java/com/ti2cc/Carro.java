package com.ti2cc;

public class Carro {
	private int codigo;		// Sequencial
	private String placa ;	// XXXX-XXXX
	private String modelo;	// Nome
	private char cor;		// R,B,G
	private int ano;
	
	public static int index = 0; // Quantidade de carros totais
	
	public Carro() {
		this.codigo = -1;
		this.placa = "";
		this.modelo = "";
		this.cor = '*';
		this.ano = 0;
	}
	
	public Carro(int codigo, String placa, String modelo, char cor, int ano) {
		this.codigo = codigo;
		this.placa = placa;
		this.modelo = modelo;
		this.cor = cor;
		this.ano = ano;
	}

	public int getCodigo() {
		return codigo;
	}

	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}

	public String getPlaca() {
		return placa;
	}

	public void setPlaca(String placa) {
		this.placa = placa;
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public char getCor() {
		return cor;
	}

	public void setCor(char cor) {
		this.cor = cor;
	}
	
	public int getAno() {
		return ano;
	}
	
	public void setAno(int ano) {
		this.ano = ano;
	}
	

	@Override
	public String toString() {
		return "Carro [codigo=" + codigo + ", placa=" + placa + ", modelo=" + modelo + ", sexo=" + cor + ", ano=" + ano + "]";
	}	
}