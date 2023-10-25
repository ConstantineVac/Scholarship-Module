package van.cons.scholarship.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import van.cons.scholarship.entity.AntiMalpractice;
import van.cons.scholarship.entity.User;
import van.cons.scholarship.repository.AntiMalpracticeRepository;

import java.util.Date;
import java.util.List;

@Service
public class AntiMalpracticeService implements IAntiMalpracticeService {
    private final AntiMalpracticeRepository antiMalpracticeRepository;

    @Autowired
    public AntiMalpracticeService(AntiMalpracticeRepository antiMalpracticeRepository) {
        this.antiMalpracticeRepository = antiMalpracticeRepository;
    }

    @Override
    public List<AntiMalpractice> getDetectedMalpracticesByUser(User user) {
        // Retrieve a list of detected malpractices for a specific user.
        return antiMalpracticeRepository.findByUser(user);
    }

    @Override
    public List<AntiMalpractice> getMalpracticesByDateDetected(Date dateDetected) {
        // Retrieve a list of malpractices by the date they were detected.
        return antiMalpracticeRepository.findByDateDetected(dateDetected);
    }
}
