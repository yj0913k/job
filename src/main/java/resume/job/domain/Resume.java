package resume.job.domain;


import lombok.Data;

import javax.persistence.*;
import java.time.LocalDate;

@Entity
@Data
@Table(name = "resume")
public class Resume {

    @Id
    @GeneratedValue
    @Column(name = "resume_id")
    private Long id;

    private String name;
    private Long phone;
    private Long telephone;
    private String address;
    private String email;
    private Long year;
    private String intern;
    private LocalDate date1;
    private LocalDate date2;
    private String school;
    private String department;
    private String certificate;

    public Resume() {

    }

    public Resume(Long id, String name, Long phone, Long telephone, String address, String email, Long year, String intern, LocalDate date1, LocalDate date2, String school, String department, String certificate) {
        this.id = id;
        this.name = name;
        this.phone = phone;
        this.telephone = telephone;
        this.address = address;
        this.email = email;
        this.year = year;
        this.intern = intern;
        this.date1 = date1;
        this.date2 = date2;
        this.school = school;
        this.department = department;
        this.certificate = certificate;
    }


}
