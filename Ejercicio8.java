package Condicionales;

import javax.swing.JOptionPane;

public class Main {

	public static void main(String[] args) {
		
		int numero;
		
		numero = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el numero"));
		
		if (numero < 10) {
			JOptionPane.showMessageDialog(null, "El numero tiene 1 cifra");
		}
		
		else if (numero < 100) {
			JOptionPane.showMessageDialog(null, "El numero tiene 2 cifras");
		}
		
		else if (numero < 1000) {
			JOptionPane.showMessageDialog(null, "El numero tiene 3 cifras");
		}
		
	}
}
