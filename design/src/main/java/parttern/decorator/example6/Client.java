package parttern.decorator.example6;

public class Client {
	public static void main(String[] args) {
		//�õ�ҵ��ӿ�,���װ����
		GoodsSaleEbi ebi = new LogDecorator(new CheckDecorator(new GoodsSaleEbo()));
		//׼����������
		SaleModel saleModel = new SaleModel();
		saleModel.setGoods("Moto�ֻ�");
		saleModel.setSaleNum(2);
		//����ҵ����
		ebi.sale("����","������", saleModel);
		ebi.sale("����","������", saleModel);
	}
}
