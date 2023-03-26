package resume.job.repository;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import resume.job.domain.Resume;
import resume.job.domain.ResumeDTO;

@Service
@Transactional
public class ResumeService {

    @Autowired
    private ResumeRepository repository;

    public Resume registerResume(ResumeDTO resumeDTO) {
        Resume resume = new Resume();
        resume.setName(resumeDTO.getName());
        resume.setImageFiles(resumeDTO.getImageFiles().toString());
        resume.setPhone(resumeDTO.getPhone());
        resume.setTelephone(resumeDTO.getTelephone());
        resume.setAddress(resumeDTO.getAddress());
        resume.setEmail(resumeDTO.getEmail());
        resume.setYear(resumeDTO.getYear());
        resume.setIntern(resumeDTO.getIntern());
        resume.setSchool(resumeDTO.getSchool());
        resume.setDepartment(resumeDTO.getDepartment());
        resume.setCertificate(resumeDTO.getCertificate());

        try {
            repository.save(resume);
        } catch(Exception e) {
            Logger logger = LoggerFactory.getLogger(ResumeService.class);
            logger.error("Error saving data: {}", e.getMessage());
            throw e; // 예외 다시 던지기
        }
        return resume;
    }
}
