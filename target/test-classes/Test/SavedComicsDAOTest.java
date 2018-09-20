package test;

import static org.junit.Assert.*;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import org.junit.Test;

import springwork.dao.SavedComicsDAO;
import springwork.model.SavedComics;

public class SavedComicsDAOTest {

	@Test
	public void getAllComicsTest() throws SQLException {
		SavedComicsDAO comicsDAO = new SavedComicsDAO();

		List<SavedComics> listofComics = new ArrayList<SavedComics>();

		listofComics = comicsDAO.getallComics();
		for (SavedComics s : listofComics) {
			System.out.println(s.getComicIssue() + " " + s.getComicName() + " " + s.getComicPrice());
		}
	}

}