package parttern.singleton.example7;
import java.util.*;
/**
 * Java�л���Ļ���ʵ��ʾ��
 */
public class JavaCache {
	/**
	 * �������ݵ������������Map�Ƿ�����ʣ�ֱ�Ӹ���Key�Ϳ��Ի�ȡValue��
	 * keyѡ��String��Ϊ�˼򵥣�������ʾ
	 */
	private Map<String,Object> map = new HashMap<String,Object>();
	/**
	 * �ӻ����л�ȡֵ
	 * @param key ����ʱ���keyֵ
	 * @return key��Ӧ��Valueֵ
	 */
	public Object getValue(String key){
		//�ȴӻ�������ȡֵ
		Object obj = map.get(key);
		//�жϻ��������Ƿ���ֵ
		if(obj == null){
			//���û�У���ô��ȥ��ȡ��Ӧ�����ݣ������ȡ���ݿ�����ļ�
			//����ֻ����ʾ������ֱ��д���ٵ�ֵ
			obj = key+",value";
			//�ѻ�ȡ��ֵ���ûص���������
			map.put(key, obj);
		}
		//�����ֵ�ˣ���ֱ�ӷ���ʹ��
		return obj;
	}
	
	//1:����һ����Ż������ݵ�����
	
	//2���ӻ����л�ȡ���ݵ�����
	
	//2.1���ȴӻ�������ȡֵ
	//2.2���жϻ��������Ƿ���ֵ
	//2.3�������ֵ�ˣ���ֱ��ʹ�����ֵ
	//2.4�����û�У���ô��ȥ��ȡ��Ӧ�����ݣ������Ǵ�����Ӧ�Ķ���
	//2.4.1���ѻ�ȡ��ֵ���ûص���������
	
	//web���� Scope===���������ݵĻ��淶Χ
	//<jsp:useBean name="aa" class="cn.javass.AModel" scope="request">
//	Object obj = request.getAttribute("aa");
//	AModel am = null;
//	if(obj==null){
//		am = new AModel();
//		request.setAttribute("aa",am);
//	}else{
//		am = (AModel)obj
//	}
	
	
}
