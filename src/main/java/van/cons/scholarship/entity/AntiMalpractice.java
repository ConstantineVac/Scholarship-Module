package van.cons.scholarship.entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.sql.Date;

@Entity
@Table(name = "ANTI_MALPRACTICES")
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class AntiMalpractice {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long malpracticeID;
    private String detectedIssue;
    private Date dateDetected;

    @ManyToOne
    @JoinColumn(name = "user_id")
    private User user;

    // Constructors, getters, setters
}
