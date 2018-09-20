package Test;


import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.junit.Assert.assertThat;

import java.sql.SQLException;

import org.junit.Before;
import org.junit.Test;

import springwork.dao.CustomerDAO;
import springwork.model.Customer;

public class CustomerDAOTest {
	
	
	@Test
	public void gettingCustomerByIDTest() throws SQLException {
		Integer id = 1;
		CustomerDAO customerDAO = new CustomerDAO();
		Customer customer = new Customer();
		String actualEmail= "mike@gmail.com";
		customer =customerDAO.getCustomerByID(id);
		
		assertThat(actualEmail, equalTo(customer.getEmail()));
	}

	@Test
	public void loginCustomerTest() throws SQLException {
		CustomerDAO customerDAO = new CustomerDAO();
		Customer customer = new Customer();
		customer =customerDAO.login("mike@gmail.com", "mike123");
		String email = "mike@gmail.com";
		String password = "mike123";
		String userName ="mike";
		
		assertThat(userName, equalTo(customer.getUserName()));
		assertThat(email, equalTo(customer.getEmail()));
		assertThat(password, equalTo(customer.getPassword()));
	}

	@Test
	public void validateCustomerEmailTest() throws SQLException{
		CustomerDAO customerDAO = new CustomerDAO();
		Customer customer = new Customer();
		customer.setEmail("mike@gmail.com");
		String email = "mike@gmail.com";
		boolean isValid = false;
		isValid = customerDAO.validateUserEmail(customer.getEmail(), email);
		assertThat(true, equals(isValid));
		
	}
	
	@Test
	public void validateCustomerUserNameTest() throws SQLException{
		CustomerDAO customerDAO = new CustomerDAO();
		Customer customer = new Customer();
		customer.setPassword("mike123");
		String user = "mike123";
		boolean isValid = false;
		isValid = customerDAO.validateUserPass(customer.getPassword(), user);
		assertThat(true, equalTo(isValid));
		
	}
}