package pl.chat.server.db.sql;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import pl.chat.server.data.SignInData;
import pl.chat.server.data.User;
import pl.chat.server.profile.DatabaseParams;

public class DatabaseSQL implements IDatabaseSQL
{

	private final Logger logger = LoggerFactory.getLogger(DatabaseSQL.class);
	
	private Connection conn;
	private Statement stat;
	
	public DatabaseSQL()
	{
		try
		{
			Class.forName(DatabaseParams.SQLITE_DRIVER.getId());
		}
		catch (ClassNotFoundException e)
		{
			logger.error(e.getMessage());
			e.printStackTrace();
		}
	}
	
	public void insertNewUser(
			User user
	) 
	{
		openConnection();
		try
		{
			PreparedStatement pStat = conn.prepareStatement(
					ChatServerSQliteQueries.INSERT_NEW_USER.getId()
			);
			pStat.setString(1, user.getLogin());
			pStat.setString(2, user.getEmail());
			pStat.setInt(3, user.getAge());
			pStat.setInt(4, user.getGender().getId());
			pStat.setString(5, user.getPassword());
			pStat.execute();
		}
		catch(SQLException e)
		{
			logger.error(e.getSQLState());
			logger.error(e.getMessage());
			e.printStackTrace();
			System.out.println(
				e.getMessage()
			);
		}
		closeConnection();
	}
	
	public boolean signInValidation(
			final SignInData signInData
	)
	{
		openConnection();
		boolean output = false;
		try
		{
			PreparedStatement pStat = conn.prepareStatement(
					ChatServerSQliteQueries.SELECT_USER.getId()
			);
			pStat.setString(1, signInData.getLogin());
			pStat.setString(2, signInData.getPassword());
			ResultSet rs = pStat.executeQuery();
			output = rs.next();
		}
		catch(SQLException e)
		{
			logger.error(e.getSQLState());
			logger.error(e.getMessage());
			e.printStackTrace();
			System.out.println(
				e.getMessage()
			);
		}
		closeConnection();
		return output;
	}
	
	private void openConnection()
	{
		try
		{
			conn = DriverManager.getConnection(DatabaseParams.SQLITE_PATH.getId());
			stat = conn.createStatement();
		}
		catch (SQLException e)
		{
			logger.error(e.getMessage());
			e.printStackTrace();
		}
	}
	
	private void closeConnection()
	{
		try
		{
			conn.close();
		}
		catch (SQLException e)
		{
			logger.error(e.getSQLState());
			logger.error(e.getMessage());
			e.printStackTrace();
		}
	}

	
}
