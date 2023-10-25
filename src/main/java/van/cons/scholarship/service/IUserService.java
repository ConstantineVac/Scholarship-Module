package van.cons.scholarship.service;

import van.cons.scholarship.entity.User;
import van.cons.scholarship.entity.UserRole;

import java.util.List;

// IUserService interface defines the contract for user-related operations.
public interface IUserService {
    /**
     * Check if a user with the given username and password exists.
     *
     * @param username The username of the user.
     * @param password The password of the user.
     * @return true if the user with the provided username and password exists, false otherwise.
     */
    boolean isUserValid(String username, String password);

    /**
     * Check if a user with the given username exists.
     *
     * @param username The username to check for existence.
     * @return true if a user with the provided username exists, false otherwise.
     */
    boolean usernameExists(String username);

    /**
     * Retrieve a user by their username.
     *
     * @param username The username of the user to retrieve.
     * @return The User object with the provided username, or null if not found.
     */
    User getUserByUsername(String username);

    /**
     * Retrieve a user by their username and password.
     *
     * @param username The username of the user.
     * @param password The password of the user.
     * @return The User object with the provided username and password, or null if not found.
     */
    User findByUsernameAndPassword(String username, String password);

    /**
     * Retrieve a user by their username.
     *
     * @param username The username of the user.
     * @return The User object with the provided username, or null if not found.
     */
    User findByUsername(String username);

    /**
     * Check if a user with the given username exists in a specific user role.
     *
     * @param username  The username to check for existence.
     * @param userRole  The user role to filter by.
     * @return true if a user with the provided username and role exists, false otherwise.
     */
    boolean usernameExistsInRole(String username, UserRole userRole);

    /**
     * Find all users with a specific user role.
     *
     * @param userRole The user role to filter by.
     * @return A list of User objects with the specified user role.
     */
    List<User> findUsersByRole(UserRole userRole);
}

