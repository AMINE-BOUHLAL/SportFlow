package com.example.sportflow.DAO;

import com.example.sportflow.Config.DbConfig;
import com.example.sportflow.Model.User;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class MemberDAO {

    public void creatMembre(User user) throws SQLException {
        String sql = "insert into users(nom,prenom,email,password,role) values(?,?,?,?,?)";
        Connection connection = DbConfig.getConnection();
        PreparedStatement preparedStatement = connection.prepareStatement(sql);

        preparedStatement.setString(1, user.getNom());
        preparedStatement.setString(2, User.getPrenom());
        preparedStatement.setString(3, user.getEmail());
        preparedStatement.setString(4, user.getPassword());
        preparedStatement.setString(5, user.getRole());
        preparedStatement.executeUpdate();

    }

}
