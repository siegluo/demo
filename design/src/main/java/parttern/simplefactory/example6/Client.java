package parttern.simplefactory.example6;
/**
 * �ͻ��ˣ�����ʹ��Api�ӿ�
 */
public class Client {
	public static void main(String[] args) {
		//��Ҫ�ı䣬û��new Impl()�ˣ�ȡ����֮Factory.createApi()
		//ע�����ﴫ�ݵĲ������޸Ĳ����Ϳ����޸���Ϊ�����Կ���
		
		for(int i=0;i<5;i++){
			Api api = Factory.createApi();
			api.test1("��������Ҫ���ţ�ֻ�Ǹ����Զ��ѣ�");
		}
			
	}
}
