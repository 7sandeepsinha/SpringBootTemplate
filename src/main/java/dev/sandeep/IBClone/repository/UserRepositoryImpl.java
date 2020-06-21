package dev.sandeep.IBClone.repository;

import dev.sandeep.IBClone.beans.User;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.UUID;

@Repository("inMemory")
public class UserRepositoryImpl implements UserRepository{
    private List<User> userDatabase = new ArrayList<>();

    @Override
    public User createUser(User user) {
        User newUser = new User(user.getName(),user.getGender());
        userDatabase.add(newUser);
        return newUser;
    }

    @Override
    public User getUserById(UUID id) {
        return userDatabase.stream().filter(user -> user.getUuid().equals(id)).findFirst().get();
    }
}
