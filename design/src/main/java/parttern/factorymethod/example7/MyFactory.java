package parttern.factorymethod.example7;

public class MyFactory {
	private MyFactory(){
		
	}
	public static ExportFileApi factoryMethod(int type){
		ExportFileApi api = null;
		//根据类型来选择究竟要创建哪一种导出文件对象
		if(type==1){
			api = new ExportTxtFile();
		}else if(type==2){
			api = new ExportDB();
		}
		return api;
	}
}
