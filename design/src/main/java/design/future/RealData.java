package design.future;

public class RealData implements Data{

	private String result ;
	
	public RealData (String queryStr){
		System.out.println("根据" + queryStr + "进行查询，这是一个很耗时的操作..");
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println("操作完毕，获取结果");
		result = "查询结果";
	}
	
	@Override
	public String getRequest() {
		return result;
	}

}
