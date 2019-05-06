package parttern.abstractfactory.example4;

public class Client {
	public static void main(String[] args) {
		//����װ������ʦ����
		ComputerEngineer engineer = new ComputerEngineer();
		//�ͻ�ѡ�񲢴�����Ҫʹ�õ�װ����������
		AbstractFactory schema = new Schema3();
		//����װ������ʦ�Լ�ѡ���װ����������װ������ʦ��װ����
		engineer.makeComputer(schema);
	}
}
