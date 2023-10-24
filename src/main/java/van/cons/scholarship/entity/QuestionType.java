package van.cons.scholarship.entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "QUESTION_TYPES")
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class QuestionType {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long questionTypeID;
    private String typeName;

    @OneToMany(mappedBy = "questionType")
    private List<Question> questions;

}
