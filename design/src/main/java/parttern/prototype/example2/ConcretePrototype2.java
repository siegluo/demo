package parttern.prototype.example2;

/**
 * ��¡�ľ���ʵ�ֶ���
 */
public class ConcretePrototype2 implements Prototype {
	public Prototype clone() {
		//��򵥵Ŀ�¡���½�һ�������������û�����ԣ��Ͳ�ȥ����ֵ��
		Prototype prototype = new ConcretePrototype2();
		return prototype;
	}
}