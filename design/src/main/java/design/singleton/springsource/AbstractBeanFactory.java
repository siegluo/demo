package design.singleton.springsource;//import org.springframework.beans.BeansException;
//import org.springframework.beans.factory.ObjectFactory;
//import org.springframework.beans.factory.config.ConfigurableBeanFactory;
//import org.springframework.beans.factory.support.FactoryBeanRegistrySupport;
//
//import static org.springframework.beans.factory.BeanFactoryUtils.transformedBeanName;
//import static org.springframework.cglib.proxy.Mixin.createBean;
//
//public abstract class AbstractBeanFactory extends FactoryBeanRegistrySupport implements ConfigurableBeanFactory {
//
//	@SuppressWarnings("unchecked")
//	protected <T> T doGetBean(
//			final String name, final Class<T> requiredType, final Object[] args, boolean typeCheckOnly)
//			throws BeansException {
//        // 对 Bean 的 name 进行处理，防止非法字符
//		final String beanName = transformedBeanName(name);
//		Object bean;
//		// 从单例注册表中检查是否存在单例缓存
//		Object sharedInstance = getSingleton(beanName);
//		if (sharedInstance != null && args == null) {
//			// ...忽略代码
//			// 返回缓存实例
//			bean = getObjectForBeanInstance(sharedInstance, name, beanName, null);
//		}
//		else {
//			// ...忽略代码
//			try {
//				// ...忽略代码
//
//				// 单例模式，处理分支
//				if (mbd.isSingleton()) {
//					sharedInstance = getSingleton(beanName, new ObjectFactory<Object>() {
//						@Override
//						public Object getObject() throws BeansException {
//							try {
//								return createBean(beanName, mbd, args);
//							}
//							catch (BeansException ex) {
//								// ...忽略代码
//							}
//						}
//					});
//					bean = getObjectForBeanInstance(sharedInstance, name, beanName, mbd);
//				}
//				// 原型模式，处理分支
//				else if (mbd.isPrototype()) {
//
//				}
//			    // 其他
//				else {
//
//				}
//			}
//			catch (BeansException ex) {
//				// ...忽略代码
//			}
//		}
//		return (T) bean;
//	}
//}