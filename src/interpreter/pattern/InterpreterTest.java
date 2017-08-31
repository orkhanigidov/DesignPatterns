package interpreter.pattern;

import java.util.ArrayList;
import java.util.List;

public class InterpreterTest {
	public static void main(String[] args) {
		
		Context context = new Context();
		context.setHexValue("ABCAAB");
		
		List<ITerminalExpression> list = new ArrayList<>();
		
		for(char letter : context.getHexValue().toCharArray()){
			switch (letter) {
			case 'A':
				list.add(new TerminalExpressionForA());
				break;
			case 'B':
				list.add(new TerminalExpressionForB());
				break;
			case 'C':
				list.add(new TerminalExpressionForC());
				break;
			default:
				break;
			}
		}
		
		for(ITerminalExpression exp : list){
			exp.interpret(context);
		}
		
		System.out.println(context.getOctalValue());
		
	}
	
}
