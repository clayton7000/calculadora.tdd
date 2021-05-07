package com.calculadora.tdd;

public class Calculadora {

	public int somar(int[] valores) {
		int c=0;
		for(int i=0;i<valores.length;i++) {
			c+=valores[i];
		}
		return c;
	}
	
	public int subtrair(int[] valores) {
		int c=valores[0];
		for(int i=1;i<valores.length;i++) {
			c-=valores[i];
		}
		return c;
	}

	public int multiplicar(int[] valores) {
		int c=valores[0];
		for(int i=1;i<valores.length;i++) {
			c*=valores[i];
		}
		
		return c;
	}

	public int dividir(int[] valores){
		int c=valores[0];
		for(int i=1;i<valores.length;i++) {
			try {
			c/=valores[i];
			}catch (ArithmeticException e) {
				System.err.println("erro divizao por zero");
			}
		}
		
		return c;
	}

}
