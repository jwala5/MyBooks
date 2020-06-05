package dao;

import model.Details;
import model.User;

public interface UserDaoInterface {
	int signup(User user) throws ClassNotFoundException;
	boolean loginUser(User user) throws ClassNotFoundException;
	void addDetails(Details details )  throws ClassNotFoundException;

}
