package parttern.strategy.example3;

/**
 * �����Ķ���ͨ�������һ������Ĳ��Զ���
 */
public class Context {
	/**
	 * ����һ������Ĳ��Զ���
	 */
	private Strategy strategy;
	/**
	 * ���췽��������һ������Ĳ��Զ���
	 * @param aStrategy ����Ĳ��Զ���
	 */
	public Context(Strategy aStrategy) {
		this.strategy = aStrategy;
	}
	/**
	 * �����ĶԿͻ����ṩ�Ĳ����ӿڣ������в����ͷ���ֵ
	 */
	public void contextInterface() {
		//ͨ����ת������Ĳ��Զ�������㷨����
		strategy.algorithmInterface();
	}

}

