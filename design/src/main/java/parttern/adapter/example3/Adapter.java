package parttern.adapter.example3;

import java.util.List;

/**
 * 适配器对象，把记录日志到文件的功能适配成第二版需要的增删改查的功能
 */
public class Adapter  implements LogDbOperateApi{
	//优先使用对象组合，而不是使用对象继承
	
	/**
	 * 持有需要被适配的接口对象
	 */
	private LogFileOperateApi adaptee;
	
	private TimeUtil adaptee2 = null;
	/**
	 * 构造方法，传入需要被适配的对象
	 * @param adaptee 需要被适配的对象
	 */
	public Adapter(LogFileOperateApi adaptee,TimeUtil times) {
		this.adaptee = adaptee;
		this.adaptee2 = times;
	}
	
	public void createLog(LogModel lm) {
		this.adaptee2.begin();
		//1：先读取文件的内容
		List<LogModel> list = adaptee.readLogFile();
		//2：加入新的日志对象
		list.add(lm);
		//3：重新写入文件
		adaptee.writeLogFile(list);
		this.adaptee2.end();
		this.adaptee2.show();
	}

	public List<LogModel> getAllLog() {
		return adaptee.readLogFile();
	}

	public void removeLog(LogModel lm) {
		//1：先读取文件的内容
		List<LogModel> list = adaptee.readLogFile();
		//2：删除相应的日志对象
		list.remove(lm);
		//3：重新写入文件
		adaptee.writeLogFile(list);
	}

	public void updateLog(LogModel lm) {
		//1：先读取文件的内容
		List<LogModel> list = adaptee.readLogFile();
		//2：修改相应的日志对象
		for(int i=0;i<list.size();i++){
			if(list.get(i).getLogId().equals(lm.getLogId())){
				list.set(i, lm);
				break;
			}
		}
		//3：重新写入文件
		adaptee.writeLogFile(list);
	}
}
