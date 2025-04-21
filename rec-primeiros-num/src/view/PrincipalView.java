package view;

import javax.swing.JOptionPane;
import controller.SomaController;

public class PrincipalView {
	public static void main(String[] args) {
		
		SomaController c = new SomaController();
		
		int n;
		
		n = Integer.parseInt(JOptionPane.showInputDialog("Digite um numero"));
		
		System.out.println(c.funcao(n));
		
	}
}
