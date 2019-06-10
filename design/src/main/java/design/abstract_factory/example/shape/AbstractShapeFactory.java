package design.abstract_factory.example.shape;

/**
 * <h3>概要:</h3><p>AbstractShapeFactory</p>
 * <h3>功能:</h3><p>抽象工厂</p>
 * <h3>履历:</h3>
 * <li>2017年5月29日  v0.1 版本内容: 新建</li>
 */
public abstract class AbstractShapeFactory {	
	public abstract Circle createCircle();
	public abstract Rectangle createRectangle();
	public abstract Square createSquare();
}
