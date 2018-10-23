package com.example.demo.design.singleton.example.resource;

/**
 * <h3>概要:</h3><p>Resource</p>
 * <h3>功能:</h3><p>单例模式 资源类</p>
 * <h3>履历:</h3>
 * <li>2017年1月19日  v0.1 版本内容: 新建</li>
 * @since 0.1
 */
public class Resource {
    
	private int id = 0;
	
	private static Resource[] resource = new Resource[]{
	    new Resource(1),
	    new Resource(2)
	};
	
	private Resource(int id){
	    this.id = id;
	}
	
	public static Resource getInstance(int id){
		return resource[id];
	}

    @Override
    public String toString() {
        return "Resource [" + id + "]";
    }
}