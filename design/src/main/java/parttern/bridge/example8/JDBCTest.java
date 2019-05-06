package parttern.bridge.example8;

import java.sql.*;
import java.sql.DriverManager;

public class JDBCTest {
	public static void main(String[] args) throws Exception {
		String sql = "����Ҫ������sql���";
		// 1��װ������
		Class.forName("����������");
		// 2����������
		Connection conn = DriverManager.getConnection("�������ݿ�����URL", "�û���",
				"����");

		// 3������statement������preparedStatement
		PreparedStatement pstmt = conn.prepareStatement(sql);

		// 4��ִ��sql������ǲ�ѯ���ٻ�ȡResultSet
		ResultSet rs = pstmt.executeQuery(sql);

		// 5��ѭ����ResultSet�а�ֵȡ��������װ�����ݶ�����ȥ
		while (rs.next()) {
			// ȡֵʾ�⣬������ȡֵ
			String uuid = rs.getString("uuid");
			// ȡֵʾ�⣬������ȡֵ
			int age = rs.getInt(2);
		}
		//6���ر�
		rs.close();
		pstmt.close();
		conn.close();
	}
}
