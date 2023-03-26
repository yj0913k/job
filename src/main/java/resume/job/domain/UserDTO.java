package resume.job.domain;

import lombok.Data;
import org.springframework.web.multipart.MultipartFile;

@Data
public class UserDTO {
    private String username;
    private String password;
    private MultipartFile profileImage;

    public UserDTO(User user) {
    }
}
