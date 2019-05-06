package parttern.chainofresponsibility.example4;

public class Client {
	public static void main(String[] args) {
		//��Ҫ��װְ����		
		Handler h1 = new GeneralManager();
		Handler h2 = new DepManager();
		Handler h3 = new ProjectManager();
		h1.setSuccessor(h2);
		h2.setSuccessor(h3);
		
		//��ʼ��������۲ͷ���
		String ret1 = h1.handleFeeRequest("С��", 300);
		System.out.println("the ret1="+ret1);
		String ret2 = h1.handleFeeRequest("С��", 600);
		System.out.println("the ret2="+ret2);
		String ret3 = h1.handleFeeRequest("С��", 1200);
		System.out.println("the ret3="+ret3);
		
		//��ʼ����������÷���
		h1.handlePreFeeRequest("С��", 3000);
		h1.handlePreFeeRequest("С��", 6000);
		h1.handlePreFeeRequest("С��", 32000);
	}
}
