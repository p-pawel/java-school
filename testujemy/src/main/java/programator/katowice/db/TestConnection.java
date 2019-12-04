package programator.katowice.db;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Properties;

public class TestConnection {

	public static void main(String[] args) throws SQLException {

		Properties props = new Properties();
		props.setProperty("user", "postgres");
		props.setProperty("password", "postgres");

		try (Connection c = DriverManager.getConnection("jdbc:postgresql://localhost:5432/postgres", props)) {

			System.out.println(c);

			Statement statement = c.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_READ_ONLY);
			ResultSet resultSet = statement.executeQuery("select zzz from destinations");

			System.out.println(resultSet);

			while (resultSet.next()) {
				int id = resultSet.getInt("id");
				String name = resultSet.getString(2);

				System.out.println(id + " " + name);
			}

			resultSet.previous();
			resultSet.previous();
			resultSet.previous();
			while (resultSet.next()) {
				int id = resultSet.getInt("id");
				String name = resultSet.getString(2);

				System.out.println(id + " " + name);
			}


			PreparedStatement p = c.prepareStatement("select * from destinations where name like ?");
			p.setString(1, "Mars");
			ResultSet rs2 = p.executeQuery();

			System.out.println(p.toString());
		} catch (SQLException e) {
			System.out.println(e.getMessage());
		}

	}
}
