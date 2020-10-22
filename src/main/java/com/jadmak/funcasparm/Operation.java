package com.jadmak.funcasparm;

public class Operation {

	public int add(Operands ops) {
		return ops.getA() + ops.getB();
	}
	
	public int subtract(Operands ops) {
		return ops.getA() - ops.getB();
	}
	
	public int multiply(Operands ops) {
		return ops.getA() * ops.getB();
	}
}
