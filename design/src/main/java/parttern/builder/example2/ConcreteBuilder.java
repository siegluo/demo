package parttern.builder.example2;
/**
 * ����Ĺ�����ʵ�ֶ���
 */
public class ConcreteBuilder implements Builder {
	/**
	 * ���������չ����Ĳ�Ʒ����
	 */
	private Product resultProduct;
	/**
	 * ��ȡ���������չ����Ĳ�Ʒ����
	 * @return ���������չ����Ĳ�Ʒ����
	 */
	public Product getResult() {
		return resultProduct;
	}
	public void buildPart() {
		//����ĳ�������Ĺ��ܴ���
	}
}