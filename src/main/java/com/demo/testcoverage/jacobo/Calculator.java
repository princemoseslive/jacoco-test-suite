package com.demo.testcoverage.jacobo;

import javax.ejb.Stateless;

@Stateless
public class Calculator {

	public double add(double x, double y) {
		return x + y;
	}

}
