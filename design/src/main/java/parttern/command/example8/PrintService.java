package parttern.command.example8;

public class PrintService implements Command{
	/**
	 * Ҫ���������
	 */
	private String str = "";
	/**
	 * ���췽��������Ҫ���������
	 * @param s Ҫ���������
	 */
	public PrintService(String s){
		str = s;
	}
	
	public void execute() {
		System.out.println("��ӡ������Ϊ="+str);
	}
}