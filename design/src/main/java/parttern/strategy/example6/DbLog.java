package parttern.strategy.example6;
/**
 * ����־��¼�����ݿ�
 */
public class DbLog implements LogStrategy{
	public void log(String msg) {		
		//�������
		if(msg!=null && msg.trim().length()>5){
			int a = 5/0;
		}
		System.out.println("���ڰ� '"+msg+"' ��¼�����ݿ���");
	}
}
