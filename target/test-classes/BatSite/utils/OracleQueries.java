package springwork.utils;

public class OracleQueries {

	public static final String REGISTERCUSTOMERS = "insert into customer " + "(user_name, password, email) "
			+ "values (?,?,?)";

	public final static String DELTECUSTOMER = "delete from customer " + "where customer_id = ?";
	public final static String GETCUSTOMERBYEMAIL = " select  * from customer " + " where email = ?";
	public final static String UPDATECUSTOMER = "update customer " + "set user_name = ?, " + " password = ?, "
			+ " email = ? " + "where customer_id=?";
	public final static String GETCUSTOMERBYID = "select customer.user_name, customer.password, customer.email from customer "
			+ " where customer_id = ? ";

	public final static String GETALLCOMICS = "select comic_issue, comic_price, comic_name " + "from comics ";

	public final static String GETALLCOMICSBYPRICE = "select comic_issue, comic_price, comic_name " + "from comics "
			+ " where comics.comic_price = ?";

	public final static String GETALLCOMICSBYNAME = "select comic_issue, comic_price, comic_name " + "from comics"
			+ " where comics.name  = ?";

	public final static String GETALLSAVEDCOMICS = "select comic_issue, comic_price, comic_name " + "from savedcomics ";

	public static final String addSAVEDCOMIC = "insert into " + "  savedcomics " + "set " + "  comic_issue = ?, "
			+ "  comic_price = ?, " + "  comic_name = ?, ";

	public static final String deleteSAVEDCOMIC = " delete from savedcomics " + " where comic_name = ?";

	public final static String GETCOMICSBYISSUE = "SELECT comic_name FROM comics " + "WHERE comic_issue = ?";
	public static final String UPDATEPASSWORD = "update customer" + "set password = ? " + "where customer_id = ?";
	public static final String GETALLCHARACTERS = "SELECT * FROM characters";
	public static final String GETCHARACTERBYNAME = "SELECT character FROM characters " + "WHERE character_name = ?";
}
