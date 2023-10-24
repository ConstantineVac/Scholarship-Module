package van.cons.scholarship.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import van.cons.scholarship.entity.Certificate;
import van.cons.scholarship.entity.Exam;
import van.cons.scholarship.entity.User;

import java.util.Date;
import java.util.List;

public interface CertificateRepository extends JpaRepository<Certificate, Long> {

    // Fetch certificates by date issued
    List<Certificate> findByDateIssued(Date dateIssued);

    // Fetch certificates by user
    List<Certificate> findByUser(User user);

    // Fetch certificates by exam
    List<Certificate> findByExam(Exam exam);
}