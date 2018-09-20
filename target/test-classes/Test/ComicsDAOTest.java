package test;
import static org.junit.Assert.*;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import org.junit.Test;

import springwork.dao.ComicsDAO;
import springwork.model.Comics;

public class ComicsDAOTest {
	
	@Test
	public void getAllComicsTest() throws SQLException {
		ComicsDAO comicsDAO = new ComicsDAO();

		List<Comics> listofComics = new ArrayList<Comics> ();
		
		listofComics = comicsDAO.getallComics();
		for(Comics c  : listofComics) {
		System.out.println(c.getComicIssue()+" "+c.getComicName()+" "+ c.getComicPrice());
		}
	}

}
