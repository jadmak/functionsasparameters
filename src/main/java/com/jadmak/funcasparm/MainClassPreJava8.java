package com.jadmak.funcasparm;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class MainClassPreJava8 {

	public interface JCommand {

		int doOperation(Operands ops);
	}

	static Logger LOGGER = LoggerFactory.getLogger(MainClassPreJava8.class);

	public static void main(String[] args) {

		final Operation oper = new Operation();

		JCommand add = new JCommand() {

			@Override
			public int doOperation(Operands ops) {

				return oper.add(ops);
			}
		};

		JCommand subtract = new JCommand() {

			@Override
			public int doOperation(Operands ops) {

				return oper.subtract(ops);
			}
		};

		JCommand multiply = new JCommand() {
			@Override
			public int doOperation(Operands ops) {

				return oper.multiply(ops);
			}
		};

		Operands op = new Operands(10, 23);
		LOGGER.debug("Addition");
		doOperationAndLog(op, add);
		LOGGER.debug("Subtraction");
		doOperationAndLog(op, subtract);
		LOGGER.debug("Multiplication");
		doOperationAndLog(op, multiply);
	}

	public static int doOperationAndLog(Operands ops, JCommand command) {

		LOGGER.debug(String.format("operand 1:%d , operand 2:%d", ops.getA(), ops.getB()));
		int result = command.doOperation(ops);
		LOGGER.debug(String.format("result is %d", result));

		return result;

	}

}
