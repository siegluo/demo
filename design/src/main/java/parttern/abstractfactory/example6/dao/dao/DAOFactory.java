package parttern.abstractfactory.example6.dao.dao;

import cn.javass.dp.abstractfactory.example6.dao.impl.OrderDetailDAO;
import cn.javass.dp.abstractfactory.example6.dao.impl.OrderMainDAO;

/**
 * ���󹤳����������������Ӽ�¼��Ӧ��DAO����
 */
public interface DAOFactory {
	/**
	 * ������������¼��Ӧ��DAO����
	 * @return ��������¼��Ӧ��DAO����
	 */
	public  OrderMainDAO createOrderMainDAO();
	/**
	 * ���������Ӽ�¼��Ӧ��DAO����
	 * @return �����Ӽ�¼��Ӧ��DAO����
	 */
	public  OrderDetailDAO createOrderDetailDAO();
}
