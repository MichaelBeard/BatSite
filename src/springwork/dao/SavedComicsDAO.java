package springwork.dao;

import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import springwork.model.SavedComics;
import springwork.utils.OracleQueries;


public class SavedComicsDAO {

	public List<SavedComics> getallComics() throws SQLException {
		SavedComics comic = null;
		Connection conn = null;
		PreparedStatement stmt = null;
		ResultSet result = null;
		List<SavedComics> listOfComics = new ArrayList<SavedComics>();

		try {
			conn = OracleConnection.getConnection();
			stmt = conn.prepareStatement(OracleQueries.GETALLSAVEDCOMICS);
			result = stmt.executeQuery();

			while (result != null && result.next()) {
				comic = new SavedComics();
				comic.setComicPrice(result.getDouble(1));
				comic.setComicName(result.getString(2));
				comic.setComicIssue(result.getInt(3));
				comic.setSavedComic(result.getBoolean(4));
				listOfComics.add(comic);
			}
		} catch (ClassNotFoundException | IOException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			result.close();
			if (stmt != null) {
				stmt.close();

			}
			if (conn != null) {
				conn.close();
			}
		}
		return listOfComics;
	}

	public SavedComics getComicsByName(String comicName) throws SQLException {
		SavedComics comic = new SavedComics();
		Connection conn = null;
		PreparedStatement stmt = null;
		ResultSet result = null;

		try {
			conn = OracleConnection.getConnection();
			stmt = conn.prepareStatement(OracleQueries.GETALLCOMICSBYNAME);
			stmt.setString(1, comicName);
			result = stmt.executeQuery();
			if (result != null && result.next()) {
				comic.setComicPrice(result.getDouble(1));
				comic.setComicName(result.getString(2));

			}
		} catch (ClassNotFoundException | IOException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			result.close();
			if (stmt != null) {
				stmt.close();

			}
			if (conn != null) {
				conn.close();
			}
		}

		return comic;
	}
	
	public Integer addSavedComics(SavedComics comic) {
		Integer confirmed = null;
		Connection conn = null;
		PreparedStatement stmt = null;
		ResultSet result = null;
		
		String []comic_issue = {"comic_issue"};
		try {
			conn = OracleConnection.getConnection();
			stmt = conn.prepareStatement(OracleQueries.addSAVEDCOMIC,comic_issue);
			stmt.setInt(1, comic.getComicIssue());
			stmt.setString(2, comic.getComicName());
			stmt.setDouble(3, comic.getComicPrice());
			stmt.executeUpdate();
			result = stmt.getGeneratedKeys();
			if(result != null && result.next()) {
				confirmed = result.getInt(1);
			}
		} catch (ClassNotFoundException | IOException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return confirmed;
	}
	
	public boolean deleteComic(Integer Issue) {
		Connection conn = null;
		PreparedStatement stmt = null;
		boolean isDeleted = false;
		
		try {
			conn = OracleConnection.getConnection();
			stmt = conn.prepareStatement(OracleQueries.deleteSAVEDCOMIC);
			stmt.setInt(1, Issue);
			isDeleted = stmt.executeUpdate() >0;
			
		} catch (ClassNotFoundException | IOException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return isDeleted;
		
	}

}