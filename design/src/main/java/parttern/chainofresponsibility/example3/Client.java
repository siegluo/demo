package parttern.chainofresponsibility.example3;

public class Client {
	public static void main(String[] args) {
		//��Ҫ��װְ����		
		Handler h1 = new GeneralManager();
		Handler h2 = new DepManager();
		Handler h3 = new ProjectManager();
		
		h1.setSuccessor(h2);
		h2.setSuccessor(h3);
		
		//��ʼ����
		String ret1 = h1.handleFeeRequest("С��", 300);
		System.out.println("the ret1="+ret1);	
		String ret2 = h1.handleFeeRequest("С��", 300);
		System.out.println("the ret2="+ret2);	
		
		String ret3 = h1.handleFeeRequest("С��", 600);
		System.out.println("the ret3="+ret3);	
		String ret4 = h1.handleFeeRequest("С��", 600);
		System.out.println("the ret4="+ret4);	
		
		String ret5 = h1.handleFeeRequest("С��", 1200);	
		System.out.println("the ret5="+ret5);	
		String ret6 = h1.handleFeeRequest("С��", 1200);
		System.out.println("the ret6="+ret6);	
	}
}
