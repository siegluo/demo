package parttern.factorymethod.example3;
/**
 * 实现导出数据的业务功能对象
 */
public abstract class ExportOperate {
	public ABC createABC(String name){
		return new ABC(name,factoryMethod());
	}
	
	/**
	 * 导出文件
	 * @param data 需要保存的数据
	 * @return 是否成功导出文件
	 */
	public boolean export(String data){
		//先完成各种导出数据前的准备工作
		//比如进行数据校验
		System.out.println("now 进行数据校验");
		//比如进行数据转换
		System.out.println("now 进行数据转换");
		//比如进行数据格式的封装
		System.out.println("now 进行数据格式的封装");
		
		//然后才真正的去导出
		
		//使用工厂方法
		ExportFileApi api = factoryMethod();
		
		return api.export(data);
	}
	/**
	 * 工厂方法，创建导出的文件对象的接口对象
	 * @return 导出的文件对象的接口对象
	 */
	protected abstract ExportFileApi factoryMethod();
	
	//既要约束子类的行为，又要为子类提供公共的功能
}
