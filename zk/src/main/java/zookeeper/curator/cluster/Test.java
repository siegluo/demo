package zookeeper.curator.cluster;

import org.apache.curator.RetryPolicy;
import org.apache.curator.framework.CuratorFramework;
import org.apache.curator.framework.CuratorFrameworkFactory;
import org.apache.curator.retry.ExponentialBackoffRetry;
import org.apache.zookeeper.CreateMode;

public class Test {

	/** zookeeper地址 */
	static final String CONNECT_ADDR = "192.168.1.171:2181,192.168.1.172:2181,192.168.1.173:2181";
	/** session超时时间 */
	static final int SESSION_OUTTIME = 5000;//ms 
	
	public static void main(String[] args) throws Exception {
		
		//1 重试策略：初试时间为1s 重试10次
		RetryPolicy retryPolicy = new ExponentialBackoffRetry(1000, 10);
		//2 通过工厂创建连接
		CuratorFramework cf = CuratorFrameworkFactory.builder()
					.connectString(CONNECT_ADDR)
					.sessionTimeoutMs(SESSION_OUTTIME)
					.retryPolicy(retryPolicy)
					.build();
		//3 开启连接
		cf.start();

		
		Thread.sleep(3000);
		System.out.println(cf.getChildren().forPath("/super").get(0));
		
		//4 创建节点
//		Thread.sleep(1000);
		cf.create().creatingParentsIfNeeded().withMode(CreateMode.PERSISTENT).forPath("/super/c1","c1内容".getBytes());
		Thread.sleep(1000);
//		cf.create().creatingParentsIfNeeded().withMode(CreateMode.PERSISTENT).forPath("/super/c2","c2内容".getBytes());
//		Thread.sleep(1000);
//		
//		
//		
//		//5 读取节点
//		Thread.sleep(1000);
//		String ret1 = new String(cf.getData().forPath("/super/c1"));
//		System.out.println(ret1);
//
//		
//		//6 修改节点
		Thread.sleep(1000);
		cf.setData().forPath("/super/c2", "修改的新c2内容".getBytes());
		String ret2 = new String(cf.getData().forPath("/super/c2"));
		System.out.println(ret2);	
//		
//
//		
//		//7 删除节点
//		Thread.sleep(1000);
//		cf.delete().forPath("/super/c1");
		
		
		
		
	}
}
