package van.cons.scholarship.service;

import van.cons.scholarship.entity.AntiMalpractice;
import van.cons.scholarship.entity.User;

import java.util.Date;
import java.util.List;

// IAntiMalpracticeService interface defines the contract for anti-malpractice-related operations.
public interface IAntiMalpracticeService {
    /**
     * Retrieve a list of detected malpractices for a specific user.
     *
     * @param user The user for which detected malpractices are to be retrieved.
     * @return A list of AntiMalpractice objects associated with the given user.
     */
    List<AntiMalpractice> getDetectedMalpracticesByUser(User user);

    /**
     * Retrieve a list of malpractices by the date they were detected.
     *
     * @param dateDetected The date when malpractices were detected.
     * @return A list of AntiMalpractice objects detected on the specified date.
     */
    List<AntiMalpractice> getMalpracticesByDateDetected(Date dateDetected);
}