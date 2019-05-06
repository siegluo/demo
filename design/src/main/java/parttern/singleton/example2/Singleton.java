package parttern.singleton.example2;

/**
 * ����ʾ��   ����ʽ
 */
public class Singleton {
	/**
	 * ����һ���������洢�����õ���ʵ��
	 */
	private static Singleton uniqueInstance = null;
	/**
	 * ˽�л����췽���������ڲ����ƴ���ʵ������Ŀ
	 */
	private Singleton(){
		//
	}
	/**
	 * ����һ��������Ϊ�ͻ����ṩ��ʵ��
	 * @return һ��Singleton��ʵ��
	 */
	public static synchronized Singleton getInstance(){
		//�жϴ洢ʵ���ı����Ƿ���ֵ
		if(uniqueInstance == null){
			//���û�У��ʹ���һ����ʵ��������ֵ��ֵ���洢��ʵ���ı���
			uniqueInstance = new Singleton();
		}
		//�����ֵ���Ǿ�ֱ��ʹ��
		return uniqueInstance;
	}
	/**
	 * ʾ�ⷽ���������������Լ��Ĳ���
	 */
	public void singletonOperation(){
		//���ܴ���
	}
	/**
	 * ʾ�����ԣ������������Լ�������
	 */
	private String singletonData;
	/**
	 * ʾ�ⷽ�������ⲿͨ����Щ�������������Ե�ֵ
	 * @return ���Ե�ֵ
	 */
	public String getSingletonData(){
		return singletonData;
	}
}
