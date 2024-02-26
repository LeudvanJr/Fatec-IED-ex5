package view;

import controller.SequenciaController;

public class Principal {

	public static void main(String[] args) {
		
		SequenciaController sController = new SequenciaController();
		int termo = 5;
		double resultado = sController.somatoriaColevati(termo);
		
		System.out.println(resultado);
	}

}
