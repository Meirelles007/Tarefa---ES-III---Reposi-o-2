package controller;

import model.Cidades;

public class Controller_Imposto {
	public void iniciocalculo(Cidades cidade) {
		System.out.println("Iniciando o Calculo do Imposto da Cidade com Area" + cidade.getArea());
	}

}
