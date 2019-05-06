package parttern.builder.example5;

public class Client {
	public static void main(String[] args) {
		//创建构建器
		ConcreteBuilder builder = new ConcreteBuilder("001",12345L,67890L);
		//设置需要的数据，然后构建保险合同对象
		InsuranceContract contract = builder
				.setOtherData("test")
				.setCompanyName("cc")
				.build();
		
		//操作保险合同对象的方法
		contract.someOperation();
	}
}
