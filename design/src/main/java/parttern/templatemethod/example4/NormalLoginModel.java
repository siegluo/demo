package parttern.templatemethod.example4;
/**
 * ��װ���е�¼��������Ҫ�����ݣ��ڹ������ݵĻ����ϣ�
 * ��Ӿ���ģ����Ҫ������
 */
public class NormalLoginModel extends LoginModel{
	/**
	 * ������֤����
	 */
	private String question;
	/**
	 * ������֤��
	 */
	private String answer;
	public String getQuestion() {
		return question;
	}
	public void setQuestion(String question) {
		this.question = question;
	}
	public String getAnswer() {
		return answer;
	}
	public void setAnswer(String answer) {
		this.answer = answer;
	}
	
}
