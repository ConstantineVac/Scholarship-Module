package van.cons.scholarship.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import van.cons.scholarship.entity.Exam;
import van.cons.scholarship.entity.PerformanceAnalytics;
import van.cons.scholarship.entity.User;

import java.sql.Time;
import java.util.List;

public interface PerformanceAnalyticsRepository extends JpaRepository<PerformanceAnalytics, Long> {

    // Fetch performance analytics by user
    List<PerformanceAnalytics> findByUser(User user);

    // Fetch performance analytics by exam
    List<PerformanceAnalytics> findByExam(Exam exam);

    // Custom query to get average time taken for a specific exam by all users
    @Query("SELECT AVG(pa.timeTaken) FROM PerformanceAnalytics pa WHERE pa.exam = :exam")
    Time findAverageTimeTakenForExam(@Param("exam") Exam exam);

    // Custom query to get average score for a specific exam by all users
    @Query("SELECT AVG(pa.score) FROM PerformanceAnalytics pa WHERE pa.exam = :exam")
    Double findAverageScoreForExam(@Param("exam") Exam exam);
}