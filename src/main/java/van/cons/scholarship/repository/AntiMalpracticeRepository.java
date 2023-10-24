package van.cons.scholarship.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import van.cons.scholarship.entity.AntiMalpractice;
import van.cons.scholarship.entity.User;

import java.util.Date;
import java.util.List;

public interface AntiMalpracticeRepository extends JpaRepository<AntiMalpractice, Long> {

    // Fetch detected malpractices by user
    List<AntiMalpractice> findByUser(User user);

    // Fetch malpractices by date detected
    List<AntiMalpractice> findByDateDetected(Date dateDetected);
}