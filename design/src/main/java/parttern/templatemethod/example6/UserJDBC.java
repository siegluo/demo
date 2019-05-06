package parttern.templatemethod.example6;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Collection;
/**
 * �����ʵ���û��������ɾ�Ĳ鹦��
 */
public class UserJDBC extends JDBCTemplate{	
	protected String getMainSql(int type) {
		//���ݲ������ͣ�������Ӧ������sql���
		String sql = "";
		if(type == TYPE_CREATE){
			sql = "insert into tbl_user values(?,?,?)";
		}else if(type == TYPE_DELETE){
			sql = "delete from tbl_user where uuid=?";
		}else if(type == TYPE_UPDATE){
			sql = "update tbl_user set name=?,age=? where uuid=?";
		}else if(type == TYPE_CONDITION){
			sql = "select * from tbl_user where 1=1 ";
		}
		return sql;
	}
	protected void setUpdateSqlValue(int type, PreparedStatement pstmt,
			Object obj) throws Exception{
		//��������ɾ���Ĳ�����sql��"?"��Ӧ��ֵ
		if(type == TYPE_CREATE){
			this.setCreateValue(pstmt, (UserModel)obj);
		}else if(type == TYPE_DELETE){
			this.setDeleteValue(pstmt, (UserModel)obj);
		}else if(type == TYPE_UPDATE){
			this.setUpdateValue(pstmt, (UserModel)obj);
		}
	}
	protected Object rs2Object(ResultSet rs)throws Exception{
		UserModel um = new UserModel();
		String uuid = rs.getString("uuid");
		String name = rs.getString("name");
		int age = rs.getInt("age");
		
		um.setAge(age);
		um.setName(name);
		um.setUuid(uuid);
		
		return um;
	}
	protected String prepareQuerySql(String sql,Object qm){
		UserQueryModel uqm = (UserQueryModel)qm;
		StringBuffer buffer = new StringBuffer();
		buffer.append(sql);
		//����ƥ��
		if(uqm.getUuid()!=null && uqm.getUuid().trim().length()>0){
			buffer.append(" and uuid=? ");
		}
		//ģ��ƥ��
		if(uqm.getName()!=null && uqm.getName().trim().length()>0){
			buffer.append(" and name like ? ");
		}
		//����ƥ��
		if(uqm.getAge() > 0){
			buffer.append(" and age >=? ");
		}
		if(uqm.getAge2() > 0){
			buffer.append(" and age <=? ");
		}
		return buffer.toString();
	}
	protected void setQuerySqlValue(PreparedStatement pstmt,Object qm)throws Exception{
		UserQueryModel uqm = (UserQueryModel)qm;
		int count = 1;
		if(uqm.getUuid()!=null && uqm.getUuid().trim().length()>0){
			pstmt.setString(count, uqm.getUuid());
			count++;
		}
		if(uqm.getName()!=null && uqm.getName().trim().length()>0){
			pstmt.setString(count, "%"+uqm.getName()+"%");
			count++;
		}
		if(uqm.getAge() > 0){
			pstmt.setInt(count, uqm.getAge());
			count++;
		}
		if(uqm.getAge2() > 0){
			pstmt.setInt(count, uqm.getAge2());
			count++;
		}
	}
	private void setCreateValue(PreparedStatement pstmt,UserModel um)throws Exception{
		pstmt.setString(1, um.getUuid());
		pstmt.setString(2, um.getName());
		pstmt.setInt(3, um.getAge());
	}
	private void setUpdateValue(PreparedStatement pstmt,UserModel um)throws Exception{
		pstmt.setString(1, um.getName());
		pstmt.setInt(2, um.getAge());
		pstmt.setString(3, um.getUuid());
	}
	private void setDeleteValue(PreparedStatement pstmt,UserModel um)throws Exception{
		pstmt.setString(1, um.getUuid());
	}
}
