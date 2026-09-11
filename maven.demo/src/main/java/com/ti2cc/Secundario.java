package com.ti2cc;

public class Secundario {
	
	public static void main(String[] args) {
		
		DAO dao = new DAO();
		
		dao.conectar();
	
		//Inserir um elemento na tabela
		Carro carro = new Carro(11, "ABCD-1234", "modelo-T",'R', 1910);
		if(dao.inserirCarro(carro) == true) {
			System.out.println("Inserção com sucesso -> " + carro.toString());
		}
		
		//Mostrar carros da cor vermelha		
		System.out.println("==== Mostrar carros vermelhos === ");
		Carro[] carros = dao.getCarrosVermelhos();
		for(int i = 0; i < carros.length; i++) {
			System.out.println(carros[i].toString());
		}

		//Atualizar carro
		carro.setPlaca("4321-DCBA");
		dao.atualizarCarro(carro);

		//Mostrar carros antes da exclusão
		System.out.println("==== Mostrar carros === ");
		carros = dao.getCarros();
		for(int i = 0; i < carros.length; i++) {
			System.out.println(carros[i].toString());
		}
		
		//Excluir carro
		dao.excluirCarro(carro.getCodigo());
		
		//Mostrar carros depois da exclusão
		carros = dao.getCarros();
		System.out.println("==== Mostrar carros === ");		
		for(int i = 0; i < carros.length; i++) {
			System.out.println(carros[i].toString());
		}
		
		dao.close();
	}
}