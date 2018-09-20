package springwork.dao;

import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import springwork.model.Comics;
import springwork.utils.OracleQueries;

public class ComicsDAO {

	public List<Comics> getallComics() throws SQLException {
		Comics comic = null;
		Connection conn = null;
		PreparedStatement stmt = null;
		ResultSet result = null;
		List<Comics> listOfComics = new ArrayList<Comics>();

		try {
			conn = OracleConnection.getConnection();
			stmt = conn.prepareStatement(OracleQueries.GETALLCOMICS);
			result = stmt.executeQuery();

			while (result != null && result.next()) {
				comic = new Comics();
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

	public Comics getComicsByName(String comicName) throws SQLException {
		Comics comic = new Comics();
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

}