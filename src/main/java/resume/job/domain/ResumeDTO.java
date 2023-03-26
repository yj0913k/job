package resume.job.domain;

import lombok.Getter;
import lombok.Setter;

import java.time.LocalDate;

@Getter
@Setter
public class ResumeDTO {

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

    public ResumeDTO() {
    }

    public ResumeDTO(Long id, String name, Long phone, Long telephone, String address, String email, Long year, String intern, LocalDate date1, LocalDate date2, String school, String department, String certificate) {
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