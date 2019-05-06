package parttern.simplefactory.example3;
/**
 * 工厂类，用来创造Api对象
 */
public class Factory {
	private Factory(){
		
	}
	/**
	 * 具体的创造Api对象的方法
	 * @return 创造好的Api对象
	 */
	public static Api createApi(){
		//主要用来实现  选择合适的实现类  来创建实例对象
		
		
		//由于只有一个实现，就不用条件判断了
		return new Impl();
	}
}
