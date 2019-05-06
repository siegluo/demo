package parttern.visitor.example5;
/**
 * ����ķ����ߣ�ʵ�֣������������ƣ�����϶��������ǰ�����"�ڵ㣺"��
 * ��Ҷ�Ӷ��������ǰ�����"Ҷ�ӣ�"
*/
public class PrintNameVisitor implements Visitor {
	public void visitComposite(Composite composite) {
		//���ʵ���϶��������
		System.out.println("�ڵ�1��"+composite.getName());
	}
	public void visitLeaf(Leaf leaf) {
		//���ʵ�Ҷ�Ӷ��������		
		System.out.println("Ҷ��2��"+leaf.getName());
	}
}
