package van.cons.scholarship.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import van.cons.scholarship.entity.Answer;
import van.cons.scholarship.entity.Question;
import van.cons.scholarship.repository.AnswerRepository;

import java.util.List;

@Service
public class AnswerService implements IAnswerService {
    private final AnswerRepository answerRepository;

    @Autowired
    public AnswerService(AnswerRepository answerRepository) {
        this.answerRepository = answerRepository;
    }

    @Override
    public List<Answer> getAnswersForQuestion(Question question) {
        // Retrieve a list of answers for a specific question.
        return answerRepository.findByQuestion(question);
    }
}
