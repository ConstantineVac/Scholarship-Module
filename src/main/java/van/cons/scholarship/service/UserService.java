package van.cons.scholarship.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import van.cons.scholarship.entity.User;
import van.cons.scholarship.entity.UserRole;
import van.cons.scholarship.repository.UserRepository;

import java.util.List;

// UserService implements IUserService and provides user-related operations.
@Service
public class UserService implements IUserService {
    private final UserRepository userRepository;

    // Constructor-based injection to inject UserRepository.
    @Autowired
    public UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @Override
    public boolean isUserValid(String username, String password) {
        // Check if a user with the given username and password exists.
        return userRepository.isUserValid(username, password);
    }

    @Override
    public boolean usernameExists(String username) {
        // Check if a user with the given username exists.
        return userRepository.usernameExists(username);
    }

    @Override
    public User getUserByUsername(String username) {
        // Retrieve a user by their username.
        return userRepository.getUserByUsername(username);
    }

    @Override
    public User findByUsernameAndPassword(String username, String password) {
        // Retrieve a user by their username and password.
        return userRepository.findByUsernameAndPassword(username, password);
    }

    @Override
    public User findByUsername(String username) {
        // Retrieve a user by their username.
        return userRepository.findByUsername(username);
    }

    @Override
    public boolean usernameExistsInRole(String username, UserRole userRole) {
        // Check if a user with the given username exists in a specific user role.
        return userRepository.usernameExistsInRole(username, userRole);
    }

    @Override
    public List<User> findUsersByRole(UserRole userRole) {
        // Find all users with a specific user role.
        return userRepository.findUsersByRole(userRole);
    }
}
