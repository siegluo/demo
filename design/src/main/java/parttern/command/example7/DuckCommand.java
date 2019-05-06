package parttern.command.example7;

import java.io.Serializable;

/**
 * ������󣬱�����Ѽ
 */
public class DuckCommand implements Command,Serializable{
	private CookApi cookApi = null;
	public void setCookApi(CookApi cookApi) {
		this.cookApi = cookApi;
	}
	private int tableNum;
	public DuckCommand(int tableNum){
		this.tableNum = tableNum;
	}
	public int getTableNum(){
		return this.tableNum;
	}
	
	public void execute() {
		this.cookApi.cook(tableNum,"������Ѽ");
	}
}
