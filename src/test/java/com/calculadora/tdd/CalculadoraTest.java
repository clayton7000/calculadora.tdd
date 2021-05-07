package com.calculadora.tdd;

import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;

public class CalculadoraTest {

	public static Calculadora calculadora;
	@BeforeClass
	public static void setup() {
		calculadora=new Calculadora();
	}
	@Test
	public void somaDoisValores() {
		
		int a=7;
		int b=5;		
		int[] valores= {a,b};
		Assert.assertEquals(12, calculadora.somar(valores));
	}
	
	@Test
	public void somaTresValores() {
		
		int a=2;
		int b=3;
		int c=5;
		int[] valores= {a,b,c};
		Assert.assertEquals(10, calculadora.somar(valores));
	}
	
	@Test
	public void subtrairTresValores() {
		
		int a=7;
		int b=5;
		int c=1;
		int[] valores= {a,b,c};
		Assert.assertEquals(1, calculadora.subtrair(valores));
	}
	
	@Test
	public void multiplicarDoisValores() {
		
		int a=7;
		int b=5;		
		int[] valores= {a,b};
		Assert.assertEquals(35, calculadora.multiplicar(valores));
	}
	
	
	@Test
	public void dividirTresValores() {
		
		int a=10;
		int b=2;
		int c=5;
		int[] valores= {a,b,c};
		Assert.assertEquals(1, calculadora.dividir(valores));
	}
	
	@Test
	public void dividirPorZeroValores() {
		
		int a=10;
		int b=0;		
		int[] valores= {a,b};
		calculadora.dividir(valores);
	}
}
