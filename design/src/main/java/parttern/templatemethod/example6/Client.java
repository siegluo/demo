package parttern.templatemethod.example6;

import java.util.Collection;
import java.util.Iterator;

public class Client {
	public static void main(String[] args) {
		UserJDBC uj = new UserJDBC();
		//����������
		UserModel um1 = new UserModel();
		um1.setUuid("u1");
		um1.setName("����1");
		um1.setAge(22);		
//		uj.create(um1);		
		
		UserModel um2 = new UserModel();
		um2.setUuid("u2");
		um2.setName("����1");
		um2.setAge(25);		
//		uj.create(um2);
		
		UserModel um3 = new UserModel();
		um3.setUuid("u3");
		um3.setName("����1");
		um3.setAge(32);		
//		uj.create(um3);
		
		//�����޸�
		um3.setName("���屻����");
		um3.setAge(35);
//		uj.update(um3);
		
		//���Բ�ѯ
		UserQueryModel uqm = new UserQueryModel();
		uqm.setName("��");
		uqm.setAge(25);
		uqm.setAge2(36);
		Collection<UserModel> col = uj.getByCondition(uqm);
		for(UserModel tempUm : col){
			System.out.println(tempUm);
		}
	}
}
