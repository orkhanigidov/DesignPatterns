package interpreter.pattern;

public class TerminalExpressionForB implements ITerminalExpression {
	
	@Override
	public void interpret(Context context) {
		if(context.getHexValue().contains("B")){
			context.setOctalValue(context.getOctalValue() + 11);
		}
	}
}
