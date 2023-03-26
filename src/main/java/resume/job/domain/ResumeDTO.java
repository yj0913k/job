package resume.job.domain;

import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
public class ResumeDTO {

    private Long id;

    private String name;
    private List<ImageUploadFile> imageFiles;
    private Long phone;
    private Long telephone;
    private String address;
    private String email;
    private Long year;
    private String intern;
    private String school;
    private String department;
    private String certificate;

    public ResumeDTO() {
    }

    public ResumeDTO(Long id, String name, List<ImageUploadFile> imageFiles, Long phone, Long telephone, String address, String email, Long year, String intern, String school, String department, String certificate) {
        this.id = id;
        this.name = name;
        this.imageFiles = imageFiles;
        this.phone = phone;
        this.telephone = telephone;
        this.address = address;
        this.email = email;
        this.year = year;
        this.intern = intern;
        this.school = school;
        this.department = department;
        this.certificate = certificate;
    }
}
