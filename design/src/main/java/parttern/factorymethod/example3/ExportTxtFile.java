package parttern.factorymethod.example3;
/**
 * �������ı��ļ���ʽ�Ķ���
 */
public class ExportTxtFile implements ExportFileApi{
	public boolean export(String data) {
		//��ʾ��һ�£�������Ҫ�����ļ�
		System.out.println("��������"+data+"���ı��ļ�");
		return true;
	}
}