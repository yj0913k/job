package resume.job.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import resume.job.domain.User;

@Repository
public interface UserRepository extends JpaRepository<User,Long> {

}
