package parttern.abstractfactory.example6.dao.impl;

import cn.javass.dp.abstractfactory.example6.dao.dao.DAOFactory;

public class RdbDAOFactory implements DAOFactory{
	public OrderDetailDAO createOrderDetailDAO() {
		return new RdbDetailDAOImpl();
	}
	public OrderMainDAO createOrderMainDAO() {
		return new RdbMainDAOImpl();
	}
}
