package FunctionLayer;

import DBAccess.DataAccessObject;

/**
 * The purpose of LogicFacade is to...
 *
 * @author kasper
 */
public class LogicFacade {

    public static User login(String email, String password) throws LoginSampleException {
        return DataAccessObject.login(email, password);
    }

    public static User createUser(String email, String password) throws LoginSampleException {
        User user = new User(email, password, "customer");
        DataAccessObject.createUser(user);
        return user;
    }

}
