package parttern.observer.example3;
/**
 * �����Ķ��ߣ�Ϊ�˼򵥾�����һ������
 */
public class Reader implements Observer{
	/**
	 * ���ߵ�����
	 */
	private String name;

	public void update(String content) {
		//���ǲ����Ƶķ�ʽ
		System.out.println(name+"�յ���ֽ�ˣ��Ķ��ȡ���ģ�� ������==="+content);
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
}
