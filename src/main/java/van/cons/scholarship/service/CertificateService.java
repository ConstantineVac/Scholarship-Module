package van.cons.scholarship.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import van.cons.scholarship.entity.Certificate;
import van.cons.scholarship.entity.Exam;
import van.cons.scholarship.entity.User;
import van.cons.scholarship.repository.CertificateRepository;

import java.util.Date;
import java.util.List;

@Service
public class CertificateService implements ICertificateService {
    private final CertificateRepository certificateRepository;

    @Autowired
    public CertificateService(CertificateRepository certificateRepository) {
        this.certificateRepository = certificateRepository;
    }

    @Override
    public List<Certificate> getCertificatesByDateIssued(Date dateIssued) {
        // Retrieve a list of certificates issued on a specific date.
        return certificateRepository.findByDateIssued(dateIssued);
    }

    @Override
    public List<Certificate> getCertificatesByUser(User user) {
        // Retrieve a list of certificates for a specific user.
        return certificateRepository.findByUser(user);
    }

    @Override
    public List<Certificate> getCertificatesByExam(Exam exam) {
        // Retrieve a list of certificates for a specific exam.
        return certificateRepository.findByExam(exam);
    }
}
