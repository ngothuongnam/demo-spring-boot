package com.repositories;

import com.connect.JDBCUtil;
import com.entity.User;
import org.springframework.stereotype.Repository;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

@Repository
public class UserRepository {
    public User getUserByID(User user) throws SQLException {
        User u = null;
        try {
            Connection connection = JDBCUtil.getConnection("jdbc:mySQL://localhost:3306/quanlysinhvien", "root", "root");
            String query = "select * from user where id = ?;";
            PreparedStatement ps = connection.prepareStatement(query);
            ps.setInt(1, user.getId());
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                int id = rs.getInt("id");
                String name = rs.getString("name");
                String email = rs.getString("email");
                String phone = rs.getString("phone");
                String avatar = rs.getString("avatar");
                String password = rs.getString("password");
                u = new User(id, name, email, phone, avatar, password);
            }
            JDBCUtil.closeConnection(connection);
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return u;
    }
}
