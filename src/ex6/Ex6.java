package ex6;

import javax.swing.JOptionPane;

public class Ex6 {
	
	public static void main(String args[]) {
		int a;
		a = Integer.parseInt((JOptionPane.showInputDialog("Digite um numero")));
		System.out.println(Ex6(a));
	}
	
	public static float Ex6(int n) {
		if (n > 10) {
			System.out.println("Entrada limitada a 10");
			return 0;
			}
		int x = n;
		if (x < 2)
		// condição de parada: se o valor for menor que 2 não será mais possível realizar a fração, que se inicia em 1/2
		// então é retornado 1 para que seja somado aos demais valores
			return 1;
		else {
			float a = n;
			while (x >= 2) {
				a = a * (x-1);
				x--;
			}
			// a função calcula o fatorial de n atráves de um laço de repetição, divide 1 pelo fatorial e chama a si mesma enviado n-1 como
			// parametro, assim os fatoriais e as divisões são calculadas na sequencia decrescente de n. A função soma todas as divisões
			return 1/a + (Ex6(n-1));
		}
	}
}
