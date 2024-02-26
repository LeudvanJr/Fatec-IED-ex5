package controller;

public class SequenciaController {
	public SequenciaController() {
		// TODO Auto-generated constructor stub
	}
	
	//Funcao para calcular a somatoria: 1 + (1/2) + (1/3) + (1/4) +...+ (1/n)
	public double somatoriaColevati(int n) {
		if(n<1)
			return -1;
		
		//Condição de parada - retorna o menor termo conhecido da sequencia
		if(n==1)
			return 1;
		
		//calcula-se a divisao do termo atual (1/n) e soma com a sequencia do termo anterior
		return (1.0/n) + somatoriaColevati(--n);
	}
}
