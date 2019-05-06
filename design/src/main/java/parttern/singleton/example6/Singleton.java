package parttern.singleton.example6;

//饿汉式
public class Singleton {
	//4：定义一个静态变量来存储创建好的类实例
	//直接在这里创建类实例，由虚拟机来保证只会创建一次
	private static Singleton instance = new Singleton();
	//1：私有化构造方法，好在内部控制创建实例的数目
	private Singleton(){		
	}
	
	//2：定义一个方法来为客户端提供类实例
	//3：这个方法需要定义成类方法，也就是要加static
	public static Singleton getInstance(){
		//5：直接使用已经创建好的实例
		return instance;
	}
	
	public static void main(String[] args) {
		for(int i=0;i<3;i++){
			System.out.println(Singleton.getInstance());
		}
	}
	
}

//从时间空间上看：以空间换时间
//从线程安全上看：安全的