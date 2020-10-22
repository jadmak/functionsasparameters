package com.jadmak.funcasparm;

import java.util.function.Function;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class MainClassJava8 {

	static Logger LOGGER = LoggerFactory.getLogger(MainClassJava8.class);

	public static void main(String[] args) {

		final Operation oper = new Operation();

		Function<Operands, Integer> add = (Operands ops) -> {
			return oper.add(ops);
		};
		Function<Operands, Integer> subtract = (Operands ops) -> {
			return oper.subtract(ops);
		};
		Function<Operands, Integer> multiply = (Operands ops) -> {
			return oper.multiply(ops);
		};
 
		
		
		Operands op = new Operands(10, 23);
		LOGGER.debug("Addition");
		doOperationAndLog(op, add);
		LOGGER.debug("Subtraction");
		doOperationAndLog(op, subtract);
		LOGGER.debug("Multiplication");
		doOperationAndLog(op, multiply);
	}

	public static int doOperationAndLog(Operands ops, Function<Operands, Integer> oper) {

		LOGGER.debug(String.format("operand 1:%d , operand 2:%d", ops.getA(), ops.getB()));
		int result = oper.apply(ops);
		LOGGER.debug(String.format("result is %d", result));

		return result;

	}

}
