package parttern.facade.example5;
/**
 * ����������ϵͳ����۶���
 */
public class Facade implements FacadeApi{
	/**
	 * �ͻ�����Ҫ�ģ�һ���򵥵ĵ��ô������ɵĹ���
	 */
	public  void generate(){
		new Presentation().generate();
		new Business().generate();
		new DAO(2).generate();
	}
}
