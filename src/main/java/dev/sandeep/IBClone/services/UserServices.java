package dev.sandeep.IBClone.services;

import dev.sandeep.IBClone.beans.User;
import dev.sandeep.IBClone.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import java.util.Optional;
import java.util.UUID;

@Service
public class UserServices {

    @Autowired
    private @Qualifier("MySQLImpl") UserRepository userRepository;

    public User createUser(User user){
        return userRepository.createUser(user);
    }

    public User getUser(UUID id){
        return userRepository.getUserById(id);
    }
}
