package parttern.command.example7;
/**
 * ����Ĺ����࣬ͨ�������ú���ĳ�ʦ��������״̬
 */
public class CookManager {
	/**
	 * ���������Ƿ���Ҫ������ʦ������Ѿ��������˾Ͳ�Ҫ��ִ����
	 */
	private static boolean runFlag = false;
	public static void runCookManager(){
		if(!runFlag){
			runFlag = true;
			//������λ��ʦ
			HotCook cook1 = new HotCook("����");
			HotCook cook2 = new HotCook("����");
			HotCook cook3 = new HotCook("����");
			//�������ǵ��߳�
			Thread t1 = new Thread(cook1);
			t1.start();
			Thread t2 = new Thread(cook2);
			t2.start();
			Thread t3 = new Thread(cook3);
			t3.start();
		}
	}
}
