package parttern.factorymethod.example3;
/**
 * 导出成文本文件格式的对象
 */
public class ExportXmlFileOperate extends ExportOperate{

	@Override
	protected ExportFileApi factoryMethod() {
		return new ExportXmlFile();
	}	
}
