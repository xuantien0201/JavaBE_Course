package tien.repository;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import tien.config.MysqlConnection;
import tien.model.Role;

public class RoleRepository {
	public List<Role> getRoleBy() {
		List<Role> list = new ArrayList<Role>();
		// Mở kết nối CSDL
		Connection con = MysqlConnection.getConnection();
		// khai báo câu lệnh
		String query = "Select * from role";
		try {
			// thêm câu lệnh vào PreparedStatement để tránh lỗi SQL Injection
			PreparedStatement pre = con.prepareStatement(query);
			// set giá trị cho các tham số

			// dùng ResultSet để nhận kết quả trả về
			ResultSet resultSet = pre.executeQuery();
			// duyệt kết quả trả về và thêm vào listư
			// next() trả về true nếu còn dòng tiếp theo
			while(resultSet.next()) {
				Role role = new Role();
				role.setId(resultSet.getInt("id"));
				role.setRole_name(resultSet.getString("role_name"));
				role.setDescription(resultSet.getString("description"));
				list.add(role);
			}
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}finally {
			try {
				if(con != null) {
				con.close();
				}
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
		return list;
	}
}
