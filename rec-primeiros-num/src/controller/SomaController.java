package controller;

public class SomaController {

	public SomaController() {
		super ();
	}
	
	public int funcao (int num) {
		int total;
		
		//Condicao de parada -> Se o numero for igual a zero
		if (num==0) {
			return 0;
		}
		//Somar o num com o seu antecessor, ate o 1
		else {
			total = num + funcao(num--);
			return total;
		}
	}
	
}
