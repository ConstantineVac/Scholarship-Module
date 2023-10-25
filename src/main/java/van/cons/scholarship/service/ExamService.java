package van.cons.scholarship.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import van.cons.scholarship.entity.Exam;
import van.cons.scholarship.entity.Question;
import van.cons.scholarship.repository.ExamRepository;

import java.util.Date;
import java.util.List;

@Service
public class ExamService implements IExamService {
    private final ExamRepository examRepository;

    @Autowired
    public ExamService(ExamRepository examRepository) {
        this.examRepository = examRepository;
    }

    @Override
    public List<Exam> getExamsByName(String name) {
        // Retrieve a list of exams with a specific name.
        return examRepository.findByName(name);
    }

    @Override
    public List<Exam> getExamsByDate(Date date) {
        // Retrieve a list of exams based on a specific date.
        return examRepository.findByDate(date);
    }

    @Override
    public List<Exam> getExamsByQuestion(Question question) {
        // Retrieve a list of exams that contain a specific question.
        return examRepository.findByQuestions(question);
    }
}
