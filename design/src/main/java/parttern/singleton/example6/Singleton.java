package parttern.singleton.example6;

//����ʽ
public class Singleton {
	//4������һ����̬�������洢�����õ���ʵ��
	//ֱ�������ﴴ����ʵ���������������ֻ֤�ᴴ��һ��
	private static Singleton instance = new Singleton();
	//1��˽�л����췽���������ڲ����ƴ���ʵ������Ŀ
	private Singleton(){		
	}
	
	//2������һ��������Ϊ�ͻ����ṩ��ʵ��
	//3�����������Ҫ������෽����Ҳ����Ҫ��static
	public static Singleton getInstance(){
		//5��ֱ��ʹ���Ѿ������õ�ʵ��
		return instance;
	}
	
	public static void main(String[] args) {
		for(int i=0;i<3;i++){
			System.out.println(Singleton.getInstance());
		}
	}
	
}

//��ʱ��ռ��Ͽ����Կռ任ʱ��
//���̰߳�ȫ�Ͽ�����ȫ��