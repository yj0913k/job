package resume.job.domain;


import lombok.Data;

import javax.persistence.*;
import java.util.Date;
import java.util.List;

@Entity
@Data
@Table(name = "resume")
public class Resume {

    @Id
    @GeneratedValue
    @Column(name = "resume_id")
    private Long id;
    private String name;
    private String imageFiles;
    private Long phone;
    private Long telephone;
    private String address;
    private String email;
    private Long year;
    private String intern;
    private String school;
    private String department;
    private String certificate;

    public Resume() {

    }

    public Resume(Long id, String name, String imageFiles, Long phone, Long telephone, String address, String email, Long year, String intern, String school, String department, String certificate) {
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
