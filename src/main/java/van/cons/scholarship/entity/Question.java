package van.cons.scholarship.entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "QUESTIONS")
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class Question {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long questionID;

    @Enumerated(EnumType.STRING) // Map the ENUM as a string
    private QuestionStatus questionStatus; // Assuming QuestionStatus is the ENUM

    private String questionText;
    private Double defaultMark;
    private String questionName;
    private String generalFeedback;
    private Integer versionNumber;
    private String metadata;
    private String sourceAttribution;

    @ManyToOne
    @JoinColumn(name = "category_id")
    private Category category;

    @ManyToOne
    @JoinColumn(name = "subcategory_id")
    private Subcategory subcategory;

    @ManyToOne
    @JoinColumn(name = "question_type_id")
    private QuestionType questionType;

    @OneToMany(mappedBy = "question")
    private List<Answer> answers;

}