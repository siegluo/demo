package parttern.bridge.example6;
/**
 * ��վ�ڶ���Ϣ�ķ�ʽ������Ϣ
 */
public  class MessageSMS implements MessageImplementor{

	public void send(String message, String toUser) {
		System.out.println("ʹ��վ�ڶ���Ϣ�ķ�ʽ��������Ϣ'"+message+"'��"+toUser);
	}
}
