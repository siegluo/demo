package parttern.mediator.example2;
/**
 * �����࣬һ��ͬ����
 */
public class SoundCard extends Colleague{
	public SoundCard(Mediator mediator) {
		super(mediator);
	}
	
	/**
	 * ������Ƶ���ݷ�������
	 * @param data ��������������
	 */
	public void soundData(String data){
		System.out.println("��������"+data);
	}
	
}
