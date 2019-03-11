package implementation;

public class UserRepository implements IUsersRepository {

    Logger logger;

    public User createUser(String name) {
        logger.log("Create user : " + name);
        return new User(name);
    }

    public void setLogger(Logger logger) {
        this.logger=logger;
    }
}
