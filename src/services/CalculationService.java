package services;

import java.util.List;

public class CalculationService {
	
	//Cabecalho do metodo que permite comparar T com qualquer subtipo de T
	public static <T extends Comparable<T>> T max(List<T> list) {
		//Esse metodo recebe qualquer lista do tipo T e retorna um maximo de qualquer tipo T também
		if(list.isEmpty()) {
			throw new IllegalStateException("The list are empty"); //Programacao defensiva
		}
		T max = list.get(0); //Pegando o primeiro valor da lista e atribuindo a uma variavel de qualquer tipo T
		for(T item : list) { //For each para cada item do tipo T na lista
			if(item.compareTo(max) > 0) { //Comparar o item da lista com o valor da variavel max
				max = item; //Trocar o valor de max pelo valor de item se ele for amior
			}
		}
		return max;
	}
}
