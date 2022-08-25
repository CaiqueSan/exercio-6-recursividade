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
		// condi��o de parada: se o valor for menor que 2 n�o ser� mais poss�vel realizar a fra��o, que se inicia em 1/2
		// ent�o � retornado 1 para que seja somado aos demais valores
			return 1;
		else {
			float a = n;
			while (x >= 2) {
				a = a * (x-1);
				x--;
			}
			// a fun��o calcula o fatorial de n atr�ves de um la�o de repeti��o, divide 1 pelo fatorial e chama a si mesma enviado n-1 como
			// parametro, assim os fatoriais e as divis�es s�o calculadas na sequencia decrescente de n. A fun��o soma todas as divis�es
			return 1/a + (Ex6(n-1));
		}
	}
}
