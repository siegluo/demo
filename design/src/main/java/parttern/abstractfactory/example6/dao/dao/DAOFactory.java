package parttern.abstractfactory.example6.dao.dao;

import cn.javass.dp.abstractfactory.example6.dao.impl.OrderDetailDAO;
import cn.javass.dp.abstractfactory.example6.dao.impl.OrderMainDAO;

/**
 * 抽象工厂，创建订单主、子记录对应的DAO对象
 */
public interface DAOFactory {
	/**
	 * 创建订单主记录对应的DAO对象
	 * @return 订单主记录对应的DAO对象
	 */
	public  OrderMainDAO createOrderMainDAO();
	/**
	 * 创建订单子记录对应的DAO对象
	 * @return 订单子记录对应的DAO对象
	 */
	public  OrderDetailDAO createOrderDetailDAO();
}
