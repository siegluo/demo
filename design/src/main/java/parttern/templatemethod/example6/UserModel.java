package parttern.templatemethod.example6;
/**
 * �����û�������ģ�ͣ�VO
 */
public class UserModel {
	private String uuid; //����ƥ��
	private String name; //ģ��ƥ��
	private int age; //����ƥ��
	public String getUuid() {
		return uuid;
	}
	public void setUuid(String uuid) {
		this.uuid = uuid;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}	
	public String toString(){
		return "uuid="+uuid+",name="+name+",age="+age;
	}
}
