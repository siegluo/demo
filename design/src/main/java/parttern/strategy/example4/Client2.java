package parttern.strategy.example4;

public class Client2 {
	public static void main(String[] args) {
		//1��ѡ�񲢴�����Ҫʹ�õĲ��Զ���
		Strategy strategy = new CooperateCustomerStrategy();
		//2������������
		Price ctx = new Price(strategy);
		
		//3�����㱨��
		double quote = ctx.quote(1000);
		System.out.println("��ͻ����ۣ�"+quote);
	}
}
