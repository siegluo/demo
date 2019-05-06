package parttern.singleton.example8;
import java.util.*;
/**
 * ʹ�û�����ģ��ʵ�ֵ���
 */
public class Singleton {
	/**
	 * ����һ��ȱʡ��keyֵ��������ʶ�ڻ����еĴ��
	 */
	private final static String DEFAULT_KEY = "One";
	/**
	 * ����ʵ��������
	 */
	private static Map<String,Singleton> map = new HashMap<String,Singleton>();
	/**
	 * ˽�л����췽��
	 */
	private Singleton(){
		//
	}
	public static Singleton getInstance(){
		//�ȴӻ����л�ȡ
		Singleton instance = (Singleton)map.get(DEFAULT_KEY);
		//���û�У����½�һ����Ȼ�����ûػ�����
		if(instance==null){
			instance = new Singleton();
			map.put(DEFAULT_KEY, instance);
		}
		//����о�ֱ��ʹ��
		return instance;
	}
	
	public static void main(String[] args) {
		
		for(int i=0;i<3;i++){
			System.out.println(Singleton.getInstance());
		}
		
	}
}
