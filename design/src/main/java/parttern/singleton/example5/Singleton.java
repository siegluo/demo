package parttern.singleton.example5;
//����ʽ
public class Singleton {
	//4������һ���������洢�����õ���ʵ��
	//5����Ϊ�������Ҫ�ھ�̬������ʹ�ã�������Ҫ����static����
	private static Singleton instance = null;
	
	//1��˽�л����췽���������ڲ����ƴ���ʵ������Ŀ
	private Singleton(){
	}
	
	//2������һ��������Ϊ�ͻ����ṩ��ʵ��
	//3�����������Ҫ������෽����Ҳ����Ҫ��static
	public static Singleton getInstance(){
		//6���жϴ洢ʵ���ı����Ƿ���ֵ
		//B
		if(instance == null){//B
			//6.1�����û�У��ʹ���һ����ʵ��������ֵ��ֵ���洢��ʵ���ı���
			//B
			//A
			instance = new Singleton();//A
		}
		return instance;
	}
	
	public static void main(String[] args) {
		for(int i=0;i<3;i++){
			System.out.println(Singleton.getInstance());
		}
	}
}

//��ʱ��ռ��Ͽ�����ʱ�任�ռ�
//���̰߳�ȫ�Ͽ�������ȫ��