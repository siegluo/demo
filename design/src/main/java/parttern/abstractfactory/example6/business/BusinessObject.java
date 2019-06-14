package parttern.abstractfactory.example6.business;


import parttern.abstractfactory.example6.dao.MyDaoFactory;
import parttern.abstractfactory.example6.dao.dao.DAOFactory;
import parttern.abstractfactory.example6.dao.impl.OrderDetailDAO;
import parttern.abstractfactory.example6.dao.impl.OrderMainDAO;

public class BusinessObject {
	public static void main(String[] args) {
		//创建DAO的抽象工厂
		DAOFactory df = MyDaoFactory.createDAOFactory(2);
		
		//通过抽象工厂来获取需要的DAO接口
		OrderMainDAO mainDAO = df.createOrderMainDAO();
		OrderDetailDAO detailDAO = df.createOrderDetailDAO();
		//调用DAO来完成数据存储的功能
		mainDAO.saveOrderMain();
		detailDAO.saveOrderDetail();
	}
}
