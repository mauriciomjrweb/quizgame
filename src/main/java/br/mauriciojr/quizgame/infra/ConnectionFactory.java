package br.mauriciojr.quizgame.infra;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionFactory {

	public static Connection getConnection() {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			return DriverManager.getConnection("jdbc:mysql://localhost:3306/quizgamedb", "root", "1234");
		} catch (SQLException | ClassNotFoundException ex) {
			throw new RuntimeException();
		}

	}

}
