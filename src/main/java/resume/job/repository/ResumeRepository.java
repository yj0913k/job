package resume.job.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import resume.job.domain.Resume;

@Repository
public interface ResumeRepository extends JpaRepository<Resume, Long> {


}
