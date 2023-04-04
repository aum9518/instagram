package instagram.service.serviceImpl;

import instagram.database.Database;
import instagram.model.User;
import instagram.service.UserService;

import java.util.Comparator;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class UserServiceImpl implements UserService {
    private Database database;

    public Database getDatabase() {
        return database;
    }

    public void setDatabase(Database database) {
        this.database = database;
    }

    @Override
    public String addNewUser(User user) {
        database.getUsers().add(user);
        return "Successfully added: "+ user;
    }

    @Override
    public User userUpdateById(Long id, String nickName, String password, String photo) {
        List<User>list=database.getUsers().stream().filter(x-> x.getId()==id)
                .toList();
        list.stream().filter(x-> x.getId()==id)
                .toList().get(0).setPassword(password);
        list.stream().filter(x-> x.getId()==id)
                .toList().get(0).setPhoto(photo);
        return list.get(0);
    }

    @Override
    public User searchByName(String nickName) {
       List<User>list= database.getUsers().stream().filter(x->x.getNickName().equals(nickName))
                .toList();
        return list.get(0);
    }

    @Override
    public User sortByAge() {
        System.out.println("1.Ascending\n2.Descending");
        int num = new Scanner(System.in).nextInt();
        switch (num){
            case 1 ->{
                List<User>ascending = database.getUsers().stream().sorted(Comparator.comparing(User::getAge)).toList();
                for (User a:ascending) {
                    return a;
                }
            }
            case 2->{
                List<User>descending = database.getUsers().stream().sorted(Comparator.comparing(User::getAge).reversed()).toList();
                for (User b:descending) {
                    return b;
                }
            }
            default -> System.err.println("Error");
        }
        return null;
    }

    @Override
    public User filter() {
        System.out.println("1.ascending\n2.descending");
        int num = new Scanner(System.in).nextInt();
        switch (num){
            case 1 ->{
                List<User>list = database.getUsers().stream().filter(x->x.getAge()>20).toList();
                for (User a :list) {
                    return a;
                }
            }
            case 2 ->{
                List<User>list1= database.getUsers().stream().filter(x->x.getAge()<20).toList();
                for (User b :list1) {
                    return b;
                }
            }
        }
        return null;
    }
}
