package parttern.facade.example3;
/**
 * 代码生成子系统的外观对象
 */
public class Facade {
	private Facade(){
		
	}
	/**
	 * 客户端需要的，一个简单的调用代码生成的功能
	 */
	public static void generate(){
		new Presentation().generate();
		new Business().generate();
		new DAO(2).generate();
	}
}
