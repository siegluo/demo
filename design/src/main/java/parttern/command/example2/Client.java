package parttern.command.example2;

public class Client {
	public static void main(String[] args) {
		//1���������������ʵ������������൱������װ������
		//�ѻ����ϰ�ť�������߲�ӵ������ϡ�
		MainBoardApi mainBoard = new MsiMainBoard();
		OpenCommand openCommand = new OpenCommand(mainBoard);
		
		
		//�����Ŀͻ��˲���
		
		//2��Ϊ�����ϵİ�ť���ö�Ӧ������ð�ť֪���ø�ʲô
		Box box = new Box();
		box.setOpenCommand(openCommand);
		
		//3��Ȼ��ģ�ⰴ�»����ϵİ�ť
		box.openButtonPressed();
	}
}