package instagram.database;

import instagram.model.User;

import java.util.List;

public class Database {
    private List<User>users;

    public List<User> getUsers() {
        return users;
    }

    public void setUsers(List<User> users) {
        this.users = users;
    }

    public Database(List<User> users) {
        this.users = users;
    }
}
