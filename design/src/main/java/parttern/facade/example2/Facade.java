package parttern.facade.example2;
/**
 * ��۶���
 */
public class Facade {
	/**
	 * ʾ�ⷽ��������ͻ���Ҫ�Ĺ���
	 */
	public void test(){
		//���ڲ�ʵ�ֵ�ʱ�򣬿��ܻ���õ��ڲ��Ķ��ģ��
		AModuleApi a = new AModuleImpl();
		a.testA();
		BModuleApi b = new BModuleImpl();
		b.testB();
		CModuleApi c = new CModuleImpl();
		c.testC();
	}
}
