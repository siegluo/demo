package parttern.mediator.example2;
/**
 * �Կ��࣬һ��ͬ����
 */
public class VideoCard extends Colleague{
	public VideoCard(Mediator mediator) {
		super(mediator);
	}
	
	/**
	 * ��ʾ��Ƶ����
	 * @param data ����ʾ������
	 */
	public void showData(String data){
		System.out.println("�����ۿ����ǣ�"+data);
	}	
}
