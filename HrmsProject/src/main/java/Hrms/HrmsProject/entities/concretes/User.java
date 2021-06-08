package Hrms.HrmsProject.entities.concretes;

import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.Table;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

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

	private int id;

	@Column(name = "email",nullable = false)
	@Email
	@NotBlank

	private String email;

	@Column(name = "password",nullable = false)
	private String password;

	@Column(name = "password_repeat",nullable = false)
	private String passwordRepeat;

	/*
	 * @Column(name = "created_at", columnDefinition = "Date defult CURRENT_DATE")
	 * private LocalDate createdAt = LocalDate.now();
	 * 
	 * @Column(name = "is_active", columnDefinition = "boolean default true")
	 * private boolean isActive = true;
	 * 
	 * @Column(name = "is_deleted", columnDefinition = "boolean default false")
	 * private boolean isDeleted = false;
	 */
	


}
