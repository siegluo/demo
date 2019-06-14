package parttern.abstractfactory.example6.business;


import parttern.abstractfactory.example6.dao.MyDaoFactory;
import parttern.abstractfactory.example6.dao.dao.DAOFactory;
import parttern.abstractfactory.example6.dao.impl.OrderDetailDAO;
import parttern.abstractfactory.example6.dao.impl.OrderMainDAO;

public class BusinessObject {
	public static void main(String[] args) {
		//����DAO�ĳ��󹤳�
		DAOFactory df = MyDaoFactory.createDAOFactory(2);
		
		//ͨ�����󹤳�����ȡ��Ҫ��DAO�ӿ�
		OrderMainDAO mainDAO = df.createOrderMainDAO();
		OrderDetailDAO detailDAO = df.createOrderDetailDAO();
		//����DAO��������ݴ洢�Ĺ���
		mainDAO.saveOrderMain();
		detailDAO.saveOrderDetail();
	}
}
