package tien.repository;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import tien.config.MysqlConnection;
import tien.model.User;

public class UserRepository {
	public List<User> getUserByUsername(String username, String password) {
		List<User> list = new ArrayList<User>();
		// Mở kết nối CSDL
		Connection con = MysqlConnection.getConnection();
		// khai báo câu lệnh
		String query = "Select * from users where username = ? and password = ?";
		try {
			// thêm câu lệnh vào PreparedStatement để tránh lỗi SQL Injection
			PreparedStatement pre = con.prepareStatement(query);
			// set giá trị cho các tham số
			pre.setString(1, username);
			pre.setString(2, password);
			// dùng ResultSet để nhận kết quả trả về
			ResultSet resultSet = pre.executeQuery();
			// duyệt kết quả trả về và thêm vào listư
			// next() trả về true nếu còn dòng tiếp theo
			while(resultSet.next()) {
				User user = new User();
				user.setId(resultSet.getInt("id"));
				user.setFullName(resultSet.getString("fullname"));
				user.setAge(resultSet.getInt("age"));
				user.setUsername(resultSet.getString("username"));
				
				list.add(user);
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
