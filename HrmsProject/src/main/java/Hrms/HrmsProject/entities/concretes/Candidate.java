package Hrms.HrmsProject.entities.concretes;


import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonManagedReference;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.format.annotation.DateTimeFormat;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Size;
import java.util.Date;
import java.util.List;

@Entity
@Table(name = "candidates")
@PrimaryKeyJoinColumn(name = "user_id")
@Data
@AllArgsConstructor
@JsonIgnoreProperties({"hibernateLazyInitializer", "handler", "CvTables","cvTables"})
@NoArgsConstructor
public class Candidate extends User {
    @Column(name = "first_name", nullable = false)
    @NotBlank()
    @NotEmpty(message = "Adı Giriniz Lütfen")
    private String firstName;

    @Column(name = "last_name", nullable = false)
    @NotBlank()
    @NotEmpty(message = "Soyadı Giriniz Lütfen")
    private String lastName;

    @Column(name = "identity_number", nullable = false)
    @NotEmpty(message = "TC kimlik Numarası Giriniz Lütfen")
    @NotBlank()
    @Size(min = 11,max = 11,message = "Lütfen 11 Haneli Tc Kimlik Numararınızı Giriniz")
    private String identityNumber;

    @Column(name = "date_of_birth", nullable = false)
    @NotBlank()
    @NotEmpty(message = "Doğum Tarihi Giriniz Lütfen")
    @DateTimeFormat(iso = DateTimeFormat.ISO.DATE)
    @JsonFormat(pattern = "dd/MM/yyyy")
    private Date dateOfBirth;

    @JsonManagedReference
    @OneToMany(mappedBy = "candidate")
    private List<CvTable> cvTables;



}