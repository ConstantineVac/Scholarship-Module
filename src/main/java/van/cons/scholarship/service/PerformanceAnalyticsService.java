package van.cons.scholarship.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import van.cons.scholarship.entity.Exam;
import van.cons.scholarship.entity.PerformanceAnalytics;
import van.cons.scholarship.entity.User;
import van.cons.scholarship.repository.PerformanceAnalyticsRepository;

import java.sql.Time;
import java.util.List;

@Service
public class PerformanceAnalyticsService implements IPerformanceAnalyticsService {
    private final PerformanceAnalyticsRepository performanceAnalyticsRepository;

    @Autowired
    public PerformanceAnalyticsService(PerformanceAnalyticsRepository performanceAnalyticsRepository) {
        this.performanceAnalyticsRepository = performanceAnalyticsRepository;
    }

    @Override
    public List<PerformanceAnalytics> getPerformanceAnalyticsByUser(User user) {
        // Retrieve a list of performance analytics for a specific user.
        return performanceAnalyticsRepository.findByUser(user);
    }

    @Override
    public List<PerformanceAnalytics> getPerformanceAnalyticsByExam(Exam exam) {
        // Retrieve a list of performance analytics for a specific exam.
        return performanceAnalyticsRepository.findByExam(exam);
    }

    @Override
    public Time calculateAverageTimeTakenForExam(Exam exam) {
        // Calculate the average time taken for a specific exam by all users.
        return performanceAnalyticsRepository.findAverageTimeTakenForExam(exam);
    }

    @Override
    public Double calculateAverageScoreForExam(Exam exam) {
        // Calculate the average score for a specific exam by all users.
        return performanceAnalyticsRepository.findAverageScoreForExam(exam);
    }
}