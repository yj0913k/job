package resume.job.repository;

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

    public void registerResume(ResumeDTO resumeDTO) {
        Resume resume = new Resume();
        resume.setName(resumeDTO.getName());
        resume.setPhone(resumeDTO.getPhone());
        resume.setTelephone(resumeDTO.getTelephone());
        resume.setAddress(resumeDTO.getAddress());
        resume.setEmail(resumeDTO.getEmail());
        resume.setYear(resumeDTO.getYear());
        resume.setIntern(resumeDTO.getIntern());
        resume.setDate1(resumeDTO.getDate1());
        resume.setDate2(resumeDTO.getDate2());
        resume.setSchool(resumeDTO.getSchool());
        resume.setDepartment(resumeDTO.getDepartment());
        resume.setCertificate(resumeDTO.getCertificate());

        repository.save(resume);
    }
}
