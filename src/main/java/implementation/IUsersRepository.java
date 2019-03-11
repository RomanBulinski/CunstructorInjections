package implementation;

public interface IUsersRepository {

    User createUser(String name);
    void setLogger(Logger logger);

}
