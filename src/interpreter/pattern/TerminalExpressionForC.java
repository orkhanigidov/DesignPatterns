package interpreter.pattern;

public class TerminalExpressionForC implements ITerminalExpression {

	@Override
	public void interpret(Context context) {
		if(context.getHexValue().contains("C")){
			context.setOctalValue(context.getOctalValue() + 12);
		}
	}

}
