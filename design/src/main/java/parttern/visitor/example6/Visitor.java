package parttern.visitor.example6;
/**
 * ������϶���ṹ�ķ����߽ӿ�
 */
public interface Visitor {
	/**
	 * ������϶����൱�ڸ���϶�����ӷ����ߵĹ���
	 * @param composite ��϶���
	 */
	public void visitComposite(Composite composite);
	/**
	 * ����Ҷ�Ӷ����൱�ڸ�Ҷ�Ӷ�����ӷ����ߵĹ���
	 * @param leaf Ҷ�Ӷ���
	 */
	public void visitLeaf(Leaf leaf);
}