package design.factory_method.sample;

/**
 * <h3>概要:</h3><p>ConcreteProduct</p>
 * <h3>功能:</h3><p>具体产品</p>
 * <h3>履历:</h3>
 * <li>2017年5月29日  v0.1 版本内容: 新建</li>
 * @since 0.1
 */
public class ConcreteProduct extends Product{
	@Override
    public void method(){
		System.out.println("method");
	}
}
