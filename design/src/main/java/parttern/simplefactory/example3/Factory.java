package parttern.simplefactory.example3;
/**
 * �����࣬��������Api����
 */
public class Factory {
	private Factory(){
		
	}
	/**
	 * ����Ĵ���Api����ķ���
	 * @return ����õ�Api����
	 */
	public static Api createApi(){
		//��Ҫ����ʵ��  ѡ����ʵ�ʵ����  ������ʵ������
		
		
		//����ֻ��һ��ʵ�֣��Ͳ��������ж���
		return new Impl();
	}
}
