package parttern.state.example5;

public class NormalVoteState implements VoteState{
	public void vote(String user, String voteItem, VoteManager voteManager) {
		//����ͶƱ
		//��¼��ͶƱ��¼��
		voteManager.getMapVote().put(user, voteItem);
		System.out.println("��ϲ��ͶƱ�ɹ�");
		
		//����ͶƱ��ɣ�ά����һ��״̬��ͬһ������ͶƱ���ظ���
		voteManager.getMapState().put(user, new RepeatVoteState());
	}
}
