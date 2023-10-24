package van.cons.scholarship.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import van.cons.scholarship.entity.User;
import van.cons.scholarship.entity.UserRole;

import java.util.List;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {
    @Query("SELECT u FROM User u WHERE u.username = :username AND u.password = :password")
    boolean isUserValid(@Param("username") String username, @Param("password") String password);

    @Query("SELECT COUNT(u) > 0 FROM User u WHERE u.username = ?1")
    boolean usernameExists(String username);

    @Query("SELECT u FROM User u WHERE u.username = ?1")
    User getUserByUsername(String username);

    @Query("SELECT u FROM User u WHERE u.username = :username AND u.password = :password")
    User findByUsernameAndPassword(@Param("username") String username, @Param("password") String password);

    @Query("SELECT u FROM User u WHERE u.username = :username")
    User findByUsername(String username);

    // Custom method to check if a username exists in a specific role
    @Query("SELECT COUNT(u) > 0 FROM User u WHERE u.username = :username AND u.userRole = :userRole")
    boolean usernameExistsInRole(@Param("username") String username, @Param("userRole") UserRole userRole);

    // Custom method to find users by role and other criteria
    @Query("SELECT u FROM User u WHERE u.userRole = :userRole")
    List<User> findUsersByRole(@Param("userRole") UserRole userRole);
}

