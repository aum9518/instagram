package instagram.service;

import instagram.model.User;

public interface UserService {
    String addNewUser(User user);

    User userUpdateById(Long id, String nickName, String password, String photo);

    User searchByName(String nickName);

    User sortByAge();

    User filter();
}
