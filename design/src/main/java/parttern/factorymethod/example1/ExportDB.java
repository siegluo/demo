package parttern.factorymethod.example1;
/**
 * ���������ݿⱸ���ļ���ʽ�Ķ���
 */
public class ExportDB implements ExportFileApi{
	public boolean export(String data) {
		//��ʾ��һ�£�������Ҫ�������ݿ���ļ�
		System.out.println("��������"+data+"�����ݿⱸ���ļ�");
		return true;
	}
}
