package parttern.abstractfactory.example4;

/**
 * ����չ�ĳ��󹤳��Ľӿ�
 */
public interface AbstractFactory {
	/**
	 * һ��ͨ�õĴ�����Ʒ����ķ�����Ϊ�˼򵥣�ֱ�ӷ���Object
	 * Ҳ����Ϊ���б������Ĳ�Ʒ����һ�������Ľӿ�
	 * @param type ���崴���Ĳ�Ʒ���ͱ�ʶ
	 * @return �������Ĳ�Ʒ����
	 */
	public Object createProduct(int type);
}