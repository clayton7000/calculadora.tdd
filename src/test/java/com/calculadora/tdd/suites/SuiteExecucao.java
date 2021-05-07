package com.calculadora.tdd.suites;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

import com.calculadora.tdd.CalculadoraTest;

@RunWith(Suite.class)
@SuiteClasses({
	CalculadoraTest.class
})
public class SuiteExecucao {

}
