package parttern.interpreter.example2;

import java.util.ArrayList;
import java.util.List;

/**
 * ���ս�����ʽ===�൱����϶���
 */
public class NonterminalExpression extends AbstractExpression{
	private List<AbstractExpression> list = new ArrayList<AbstractExpression>();
	
	public void addAbstractExpression(AbstractExpression ae){
		list.add(ae);
	}
	
	public void interpret(Context ctx) {
		//ʵ�����﷨�����еķ��ս��������Ľ��Ͳ���
	}
}