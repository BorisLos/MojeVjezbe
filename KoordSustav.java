package Vjezbe;

import javax.swing.JOptionPane;

public class KoordSustav {

	public static void main(String[] args) {
		int a1 = Integer.parseInt(JOptionPane.showInputDialog("Unesi x to�ke A "));
		int a2 = Integer.parseInt(JOptionPane.showInputDialog("Unesi y to�ke A "));
		int b1 = Integer.parseInt(JOptionPane.showInputDialog("Unesi x to�ke B "));
		int b2 = Integer.parseInt(JOptionPane.showInputDialog("Unesi x to�ke B "));

		int a = Math.abs(a1 - b1);
		int b = Math.abs(a1 - b2);

		double d = Math.sqrt((a * a) + (b * b));
		System.out.println(d);

	}

}
