package implementation;

public class UserRepository implements IUsersRepository {

    Logger logger;

    public UserRepository(Logger logger, String localisation) {
        this.logger = logger;
        logger.log("Lokalizacja repozytorium" + localisation );
    }

    public User createUser(String name) {
        logger.log("Create user : " + name);
        return new User(name);
    }


}
