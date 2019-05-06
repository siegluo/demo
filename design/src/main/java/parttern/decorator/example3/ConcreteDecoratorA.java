package parttern.decorator.example3;

/**
 * װ�����ľ���ʵ�ֶ���������������ְ��
 */
public class ConcreteDecoratorA extends Decorator {
	public ConcreteDecoratorA(Component component) {
		super(component);
	}
	/**
	 * ��ӵ�״̬
	 */
	private String addedState;
	
	public String getAddedState() {
		return addedState;
	}

	public void setAddedState(String addedState) {
		this.addedState = addedState;
	}

	public void operation() {
		//���ø���ķ����������ڵ���ǰ��ִ��һЩ���Ӷ���
		//��������д����ʱ�򣬿���ʹ����ӵ�״̬
		System.out.println("begin---------->");
		super.operation();
		System.out.println("begin---------->");
	}
}

