package parttern.singleton.example1;

import java.io.*;
import java.util.*;
/**
 * ��ȡӦ�������ļ�
 */
public class AppConfig {
	/**
	 * ������������ļ��в���A��ֵ
	 */
	private String parameterA;
	/**
	 * ������������ļ��в���B��ֵ
	 */
	private String parameterB;
	
	public String getParameterA() {
		return parameterA;
	}
	public String getParameterB() {
		return parameterB;
	}
	/**
	 * ���췽��
	 */
	public AppConfig(){
		//���ö�ȡ�����ļ��ķ���
		readConfig();
	}
	/**
	 * ��ȡ�����ļ����������ļ��е����ݶ��������õ�������
	 */
	private void readConfig(){
		Properties p = new Properties(); 
		InputStream in = null;
		try {
			System.out.println("��ȡ �����ļ�һ��=============");
			in = AppConfig.class.getResourceAsStream("AppConfig.properties");
			p.load(in);
			//�������ļ��е����ݶ��������õ�������
			this.parameterA = p.getProperty("paramA");
			this.parameterB = p.getProperty("paramB");
		} catch (IOException e) {
			System.out.println("װ�������ļ������ˣ������ջ��Ϣ���£�");
			e.printStackTrace();
		}finally{
			try {
				in.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}
	
}
