package van.cons.scholarship.service;

import van.cons.scholarship.entity.Exam;
import van.cons.scholarship.entity.PerformanceAnalytics;
import van.cons.scholarship.entity.User;

import java.sql.Time;
import java.util.List;

// IPerformanceAnalyticsService interface defines the contract for performance analytics-related operations.
public interface IPerformanceAnalyticsService {
    /**
     * Retrieve a list of performance analytics for a specific user.
     *
     * @param user The user for which performance analytics are to be retrieved.
     * @return A list of PerformanceAnalytics objects associated with the given user.
     */
    List<PerformanceAnalytics> getPerformanceAnalyticsByUser(User user);

    /**
     * Retrieve a list of performance analytics for a specific exam.
     *
     * @param exam The exam for which performance analytics are to be retrieved.
     * @return A list of PerformanceAnalytics objects associated with the given exam.
     */
    List<PerformanceAnalytics> getPerformanceAnalyticsByExam(Exam exam);

    /**
     * Calculate the average time taken for a specific exam by all users.
     *
     * @param exam The exam for which the average time taken is calculated.
     * @return The average time taken by all users for the specified exam.
     */
    Time calculateAverageTimeTakenForExam(Exam exam);

    /**
     * Calculate the average score for a specific exam by all users.
     *
     * @param exam The exam for which the average score is calculated.
     * @return The average score achieved by all users for the specified exam.
     */
    Double calculateAverageScoreForExam(Exam exam);
}