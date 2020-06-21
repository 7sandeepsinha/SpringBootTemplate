package dev.sandeep.IBClone.repository;

import dev.sandeep.IBClone.beans.User;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

@Repository("MySQLImpl")
public class UserRepositoryMySQLImpl implements UserRepository{
    private List<User> userDatabase = new ArrayList<>();

    @Override
    public User createUser(User user) {
        System.out.println("Inside mysql implementation");
        User newUser = new User(user.getName(),user.getGender());
        userDatabase.add(newUser);
        return newUser;
    }

    @Override
    public User getUserById(UUID id) {
        System.out.println("Inside mysql implementation");
        return userDatabase.stream().filter(user -> user.getUuid().equals(id)).findFirst().get();
    }
}
