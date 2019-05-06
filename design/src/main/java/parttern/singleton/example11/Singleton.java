package parttern.singleton.example11;


public class Singleton {
	/**
	 * �༶���ڲ��࣬Ҳ���Ǿ�̬�ĳ�Աʽ�ڲ��࣬���ڲ����ʵ�����ⲿ���ʵ��û�а󶨹�ϵ��
	 * ����ֻ�б����õ��Ż�װ�أ��Ӷ�ʵ�����ӳټ���
	 */
	private static class SingletonHolder{
		/**
		 * ��̬��ʼ��������JVM����֤�̰߳�ȫ
		 */
		private static Singleton instance = new Singleton();
	}
	/**
	 * ˽�л����췽��
	 */
	private Singleton(){
	}
	
	public static  Singleton getInstance(){
		return SingletonHolder.instance;
	}
}