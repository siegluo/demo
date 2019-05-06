package parttern.interpreter.example5;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;

import org.w3c.dom.Document;
import org.w3c.dom.Element;

public class Client {
	public static void main(String[] args) throws Exception {
		//׼��������
		Context c = new Context("InterpreterTest.xml");
		//ͨ����������ȡ�����﷨��
		ReadXmlExpression re = Parser.parse("root/a/b/c");
		
		
		//�����������ȡ����ֵ
		String ss[] = re.interpret(c);
		for (String s : ss) {
			System.out.println("d������idֵ��=" + s);
		}
		
		//���Ҫʹ��ͬһ�������ģ��������н�������Ҫ���³�ʼ�������Ķ���
		c.reInit();
		ReadXmlExpression re2 = Parser.parse("root/a/e/d$");
		//�����������ȡ����ֵ
		String ss2[] = re2.interpret(c);
		for (String s : ss2) {
			System.out.println("d��ֵ��=" + s);
		}
	}
}