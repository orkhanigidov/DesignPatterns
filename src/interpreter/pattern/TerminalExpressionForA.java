package interpreter.pattern;

public class TerminalExpressionForA implements ITerminalExpression {
	
	@Override
	public void interpret(Context context) {
		if(context.getHexValue().contains("A")){
			context.setOctalValue(context.getOctalValue() + 10);
		}
	}
	
}
