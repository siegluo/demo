package parttern.singleton.example12;

/**
 * ʹ��ö����ʵ�ֵ���ģʽ��ʾ��
 */
public enum Singleton {	
	/**
	 * ����һ��ö�ٵ�Ԫ��,���ʹ�����Singleton��һ��ʵ��
	 */
	uniqueInstance;
	
	/**
	 * ʾ�ⷽ���������������Լ��Ĳ���
	 */
	public void singletonOperation(){
		//���ܴ���
		System.out.println("aa=="+Singleton.uniqueInstance.hashCode());
	}
}