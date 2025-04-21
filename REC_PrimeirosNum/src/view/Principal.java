package view;

import javax.swing.JOptionPane;
import controller.SomaRec;

public class Principal {
	public static void main(String[] args) {
		
		SomaRec c = new SomaRec();
		
		int n;
		
		n = Integer.parseInt(JOptionPane.showInputDialog("Digite um numero"));
		
		System.out.println(c.funcao(n));
		
	}
}
