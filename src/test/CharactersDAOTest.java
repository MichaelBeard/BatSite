package test;
import static org.junit.Assert.*;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import org.junit.Test;

import springwork.dao.CharactersDAO;
import springwork.model.Characters;

public class CharactersDAOTest {
	
	@Test
	public void getAllCharactersTest() throws SQLException {
		CharactersDAO charDAO = new CharactersDAO();

		List<Characters> listofCharacters = new ArrayList<Characters>();
		
		listofCharacters = charDAO.getallCharacters();
		for(Characters c  : listofCharacters) {
		System.out.println(c.getCharacterName()+" "+c.getCharacterDescription());
		}
	}

}