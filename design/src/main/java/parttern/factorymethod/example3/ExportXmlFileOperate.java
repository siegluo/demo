package parttern.factorymethod.example3;
/**
 * �������ı��ļ���ʽ�Ķ���
 */
public class ExportXmlFileOperate extends ExportOperate{

	@Override
	protected ExportFileApi factoryMethod() {
		return new ExportXmlFile();
	}	
}
