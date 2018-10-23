//import org.springframework.beans.factory.BeanCreationException;
//import org.springframework.beans.factory.ObjectFactory;
//import org.springframework.beans.factory.config.SingletonBeanRegistry;
//import org.springframework.core.SimpleAliasRegistry;
//import org.springframework.util.Assert;
//
//import java.util.Map;
//import java.util.concurrent.ConcurrentHashMap;
//
//import static sun.tools.jconsole.inspector.XObject.NULL_OBJECT;
//
//public class DefaultSingletonBeanRegistry extends SimpleAliasRegistry implements SingletonBeanRegistry {
//
//	/** 通过 Map 实现单例注册表 */
//	private final Map<String, Object> singletonObjects = new ConcurrentHashMap<String, Object>(64);
//
//	@Override
//	public void registerSingleton(String beanName, Object singletonObject) throws IllegalStateException {
//		Assert.notNull(beanName, "'beanName' must not be null");
//		synchronized (this.singletonObjects) {
//			Object oldObject = this.singletonObjects.get(beanName);
//			if (oldObject != null) {
//				// ...忽略代码
//			}
//			addSingleton(beanName, singletonObject);
//		}
//	}
//
//	protected void addSingleton(String beanName, Object singletonObject) {
//		synchronized (this.singletonObjects) {
//			this.singletonObjects.put(beanName, (singletonObject != null ? singletonObject : NULL_OBJECT));
//
//		}
//	}
//
//	protected Object getSingleton(String beanName, boolean allowEarlyReference) {
//		// 检查缓存中是否存在实例
//		Object singletonObject = this.singletonObjects.get(beanName);
//		if (singletonObject == null && isSingletonCurrentlyInCreation(beanName)) {
//			// 如果 singletonObject 为空，添加 synchronized 线程锁进行处理
//			synchronized (this.singletonObjects) {
//				// 如果该 bean 正在加载，则不处理
//				singletonObject = this.earlySingletonObjects.get(beanName);
//				if (singletonObject == null && allowEarlyReference) {
//					// ...忽略代码
//				}
//			}
//		}
//		return (singletonObject != NULL_OBJECT ? singletonObject : null);
//	}
//
//	public Object getSingleton(String beanName, ObjectFactory<?> singletonFactory) {
//		Assert.notNull(beanName, "'beanName' must not be null");
//		synchronized (this.singletonObjects) {
//		    // 检查缓存中是否存在实例
//			Object singletonObject = this.singletonObjects.get(beanName);
//			if (singletonObject == null) {
//				// ...忽略代码
//				try {
//					singletonObject = singletonFactory.getObject();
//				}
//				catch (BeanCreationException ex) {
//					// ...忽略代码
//				}
//				finally {
//					// ...忽略代码
//				}
//				// 如果实例对象在不存在，我们注册到单例注册表中。
//				addSingleton(beanName, singletonObject);
//			}
//			return (singletonObject != NULL_OBJECT ? singletonObject : null);
//		}
//	}
//}
