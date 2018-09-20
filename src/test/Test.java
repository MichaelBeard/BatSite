package test;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import springwork.dao.ComicsDAO;

import springwork.model.Comics;




public class Test {

	public static void main(String[] args) throws SQLException {
		ComicsDAO comicDAO = new ComicsDAO();
		Comics comics = new Comics();
		List<Comics>listOfComics = new ArrayList<Comics>();
		listOfComics = comicDAO.getallComics();
		listOfComics.add(comics);
		
		for(Comics c : listOfComics) {
			System.out.println(c.getComicName());
			
		}
	}
}
