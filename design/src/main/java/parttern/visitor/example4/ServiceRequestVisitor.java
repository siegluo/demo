package parttern.visitor.example4;
/**
 * ����ķ����ߣ�ʵ�ֿͻ������������Ĺ���
 */
public class ServiceRequestVisitor implements Visitor {
	public void visitEnterpriseCustomer(EnterpriseCustomer ec){
		//��ҵ�ͻ�����ľ����������
		System.out.println(ec.getName()+"��ҵ�����������");
	}
	public void visitPersonalCustomer(PersonalCustomer pc){
		//���˿ͻ�����ľ����������
		System.out.println("�ͻ�"+pc.getName()+"�����������");
	}
}