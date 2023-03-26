package resume.job.repository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;
import resume.job.domain.UserDTO;
import resume.job.domain.User;


import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.UUID;

@Service
public class UserService {

    @Autowired
    private UserRepository userRepository;

    public UserDTO createUser(UserDTO userDTO) throws IOException {
        User user = new User();
        user.setUsername(userDTO.getUsername());
        user.setPassword(userDTO.getPassword());

        if (userDTO.getProfileImage() != null) {
            String profileImagePath = saveProfileImage(userDTO.getProfileImage());
            user.setProfileImagePath(profileImagePath);
        }

        userRepository.save(user);
        return new UserDTO(user);
    }

    private String saveProfileImage(MultipartFile profileImage) throws IOException {
        String originalFilename = profileImage.getOriginalFilename();
        assert originalFilename != null;
        String fileExtension = originalFilename.substring(originalFilename.lastIndexOf("."));
        String newFilename = UUID.randomUUID().toString() + fileExtension;
        byte[] bytes = profileImage.getBytes();
        Path directoryPath = Paths.get("profile-images");
        if (!Files.exists(directoryPath)) {
            Files.createDirectories(directoryPath);
        }
        Path filePath = directoryPath.resolve(newFilename);
        Files.write(filePath, bytes);
        return filePath.toString();
    }

}
