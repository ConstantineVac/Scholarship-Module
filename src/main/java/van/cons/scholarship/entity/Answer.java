package van.cons.scholarship.entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Table(name = "ANSWERS")
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class Answer {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long answerID;
    private String answerText;
    private String answerFeedback;
    private Boolean correctnessFlag;

    @ManyToOne
    @JoinColumn(name = "question_id")
    private Question question;
}
