package parttern.factorymethod.example1;
/**
 * �������ı��ļ���ʽ�Ķ���
 */
public class ExportXmlFile implements ExportFileApi{
	public boolean export(String data) {
		//��ʾ��һ�£�������Ҫ�����ļ�
		System.out.println("��������"+data+"��xml�ļ�");
		return true;
	}
}
