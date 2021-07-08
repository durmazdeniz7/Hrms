package Hrms.HrmsProject.entities.concretes;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "users")
@Inheritance(strategy = InheritanceType.JOINED)
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id",nullable = false)
    private  int id;

    @Column(name = "email")
    @Email(message = "Lütfen email formatında giriniz")
    @NotBlank
    private  String email;

    @Column(name = "password")
    @NotBlank
    @Size(min = 8,max = 32)
    private  String password;

    @Column(name = "password_repeat")
    @NotBlank
    @Size(min = 8,max = 32)
    private  String passwordRepeat;

    @Column(name = "email_valid",nullable = false)
    private boolean emailValid;

}
