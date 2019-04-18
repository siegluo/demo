package zookeeper.zookeeper.cluster;

import java.util.concurrent.CountDownLatch;

import org.apache.zookeeper.CreateMode;
import org.apache.zookeeper.WatchedEvent;
import org.apache.zookeeper.Watcher;
import org.apache.zookeeper.Watcher.Event.EventType;
import org.apache.zookeeper.Watcher.Event.KeeperState;
import org.apache.zookeeper.ZooDefs.Ids;
import org.apache.zookeeper.ZooKeeper;

public class Test {


	/** zookeeper地址 */
	static final String CONNECT_ADDR = "192.168.1.106:2181,192.168.1.107:2181,192.168.1.108:2181";
	/** session超时时间 */
	static final int SESSION_OUTTIME = 2000;//ms 
	/** 信号量，阻塞程序执行，用于等待zookeeper连接成功，发送成功信号 */
	static final CountDownLatch connectedSemaphore = new CountDownLatch(1);
	
	public static void main(String[] args) throws Exception{
		
		ZooKeeper zk = new ZooKeeper(CONNECT_ADDR, SESSION_OUTTIME, new Watcher(){
			@Override
			public void process(WatchedEvent event) {
				//获取事件的状态
				KeeperState keeperState = event.getState();
				EventType eventType = event.getType();
				//如果是建立连接
				if(KeeperState.SyncConnected == keeperState){
					if(EventType.None == eventType){
						//如果建立连接成功，则发送信号量，让后续阻塞程序向下执行
						connectedSemaphore.countDown();
						System.out.println("zk 建立连接");
					}
				}
			}
		});

		//进行阻塞
		connectedSemaphore.await();
		
//		//创建子节点
//		zk.create("/super/c1", "c1".getBytes(), Ids.OPEN_ACL_UNSAFE, CreateMode.PERSISTENT);
		//创建子节点
//		zk.create("/super/c2", "c2".getBytes(), Ids.OPEN_ACL_UNSAFE, CreateMode.PERSISTENT);
		//创建子节点
		zk.create("/super/c3", "c3".getBytes(), Ids.OPEN_ACL_UNSAFE, CreateMode.PERSISTENT);
		//创建子节点
//		zk.create("/super/c4", "c4".getBytes(), Ids.OPEN_ACL_UNSAFE, CreateMode.PERSISTENT);
		
//		zk.create("/super/c4/c44", "c44".getBytes(), Ids.OPEN_ACL_UNSAFE, CreateMode.PERSISTENT);
		
		//获取节点信息
//		byte[] data = zk.getData("/testRoot", false, null);
//		System.out.println(new String(data));
//		System.out.println(zk.getChildren("/testRoot", false));
		
		//修改节点的值
//		zk.setData("/super/c1", "modify c1".getBytes(), -1);
//		zk.setData("/super/c2", "modify c2".getBytes(), -1);
//		byte[] data = zk.getData("/super/c2", false, null);
//		System.out.println(new String(data));		
		
//		//判断节点是否存在
//		System.out.println(zk.exists("/super/c3", false));
//		//删除节点
//		zk.delete("/super/c3", -1);
		
		
		
		
		
		
		
		
		zk.close();
		
		
		
	}
}
