package van.cons.scholarship.service;

import van.cons.scholarship.entity.Certificate;
import van.cons.scholarship.entity.Exam;
import van.cons.scholarship.entity.User;

import java.util.Date;
import java.util.List;

// ICertificateService interface defines the contract for certificate-related operations.
public interface ICertificateService {
    /**
     * Retrieve a list of certificates issued on a specific date.
     *
     * @param dateIssued The date when certificates were issued.
     * @return A list of Certificate objects issued on the specified date.
     */
    List<Certificate> getCertificatesByDateIssued(Date dateIssued);

    /**
     * Retrieve a list of certificates for a specific user.
     *
     * @param user The user for which certificates are to be retrieved.
     * @return A list of Certificate objects associated with the given user.
     */
    List<Certificate> getCertificatesByUser(User user);

    /**
     * Retrieve a list of certificates for a specific exam.
     *
     * @param exam The exam for which certificates are to be retrieved.
     * @return A list of Certificate objects associated with the given exam.
     */
    List<Certificate> getCertificatesByExam(Exam exam);
}
