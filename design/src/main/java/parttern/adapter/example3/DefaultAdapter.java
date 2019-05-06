package parttern.adapter.example3;

import java.util.List;

public class DefaultAdapter implements LogDbOperateApi{

	@Override
	public void createLog(LogModel lm) {
		System.out.println("DB createLog===========");
	}

	@Override
	public void updateLog(LogModel lm) {
		System.out.println("DB updateLog===========");
	}

	@Override
	public void removeLog(LogModel lm) {
		
	}

	@Override
	public List<LogModel> getAllLog() {
		return null;
	}

}
