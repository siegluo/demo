package parttern.abstractfactory.example6.dao;


import parttern.abstractfactory.example6.dao.dao.DAOFactory;
import parttern.abstractfactory.example6.dao.impl.RdbDAOFactory;
import parttern.abstractfactory.example6.dao.impl.XmlDAOFactory;

public class MyDaoFactory {
	public static DAOFactory createDAOFactory(int type){
		if(type==1){
			return new RdbDAOFactory();
		}else if(type==2){
			return new XmlDAOFactory();
		}
		return null;
	}
}
