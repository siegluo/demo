package parttern.singleton.example4;

public class Client {
	public static void main(String[] args) {
		//������ȡӦ�����õĶ���
		
		for(int i=0;i<5;i++){
			AppConfig config = AppConfig.getInstance();
			
			String paramA = config.getParameterA();
			String paramB = config.getParameterB();
			
			System.out.println("i="+i+"paramA="+paramA+",paramB="+paramB);
		}
	}
}
