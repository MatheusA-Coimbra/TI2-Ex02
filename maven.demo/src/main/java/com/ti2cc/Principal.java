package com.ti2cc;

import java.util.*;

public class Principal {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		DAO dao = new DAO();
		
		dao.conectar();
		
		int opt = -1;
		do {
			System.out.println("Terminar Programa (-1 ) |");
			System.out.println("Inserir elemento  ( 1 ) |");
			System.out.println("Remover elemento  ( 2 ) |");
			System.out.println("Mostrar elemento  ( 3 ) |");			
			
			System.out.print("Opcao: ");
			opt = sc.nextInt();
			
			if(opt == 1) {
				//Inserir um elemento na tabela
				System.out.print("Codigo: ");
				int codigo = sc.nextInt(); sc.nextLine();
				System.out.print("Placa: ");
				String placa = sc.nextLine();
				System.out.print("Modelo: ");
				String modelo = sc.nextLine();
				System.out.print("Cor: ");
				String cor = sc.nextLine();
				System.out.print("ano: ");
				int ano = sc.nextInt();
				
				Carro carro = new Carro(codigo, placa, modelo, cor.charAt(0), ano);
				if(dao.inserirCarro(carro) == true) {
					System.out.println("Inserção com sucesso -> " + carro.toString());
				}
				
			} else if(opt == 2) {
				//Excluir carro
				System.out.print("ID: ");
				int id = sc.nextInt();
				
				dao.excluirCarro(id);
				
			} else if(opt == 3) {
				//Mostrar carros
				Carro[] allCarros = dao.getCarros();
				System.out.println("==== Mostrar carros === ");		
				for(int i = 0; i < allCarros.length; i++) {
					System.out.println(allCarros[i].toString());
				}
			} else if(opt != -1) {
					System.out.println("ERRO: Valor invalido");
			}
			
			
		} while(opt != -1);
		
		dao.close();
		sc.close();
	}
}