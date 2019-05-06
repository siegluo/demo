package parttern.factorymethod.example1;
/**
 * 导出成文本文件格式的对象
 */
public class ExportXmlFile implements ExportFileApi{
	public boolean export(String data) {
		//简单示意一下，这里需要操作文件
		System.out.println("导出数据"+data+"到xml文件");
		return true;
	}
}
