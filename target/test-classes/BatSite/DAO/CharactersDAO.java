package springwork.dao;

import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;


import springwork.model.Characters;
import springwork.utils.OracleQueries;


public class CharactersDAO {

	public List<Characters> getallCharacters() throws SQLException {
		Characters name = null;
		Connection conn = null;
		PreparedStatement stmt = null;
		ResultSet result = null;
		List<Characters> listOfCharacters = new ArrayList<Characters>();

		try {
			conn = OracleConnection.getConnection();
			stmt = conn.prepareStatement(OracleQueries.GETALLCHARACTERS);
			result = stmt.executeQuery();

			while (result != null && result.next()) {
				name = new Characters();
				name.setCharacterName(result.getString(1));
				name.setCharacterDescription(result.getString(2));
				listOfCharacters.add(name);
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
		return listOfCharacters;
	}

	public Characters getCharactersByName(String characterName) throws SQLException {
		Characters comic = new Characters();
		Connection conn = null;
		PreparedStatement stmt = null;
		ResultSet result = null;

		try {
			conn = OracleConnection.getConnection();
			stmt = conn.prepareStatement(OracleQueries.GETCHARACTERBYNAME);
			stmt.setString(1, characterName);
			result = stmt.executeQuery();
			if (result != null && result.next()) {
				comic.setCharacterName(result.getString(1));

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