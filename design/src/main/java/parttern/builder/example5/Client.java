package parttern.builder.example5;

public class Client {
	public static void main(String[] args) {
		//����������
		ConcreteBuilder builder = new ConcreteBuilder("001",12345L,67890L);
		//������Ҫ�����ݣ�Ȼ�󹹽����պ�ͬ����
		InsuranceContract contract = builder
				.setOtherData("test")
				.setCompanyName("cc")
				.build();
		
		//�������պ�ͬ����ķ���
		contract.someOperation();
	}
}
