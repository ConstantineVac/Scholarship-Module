package van.cons.scholarship.entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "USERS")
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long userID;

    @Enumerated(EnumType.STRING) // Map the ENUM as a string
    private UserRole userRole; // Assuming UserRole is the ENUM

    private String username;
    private String password;

    @OneToMany(mappedBy = "user")
    private List<AntiMalpractice> antiMalpractices;

    @OneToMany(mappedBy = "user")
    private List<Certificate> certificates;

    @OneToMany(mappedBy = "user")
    private List<PerformanceAnalytics> performanceAnalytics;
}
