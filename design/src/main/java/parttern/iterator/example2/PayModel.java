package parttern.iterator.example2;
/**
 * ��������ģ�Ͷ���
 */
public class PayModel {
	/**
	 * ֧�����ʵ���Ա
	 */
	private String userName;
	/**
	 * ֧���Ĺ�������
	 */
	private double pay;
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public double getPay() {
		return pay;
	}
	public void setPay(double pay) {
		this.pay = pay;
	}
	public String toString(){
		return "userName="+userName+",pay="+pay;
	}
}