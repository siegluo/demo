package parttern.singleton.example7;
import java.util.*;
/**
 * Java中缓存的基本实现示例
 */
public class JavaCache {
	/**
	 * 缓存数据的容器，定义成Map是方便访问，直接根据Key就可以获取Value了
	 * key选用String是为了简单，方便演示
	 */
	private Map<String,Object> map = new HashMap<String,Object>();
	/**
	 * 从缓存中获取值
	 * @param key 设置时候的key值
	 * @return key对应的Value值
	 */
	public Object getValue(String key){
		//先从缓存里面取值
		Object obj = map.get(key);
		//判断缓存里面是否有值
		if(obj == null){
			//如果没有，那么就去获取相应的数据，比如读取数据库或者文件
			//这里只是演示，所以直接写个假的值
			obj = key+",value";
			//把获取的值设置回到缓存里面
			map.put(key, obj);
		}
		//如果有值了，就直接返回使用
		return obj;
	}
	
	//1:定义一个存放缓存数据的容器
	
	//2：从缓存中获取数据的做法
	
	//2.1：先从缓存里面取值
	//2.2：判断缓存里面是否有值
	//2.3：如果有值了，就直接使用这个值
	//2.4：如果没有，那么就去获取相应的数据，或者是创建相应的对象
	//2.4.1：把获取的值设置回到缓存里面
	
	//web开发 Scope===〉就是数据的缓存范围
	//<jsp:useBean name="aa" class="cn.javass.AModel" scope="request">
//	Object obj = request.getAttribute("aa");
//	AModel am = null;
//	if(obj==null){
//		am = new AModel();
//		request.setAttribute("aa",am);
//	}else{
//		am = (AModel)obj
//	}
	
	
}
