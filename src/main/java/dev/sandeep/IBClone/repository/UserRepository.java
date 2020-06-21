package dev.sandeep.IBClone.repository;

import dev.sandeep.IBClone.beans.User;

import java.util.Optional;
import java.util.UUID;


public interface UserRepository {
    User createUser(User user);
    User getUserById(UUID id);
}
