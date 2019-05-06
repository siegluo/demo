package parttern.factorymethod.example3;

public class ABC {
	private String name = "";
	private ExportFileApi api = null;
	
	public ABC(String name,ExportFileApi api){
		this.name = name;
		this.api= api;
	}
	
	public void test(){
		System.out.println("name="+name);
		this.api.export("ABC");
	}
}
