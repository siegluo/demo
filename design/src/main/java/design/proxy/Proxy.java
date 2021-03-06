package design.proxy;

/**
 * <h3>概要:</h3><p>Proxy</p>
 * <h3>功能:</h3><p>代理类</p>
 * <h3>履历:</h3>
 * <li>2017年6月20日  v0.1 版本内容: 新建</li>
 */
public class Proxy extends Subject {

    private RealSubject realSubject = new RealSubject();

    @Override
    public void request() {
        realSubject.request();
    }
}