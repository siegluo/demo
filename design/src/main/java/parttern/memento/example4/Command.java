package parttern.memento.example4;
/**
 * ����һ������Ľӿ�
 */
public interface Command {
	/**
	 * ִ������
	 */
	public void execute();
	/**
	 * ��������ָ�������¼�����¼��״̬
	 * @param m ����¼����
	 */
	public void undo(Memento m);
	/**
	 * ��������ָ�������¼�����¼��״̬
	 * @param m ����¼����
	 */
	public void redo(Memento m);
	/**
	 * ��������ԭ���������״̬�ı���¼����
	 * @return �����õı���¼����
	 */
	public Memento createMemento();
}
