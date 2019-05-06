package parttern.visitor.example6;
/**
 * ����ķ����ߣ�ʵ�֣������������ƣ�����϶��������ǰ�����"�ڵ㣺"��
 * ��Ҷ�Ӷ��������ǰ�����"Ҷ�ӣ�"
*/
public class PrintNameVisitor implements Visitor {
	public void visitComposite(Composite composite) {
		//���ʵ���϶��������
		
		composite.setName("�ڵ㣺"+composite.getName());
		
		//��������������������ô�������Щ���������
		if(composite.getChildComponents()!=null){
			//�����ǰ������Ӷ�����
			for(Component c : composite.getChildComponents()){
				//�ݹ����ÿ���Ӷ���
				c.accept(this);
			}
		}	
		
//		System.out.println("�ڵ㣺"+composite.getName());
	}
	public void visitLeaf(Leaf leaf) {
		leaf.setName("Ҷ�ӣ�"+leaf.getName());
		//���ʵ�Ҷ�Ӷ��������		
//		System.out.println("Ҷ�ӣ�"+leaf.getName());
	}
}
